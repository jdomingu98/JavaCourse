/*
Ejercicio 17:
	Trabajamos en el area de desarrollo del banco Santander, nuestro lider nos encomendó la dificil
	tarea de desarrollar una aplicación de Homebanking, la cual debe poseer las siguientes ventanas: 
		- Ventana principal
		- Ventana de Login
		- Ventana de registración
		- Ventana de Productos
	Principal > Login || Registración  > Productos
	La pantalla Principal debe tener la siguiente estructura:
	"Bienvenid@ a nuestra aplicación de Homebanking, si ya sos usuario por
	favor logueate, sino, registrate"
	Y dentro de esta pantalla debe tener 2 botones, uno para el login y otro para la registración. 
	Ventana de Login:
		- Nombre de usuario (TextField)
		- Contraseña (La contraseña debe ser un campo de tipo Contraseña)
		- Boton de acceder. 
	Cuando el usuario da click al boton de Acceder debe llevarlo a la ventana de Productos, donde va a
	ver la información de sus productos.
	Ventana de Registración:
		- Nombre
		- Apellido
		- Ciudad
		- Email
		- Salario
		- Fecha de nacimiento
	Como campos que el usuario puede completar. Una vez que llena los campos,
	le debe dar click al boton que diga "REGISTRARSE", una vez que le da click al boton
	de "REGISTRARSE" escribir por consola "Te has registrado con exito" 
	Ventana de productos:
		- Vamos a asumir por default que el cliente tiene una tarjeta de credito. La misma debe informar
		la plata que lleva gastada el cliente y la fecha de vencimiento
	Este programa debe ser generado utilizando la estructura de MVC (elija la variación de MVC que considere mas adecuada) 
	PUNTOS EXTRAS:
		- Estetica del programa
		- Boton de LOGOUT
		- Icono al programa
 */

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ModeloUsuario modelo = new ModeloUsuario();
		VentanaPrincipal vistaPrincipal = new VentanaPrincipal();
		ControladorUsuario controladorPrincipal = new ControladorUsuario(modelo, vistaPrincipal);
	}

}
