package es.ejercicio8.main;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import es.ejercicio8.config.Config;
import es.ejercicio8.register.Registro;
import es.ejercicio8.users.Usuario;

/*
 * EJERCICIO 8 (TIENE NOTA):
 * 
 * Desarrollar un proyecto de tipo Maven basado en Java que implemente
 * 	el paradigma de "Programación Orientada a Objetos", el programa debe
 * 	cumplir con la siguiente estructura:
 * 		- El programa debe implementar Clases y herencia
 * 		- El programa debe poder permitir al usuario registrarse solicitandole
 * 			valores por consola: Nombre, Apellido, nombre de usuario y email,
 * 			fecha nacimiento
 *		- El programa debe calcular la edad de los usuarios
 *		- El programa debe implementar un método que se llame
 *			registroDeUsuarios() que almacene los usuarios.
 *
 * Clases: Persona y Usuario con sus respectivos atributos, donde Usuario
 *	hereda de Persona
 *	
 * AOP: Cada vez que se registre un usuario, se debe arrojar el nombre de la funcion
 *	que esta implementando dicho método y su latencia y además de esto,
 *	informar el computador (usando getProperty()) que esta ejecutando el programa.
 * Toda esta informacion se debe imprimir por pantalla
 * 
 * ENTREGABLES:
 * 	- Código del proyecto
 * 
 * */

public class Main {


	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Registro registro = context.getBean(Registro.class);
		Scanner sc = new Scanner(System.in);
		Usuario usr1 = registro.registroDeUsuarios(sc);
		System.out.println("Edad: " + usr1.edad);
		System.out.println("=============================================");
		Usuario usr2 = registro.registroDeUsuarios(sc);
		System.out.println("Edad: " + usr2.edad);
		System.out.println("=============================================");
		Usuario usr3 = registro.registroDeUsuarios(sc);
		System.out.println("Edad: " + usr3.edad);
		System.out.println("=============================================");
		sc.close();
		context.close();
		System.out.println("Usuarios registrados!!");
	}

}
