/* Clase pública:
 * 	Las clases publicas son aquellas que pueden ser reutilizadas
 * 	en otras clases, y que por tanto, son accesibles desde distintas
 * 	partes de código
 * Clase privada:
 * 	En contraposicion de a clase publica, las clases privadas son aquellas que
 * pueden utilizarse cdentro del paqueete correpsondiente a su cuerpo. Esto significa
 * que NO son accesibles desde otras pares del codigo, y que al ser de --
 * pueden ser empleadas por otras clases
 * Beneficios de las clases privadas:
 * Encapsulacion de fincionalidad: Las clase privadas utilizan el concepto
 * de encapsualcion de funcionalidades dentro de una clase, lo que permite
 * oculta y protegida del acceso ÇEXTERNO. Esto ayuda a prevenir cambios
 * en el estado interno de la case y garantiza que la clase funcione  ---
 * Abstraccion: Las clases priivadas se utilizan para proporcionar una capa de absraccion
 * Herencia:
 * 	En Java, la herencia es un mecanismo mediane el cual una clase
 * 	puede HEREDAR atributos y metodos de otra clase. La clase que hereda los atributos
 * 	y metodos se conoce como "subcase" o "clase hija", mientras que la 
 * 	de la que se heredan los atributos y metodos se conoce como "superclase"
 */

//Git: https://github.com/Ripper2021/JavaDesdeCero
//Correo: gavargas@itformacion.com
// Correo ejercicios: gavargas@grupoloyal.com
public class Empleado extends Persona implements iCalculos
{
	String cargo;
	int sueldo;
	
	public static void main (String[] args)
	{
		Empleado gustavo = new Empleado();
		
		gustavo.nombre = "Gustavo";
		gustavo.apellido = "Vargas";
		gustavo.edad = 30;
		gustavo.ciudad = "Barcelona";
		gustavo.altura = 170;
		gustavo.cargo = "Ingeniero";
		gustavo.sueldo = 30000;
		gustavo.sumar();
		gustavo.restar();
		System.out.println("El empleado es: " + gustavo.nombre + " su apellido es: " + gustavo.apellido + " su cargo es " + gustavo.cargo);
		//System.out.println("Hola mundo!");
	}

	@Override
	public void sumar() {
		// TODO Auto-generated method stub
		int a;
		int b;
		a = 10;
		b = 20;
		System.out.println(a+b);
	}

	@Override
	public void restar() {
		// TODO Auto-generated method stub
		int a;
		int b;
		a = 100;
		b = 50;
		System.out.println(a-b);
		
	}

	@Override
	public void multiplicar() {
		// TODO Auto-generated method stub
		int a;
		int b;
		a = 1;
		b = 1;
		int multiplicar = a*b;
	}

	@Override
	public void dividir() {
		// TODO Auto-generated method stub
		int a;
		int b;
		a = 2;
		b = 2;
		int dividir = a/b;
	}
}
