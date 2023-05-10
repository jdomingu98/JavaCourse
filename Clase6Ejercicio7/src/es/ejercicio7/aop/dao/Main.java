package es.ejercicio7.aop.dao;

import java.util.Set;

/*
 * EJERCICIO 7:
	Generar un programa que aplique la programación orientada a Aspectos en el codigo, y que al momento de leer el fichero
		informe un mensaje por consola que indique que se esta por leer el fichero. Luego, mostrar la información del fichero
		en la consola quitando duplicados haciendo uso de la colección Set.
	ENTREGABLES:
		- Codigo del proyecto. 
 * */

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import es.ejercicio7.aop.ClienteDAO;
import es.ejercicio7.aop.Persona;
import es.ejercicio7.aop.Configuracion;

public class Main {

	public static void main(String[] args) {
		Set<Persona> personas;
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(Configuracion.class);
		ClienteDAO cliente = contexto.getBean("clienteDAO", ClienteDAO.class);
		personas = cliente.leerFicheroEInsertarDatos();
		for (Persona p : personas)
		{
			System.out.println("Nombre: " + p.nombre + "\nApellido: " + p.apellido + "\nEdad: " + p.edad + "\n");
		}
		contexto.close();

	}

}
