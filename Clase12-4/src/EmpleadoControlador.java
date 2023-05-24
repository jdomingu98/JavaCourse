
public class EmpleadoControlador {
	private EmpleadoModelo modelo;
	private EmpleadoVista vista;
	
	public EmpleadoControlador(EmpleadoModelo modelo, EmpleadoVista vista)
	{
		this.modelo = modelo;
		this.vista = vista;
	}
	
	public void actualizarEmpleado(String nombre, String apellido, double salario)
	{
		modelo.setNombre(nombre);
		modelo.setApellido(apellido);
		modelo.setSalario(salario);
	}
	
	public void mostrarEmpleado() {
		String nombre = modelo.getNombre();
		String apellido = modelo.getApellido();
		double salario = modelo.getSalario();
		vista.mostrarEmpleado(nombre, apellido, salario);
	}
}
