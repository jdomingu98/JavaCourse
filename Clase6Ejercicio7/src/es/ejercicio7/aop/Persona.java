package es.ejercicio7.aop;

public class Persona {
	public String nombre;
	public String apellido;
	public int edad;
	
	public Persona(String nombre, String apellido, String edad)
	{
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = Integer.parseInt(edad);
	}
	
	@Override
	public int hashCode() {
		return nombre.hashCode() + apellido.hashCode() + Integer.hashCode(edad);
	}
	
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Persona)) return false;
		Persona p = (Persona) o;
		return (nombre.equals(p.nombre) && edad == p.edad && apellido.equals(p.apellido));
	}
}
