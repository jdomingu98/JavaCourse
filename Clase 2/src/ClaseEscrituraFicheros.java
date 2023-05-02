import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class ClaseEscrituraFicheros {
	public static void main(String[] args)
	{
		try {
			String ruta = "C:\\Users\\jadomingueza\\Desktop\\Java\\Clase2\\src\\";
			String nombreArchivo = "salida.txt";
			String ruta_nombreArchivo = ruta + nombreArchivo;
			System.out.println(ruta_nombreArchivo);
			String contenido_ejemplo = "Hola que tal! Me gusta mucho la paella";
			File archivo = new File(ruta_nombreArchivo);
			if (!archivo.exists())
			{
				archivo.createNewFile();
				System.out.println("Se creó el fichero.");
			}
			FileWriter fw = new FileWriter(archivo);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(contenido_ejemplo);
			bw.close();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
