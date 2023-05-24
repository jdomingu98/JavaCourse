
public class Controlador {
	private Modelo modelo;
	private Vista vista;
	
	public Controlador(Modelo modelo, Vista vista) {
		this.modelo = modelo;
		this.vista= vista;
	}
	
	public void actualizarUsuario(String nombre, String correo) {
		modelo.setNombre(nombre);
		modelo.setCorreo(correo);
	}
	
	public void mostrarUsuario()
	{
		String nombre = modelo.getNombre();
		String correo = modelo.getCorreo();
		vista.mostrarUsuario(nombre, correo);
	}
}
