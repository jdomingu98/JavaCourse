package es.ejercicio8.users;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

@Component
public class Persona {
	
	public String nombre;
	public String apellido;
	public LocalDate fechaNacimiento;
	
	public Persona(String nombre, String apellido, LocalDate fechaNacimiento)
	{
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
	}
	
}
