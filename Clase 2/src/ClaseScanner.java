import java.util.Scanner;

public class ClaseScanner {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el primer numero: ");
		int numero1 = sc.nextInt();
		System.out.println("Ingrese el segundo numero: ");
		int numero2 = sc.nextInt();
		System.out.println("Ingrese la operacion a realizar: \n"
								+ "1. Suma \n"
								+ "2. Resta \n"
								+ "3. Multiplicacion \n"
								+ "4. Division \n");
		int menu = sc.nextInt();
		if (menu == 1)
		{
			int suma = numero1+numero2;
			System.out.println("El resultado de la suma es: " + suma);
		}
		//System.out.println("Ingresa tu nombre: ");
		//String nombre = sc.next();
		sc.close();
	}
}
