package es.ejercicio8.register;

import java.util.Scanner;

import org.springframework.stereotype.Component;

import es.ejercicio8.users.Usuario;

@Component
public class Registro {
	
	public Usuario registroDeUsuarios(Scanner sc)
	{
		String nombre, apellido, nombreUsuario, email;
		int anyo, mes, dia;
			
		System.out.print("Nombre: ");
		nombre = sc.next();
		System.out.print("Apellido: ");
		apellido = sc.next();
		System.out.print("Año de nacimiento: ");
		anyo = sc.nextInt();
		System.out.print("Mes de nacimiento: ");
		mes = sc.nextInt();
		System.out.print("Dia de nacimiento: ");
		dia = sc.nextInt();
		System.out.print("Nombre de Usuario: ");
		nombreUsuario = sc.next();
		System.out.print("Email: ");
		email = sc.next();
		return new Usuario(nombre, apellido, anyo, mes, dia, nombreUsuario, email);
	}
}
