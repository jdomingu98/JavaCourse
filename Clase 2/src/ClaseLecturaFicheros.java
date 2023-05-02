//import java.util.Scanner;
import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class ClaseLecturaFicheros {

	/*public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		try {
			Scanner sc = new Scanner(new File("C:\\Users\\jadomingueza\\Desktop\\Java\\Clase2\\src\\salida.txt"));
			while (sc.hasNextLine())
			{
				System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
	public static void main(String[] args)
	{
		File documento = new File("C:\\Users\\jadomingueza\\Desktop\\Java\\Clase2\\src\\salida.txt");
		try {
			BufferedReader br = new BufferedReader(new FileReader(documento));
			String caracteres = "";
			while ((caracteres = br.readLine()) != null)
				System.out.println(caracteres);
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
