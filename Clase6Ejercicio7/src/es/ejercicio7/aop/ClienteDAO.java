package es.ejercicio7.aop;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Component;

@Component
public class ClienteDAO
{
	public Set<Persona> leerFicheroEInsertarDatos()
	{
		boolean esNombre = true, esApellido = false, esEdad = false;
		String nombre="", apellido="";
		Set<Persona> personas = new HashSet<Persona>();
		File file = new File("C:\\Users\\jadomingueza\\Desktop\\Java\\Clase6Ejercicio7\\src\\FICHERO_AOP.txt");
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String caracteres = "";
			while ((caracteres = br.readLine()) != null)
			{
				String[] div = caracteres.split(": ");
				if (esNombre)
				{
					nombre = div[1];
					esNombre = false;
					esApellido = true;
				}
				else if (esApellido)
				{
					apellido = div[1];
					esApellido = false;
					esEdad = true;
				}
				else if (esEdad)
				{
					personas.add(new Persona(nombre, apellido, div[1]));
					nombre = "";
					apellido = "";
					esEdad = false;
					esNombre = true;
				}
			}
			br.close();
			return personas;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
