/*
 * EJERCICIO 1:
	Nos pidieron desarrollar una calculadora con las siguientes funcionalidades:
		- Suma
		- Resta
		- Divison
		- Multiplicación
	Donde el usuario pueda ingresar valores por consola el mismo.
	La unica consideración que nos pidieron tener presente es que en el caso de la division, no se puede dividir por 0. Nuestro
	programa debe poder manejar esta situación mediante el uso del IF
	
	ENTREGABLES: 
		- Codigo del proyecto. 
 * 
 * */
import java.util.Scanner;

public class CalculadoraEj {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int numero1 = 0;
		int numero2 = 0;
		int menu = 0;
		int res = 0;
		
		while ((menu < 1 || menu > 4) || (menu == 4 && numero2 == 0))
		{
			System.out.println("Ingrese el primer numero: ");
			numero1 = sc.nextInt();
			System.out.println("Ingrese el segundo numero: ");
			numero2 = sc.nextInt();
			System.out.println("Ingrese la operacion a realizar: \n"
								+ "1. Suma \n"
								+ "2. Resta \n"
								+ "3. Multiplicacion \n"
								+ "4. Division \n");
			menu = sc.nextInt();
			if (menu < 1 || menu > 4)
				System.out.println("Opción inválida. Escribe una opción del 1 al 4");
			else if (menu == 4 && numero2 == 0)
				System.out.println("No se puede dividir por 0");
		}
		if (menu == 1)
			res = numero1 + numero2;
		else if (menu == 2)
			res = numero1 - numero2;
		else if (menu == 3)
			res = numero1 * numero2;
		else
			res = numero1 / numero2;
		System.out.println("El resultado de la operación es: " + res);
		sc.close();
	}
}
