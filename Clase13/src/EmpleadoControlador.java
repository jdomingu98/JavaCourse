
public class EmpleadoControlador {
	private EmpleadoModelo modelo;
	private EmpleadoVista vista;
	
	public EmpleadoControlador(EmpleadoModelo modelo, EmpleadoVista vista)
	{
		this.modelo = modelo;
		this.vista = vista;
	}
	
	public void mostrarEmpleado()
	{
		vista.mostrarEmpleado(modelo.getNombre(), modelo.getApellido(), modelo.getSalario());
	}
	
	
}
