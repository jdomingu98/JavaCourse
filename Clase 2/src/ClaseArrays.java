
public class ClaseArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeros[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println(numeros[0]);
		int arrayLargo = numeros.length;
		System.out.println("El largo del array es: " + arrayLargo);
		String[] nombres = new String[10];
		nombres[0] = "Gustavo";
		nombres[1] = "Juan";
		nombres[2] = "Maria";
		nombres[3] = "Pablo";
		System.out.println("El nombre de la posicion inicial es: " + nombres[0]);
		for(int i = 0; i < numeros.length; i++)
		{
			System.out.println("Los numeros del array son: " + numeros[i]);
		}
	}

}
