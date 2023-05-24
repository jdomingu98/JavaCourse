
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import org.json.JSONObject;

public class ClaseAPI {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://api.open-meteo.com/v1/forecast?latitude=41.39&longitude=2.16&hourly=temperature_2m&forecast_days=1&start_date=2023-04-27&end_date=2023-04-28");
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.connect(); // Establece la conexion
			int tiempoDeRespuesta = con.getResponseCode();
			if (tiempoDeRespuesta != 200)
				throw new RuntimeException("HttpResponseCode" + tiempoDeRespuesta);
			else
			{
				StringBuilder informacion = new StringBuilder();
				Scanner sc = new Scanner(url.openStream());
				while (sc.hasNext())
				{
					informacion.append(sc.nextLine());
				}
				System.out.println(informacion);
				sc.close();
				JSONObject data = new JSONObject(informacion.toString());
				System.out.println("La latitud es: " + data.get("latitude"));
				
				data.remove("latitude");
				data.remove("generationtime_ms");
				data.remove("utc_offset_seconds");
				System.out.println(data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
