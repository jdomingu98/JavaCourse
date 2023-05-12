import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
 * Ejercicio Integrador 2:
 * 	- Jenkins con los pipelines
 * 	- Jenkins con Maven
 * 	- Jenkins con Github
 * 	- Jenkins con Eclipse
 * 
 * 	Desarrollar un proyecto en Java que lea del siguiente fichero "comida.txt" la
 * 	informacion de las recetas, en base a ella se debe calcular las siguientes funciones:
 * 		- Tiempo de cocción
 * 		- Calorias
 * 		- Tipo de comida (dulce/agria) como atributo de la receta
 *  ESTRUCTURA DEL PROGRAMA:
 *  	- Clases
 *  	- Herencia
 *  	- Interfaces
 *  	- Manejo de excepciones
 *  En base a esta informacion desarrollar un pipeline que busque el codigo de Github
 *  y en base a ello, informe lo generado por el programa de Java por la consola de
 *  Jenkins.
 *  
 *  ENTREGABLES:
 *  	- Captura de la consola de Jenkins mostrando la informacion
 *  	- Repositorio de Github con el codigo
 *  Tiempo de coccion:
 *  	Por cada ingrediente de la receta se le agrega 1 minuto de coccion
 *  Calorias: Por cada ingrediente se le suman 3 calorias
 *  
 *  	
 * */

public class Main {

	public static void main(String[] args) {
		List<Receta> recetas = new ArrayList<Receta>();
		String fileRoute = "..\\EjercicioIntegrador2\\src\\comida.txt";
		File file = new File(fileRoute);
		List<Ingrediente> ingredientesReceta = new ArrayList<Ingrediente>();
		String nombreReceta = "";
		String tipoComida = "Dulce";
		boolean ingredientes = false;
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String content = "";
			while ((content = br.readLine()) != null)
			{
				String[] div = content.split("%%");
				if (div[0].equals("Nombre de la receta:"))
					nombreReceta = div[1];
				else if (div[0].equals("Ingredientes:"))
					ingredientes = true;
				else if (div[0].equals("**"))
				{
					ingredientes = false;
					for(Ingrediente ir : ingredientesReceta)
					{
						if (ir.nombre.contains("Cebolla") || ir.nombre.contains("Ajo"))
							tipoComida = "Agrio";
					}
					recetas.add(new Receta(nombreReceta, tipoComida, ingredientesReceta));
					ingredientesReceta = new ArrayList<Ingrediente>();
				}
				else if (ingredientes)
				{
					if (div.length == 3 && (div[2].contains("g)") || div[2].contains("cc)")))
						ingredientesReceta.add(new Ingrediente(div[0], div[1], div[2].substring(0, div[2].length() - 1)));
					else if (div.length == 1)
						ingredientesReceta.add(new Ingrediente(div[0], "NODATA", "NODATA"));
					else if (div.length == 2 && div[1].contains("g"))
							ingredientesReceta.add(new Ingrediente(div[0], "NODATA", div[1]));
					else
						ingredientesReceta.add(new Ingrediente(div[0], div[1], "NODATA"));
				}
			}
			recetas.add(new Receta(nombreReceta, tipoComida, ingredientesReceta));
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
