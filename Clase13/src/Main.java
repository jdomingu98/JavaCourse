//MVC basado en acciones
public class Main {
	public static void main (String [] args)
	{
		EmpleadoModelo modelo = new EmpleadoModelo();
		EmpleadoVista vista = new EmpleadoVista();
		EmpleadoControlador controlador = new EmpleadoControlador(modelo, vista);
		modelo.setNombre("Gustavo");
		modelo.setApellido("Vargas");
		modelo.setSalario(10000);
		controlador.mostrarEmpleado();
	}
}
