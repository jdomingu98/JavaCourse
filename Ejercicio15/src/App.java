import java.util.Scanner;

/*
	EJERCICIO 15
		Desarrollar un programa que permita a los usuarios registrarse en nuestra aplicación
		almacenando la siguiente información de los mismos:
			- Nombre
			- Apellido
			- Correo
			- Nombre de usuario
		El programa debe implementar el patron de diseño MVC Clasico. 
		
		ENTREGABLES:
			- Codigo del proyecto.
*/

public class App {

	public static void main(String[] args) {
		Vista vista = new Vista();
		Scanner sc = new Scanner(System.in);
		Controlador controlador = new Controlador(vista);
		
		for (int i = 0; i <= 2; i++)
			controlador.registrarUsuario(sc);
		sc.close();

	}

}
