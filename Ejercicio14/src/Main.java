import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Ejercicio 14 (tiene nota):
	Estamos trabajando en Spotify y nuestro gerente de marketing nos solicito
	que generemos un programa para contabilizar la siguiente información
	de los artistas (a traves de la consola)
		- Nombre Artista
		- Genero
		- Cantidad de Reproducciones
		- Pais donde mas se escucha
	Agregar en base a esto:
		- Recaudacion monetaria
		- Proyeccion anual
	La recaudación monetaria y la proyección anual deben
	ser calculadas a traves del uso de Interfaces. 
		- Recaudación monetaria = Cantidad de reproducciones * 0.02
		- Proyeccion anual = recaudacion monetaria * 12 
	ACCIONES:
		- Convertir el proyecto en proyecto de Maven y
			colgarlo en Jenkins para realizar la generación del jar file. 
		- Generar un TXT con la información que genere el programa
	ENTREGABLES:
		- Captura de la consola de Jenkins con los comandos de Maven ejecutados
		- Link del repositorio en Github.
*/
public class Main {

	public static void main(String[] args) {
		List<Artista> artistas= new ArrayList<Artista>();
		Scanner sc = new Scanner(System.in);
		String nombre;
		int numReproducciones;
		String genero;
		String pais;
		System.out.print("Introduce la cantidad de artistas: ");
		int numArtistas = sc.nextInt();
		for(int i = 0; i < numArtistas; i++)
		{
			System.out.print("Introduce nombre del artista: ");
			nombre = sc.next();
			System.out.print("\nIntroduce el genero: ");
			genero = sc.next();
			System.out.print("\nIntroduce el numero de reproducciones: ");
			numReproducciones = sc.nextInt();
			System.out.print("\nIntroduce el pais donde mas se escucha: ");
			pais = sc.next();
			artistas.add(new Artista(nombre, genero, numReproducciones, pais));
			System.out.println("Artista añadido");
			System.out.println("============================================");
		}
		String contenidoFichero = "ARTISTAS:\n";
		
		for(int i = 0; i < numArtistas; i++) 
		{
			Artista a = artistas.get(i);
			double recMonetaria = a.calcularRecaudacionMonetaria(a.numReproducciones);
			contenidoFichero += "	Artista: " + a.nombre + "\n"
								+ "		Genero: " + a.genero + "\n"
								+ "		Numero de reproducciones: " + a.numReproducciones + "\n"
								+ "		Pais donde es mas escuchado: " + a.topPais + "\n"
								+ "		Recaudación monetaria: " + recMonetaria + "€\n"
								+ "		Proyección anual: " + a.proyeccionAnual(recMonetaria) + "€\n";
		}
		sc.close();
		String ruta = "..\\Ejercicio14\\src\\resultado.txt";
		try {
			File file = new File(ruta);
			if (!file.exists())
			{
				file.createNewFile();
				System.out.println("Archivo creado");
			}
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(contenidoFichero);
			bw.close();
		} catch (IOException e)
		{
			System.out.println("No se pudo crear el fichero");
			e.printStackTrace();
		}
	}
}
