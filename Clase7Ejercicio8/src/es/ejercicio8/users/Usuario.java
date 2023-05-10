package es.ejercicio8.users;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

@Component
public class Usuario extends Persona implements iEdad{

	public String nombreUsuario;
	public String email;
	public int edad;
	
	public Usuario(String nombre, String apellido, int anyo, int mes, int dia, String nombreUsuario, String email)
	{
		super(nombre, apellido, LocalDate.of(anyo, mes, dia));
		this.nombreUsuario = nombreUsuario;
		this.email = email;
		this.edad = this.calcularEdad(LocalDate.of(anyo, mes, dia));
	}

	public int calcularEdad(LocalDate fechaNacimiento) {
		LocalDate fechaAhora = LocalDate.now();
		
		int edad = fechaAhora.getYear() - fechaNacimiento.getYear();
		if (fechaAhora.getMonthValue() < fechaNacimiento.getMonthValue() ||
				(fechaAhora.getMonthValue() >= fechaNacimiento.getMonthValue() &&
				fechaAhora.getDayOfMonth() < fechaNacimiento.getDayOfMonth()))
			edad--;
		return edad < 0 ? 0 : edad;
	}
	/*public void registroDeUsuarios() {
		System.out.println("Se registraron todos los usuarios");
	}*/
}
