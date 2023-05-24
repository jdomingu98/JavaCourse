import java.util.Scanner;

public class Controlador {
	
	private Vista vista;
	
	public Controlador(Vista vista) {
		this.vista = vista;
	}
	
	public void registrarUsuario(Scanner sc) {
		Usuario usuario = new Usuario();
		
		System.out.print("Introduce tu nombre: ");
		usuario.setNombre(sc.next());
		
		System.out.print("Introduce tu apellido: ");
		usuario.setApellido(sc.next());
		
		System.out.print("Introduce tu correo electrónico: ");
		usuario.setCorreo(sc.next());
		
		System.out.print("Introduce tu nombre de usuario: ");
		usuario.setNombreUsuario(sc.next());
		System.out.println("");
		
		vista.mostrar(usuario);
	}
}
