import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/*
 * Ejercicio 3:
 * En base al siguiente TXT debe leer todas las lineas del mismo
 * remover los duplicados utilizando la Colección Set e informarlo por consola
 * */

public class Ej3Set {
	public static void main(String[] args)
	{
		Set<String> nombres = new HashSet<String>();
		File documento = new File("C:\\Users\\jadomingueza\\Desktop\\Java\\Clase-4\\src\\Nombres.txt");
		try {
			BufferedReader br = new BufferedReader(new FileReader(documento));
			String nombre = "";
			while ((nombre = br.readLine()) != null)
				nombres.add(nombre);
			br.close();
			System.out.println(nombres);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
