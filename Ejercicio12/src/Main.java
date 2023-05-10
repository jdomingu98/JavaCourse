import java.util.List;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*EJERCICIO 12
	Desarrollar un programa en Java que, a traves del uso de Interfaces,
	calcule la poblacion final de las siguientes ciudades:
		Ciudad Barcelona
			Poblacion parcial: 100000
		Ciudad Barcelona
			Poblacion parcial: 100000
		Ciudad Madrid
			Poblacion parcial: 1000000
		Ciudad Malaga
			Poblacion parcial: 50000
		Ciudad Sevilla
			Poblacion parcial: 80000
	La poblacion final es la poblacion parcial * 0.80
	Generar un jenkinsfile que informe por cada ciudad en un stage diferente
		la población final de cada una.
	Subir el proyecto a su repositorio en Github con el Jenkinsfile final.
	ENTREGABLE:
		- Captura de pantalla de Jenkins mostrando la información
		- Link del repositorio de Github.*/
public class Main {

	public static void main(String[] args) {
		List<Poblacion> pob = new ArrayList<Poblacion>();
		
		pob.add(new Poblacion("Barcelona", 100000));
		pob.add(new Poblacion("Barcelona", 100000));
		pob.add(new Poblacion("Madrid", 1000000));
		pob.add(new Poblacion("Malaga", 50000));
		pob.add(new Poblacion("Sevilla", 80000));
		
		String contenidoJenkinsFile =
				"pipeline{\n"
				+ "	agent any\n"
				+ "	stages{\n";
		int i = 1;
		for (Poblacion p: pob)
		{
			contenidoJenkinsFile += "		stage(\"Ciudad " + i + "\"){\n"
					+ "			steps{\n"
					+ "				println \"" + p.ciudad + ": " + p.calcularPoblacionFinal(p.poblacionParcial) + "\"\n"
					+ "			}\n";
			i++;
		}
		contenidoJenkinsFile += "	}\n}";
		
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("Jenkinsfile"));
			bw.write(contenidoJenkinsFile);
			bw.close();
			System.out.println("Se generó el Jenkinsfile");
		}catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
