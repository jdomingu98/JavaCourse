/*
 * Ejercicio 13 
	Desarrollar un programa que se conecte a la api de https://pokeapi.co/,
	en la misma debe elegir un Pokemon (el que usted prefiera) e informar lo siguiente de el:
		- Nombre (species: name)
		- Tipo de pokemon que es (type)
		- Peso (weight)
	Una vez obtenida esa información imprimirla en un TXT, a su vez, compilar el proyecto de tipo Maven
	en Jenkins para obtener el jar file.
	ENTREGABLES:
		- Captura de pantalla de consola de Jenkins mostrando los Goals
		- Codigo del proyecto (subido a Github)
*/

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import org.json.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			URL url = new URL("https://pokeapi.co/api/v2/pokemon/magmar");
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.connect();
			int tiempoDeRespuesta = con.getResponseCode();
			if (tiempoDeRespuesta != 200)
				throw new RuntimeException("HttpResponseCode" + tiempoDeRespuesta);
			else
			{
				StringBuilder sb = new StringBuilder();
				Scanner sc = new Scanner(url.openStream());
				while(sc.hasNext())
					sb.append(sc.nextLine());
				sc.close();
				JSONObject data = new JSONObject(sb.toString());
				JSONObject speciesInfo = new JSONObject(data.get("species").toString());
				JSONArray typesInfo = new JSONArray(data.get("types").toString());
				JSONObject typeInfo = typesInfo.getJSONObject(0);
				JSONObject info = (JSONObject) typeInfo.get("type");
				String texto = "Pokémon name: " + speciesInfo.get("name") + "\n"
								+ "Type: " + info.get("name") + "\n"
								+ "Weight: " + data.get("weight") + " kg\n";
				String ruta = "..\\Ejercicio13\\src\\salida.txt";
				File archivo = new File(ruta);
				if (!archivo.exists())
				{
					archivo.createNewFile();
					System.out.println("Archivo creado");
				}
				FileWriter fw = new FileWriter(archivo);
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(texto);
				bw.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
