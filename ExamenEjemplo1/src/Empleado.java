import java.time.LocalDate;

public class Empleado implements iCalculoEmpleados{
	public String nombre;
	public String apellido;
	public LocalDate fechaIngreso;
	public LocalDate fechaSalida;
	public String sexo;
	public String ciudad;
	public String posicion;
	public double salarioBase;
	
	public Empleado(String nombre, String apellido, LocalDate fechaIngreso, LocalDate fechaSalida,
						String sexo, String ciudad, String posicion, double salarioBase) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaIngreso = fechaIngreso;
		this.fechaSalida = fechaSalida;
		this.sexo = sexo;
		this.ciudad = ciudad;
		this.posicion = posicion;
		this.salarioBase = salarioBase;
	}

	@Override
	public double calcularSalario(double salarioBase) {
		return salarioBase * 0.83;
	}

	@Override
	public String rotacionRecomendada(String puesto, int antiguedad) {
		if (puesto.equals("Ingeniero") && antiguedad > 2)
			return "Habilitada";
		else if (antiguedad == 2)
			return "Por definir";
		else
			return "No habilitada";
	}

	@Override
	public int antiguedadLaboral(LocalDate fechaActual, LocalDate fechaIngreso) {
		return Math.abs(fechaIngreso.getYear() - fechaActual.getYear());
	}
}
