import java.time.LocalDate;

public class Empresa {
	String nombre;
	LocalDate fechaCreacion;
	int numEmpleados;
	
	public Empresa(String nombre, LocalDate fechaCreacion, int numEmpleados)
	{
		this.nombre = nombre;
		this.fechaCreacion = fechaCreacion;
		this.numEmpleados = numEmpleados;
	}
}
