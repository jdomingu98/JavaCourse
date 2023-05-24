import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

public class Main {
	public static void main(String[] args) {
		String[] ciudades = {
				"Barcelona",
				"Buenos Aires",
				"Madrid",
				"Berlin"
		};
		
		String[] enlaces =
			{
				"https://api.open-meteo.com/v1/forecast?latitude=41.39&longitude=2.16&hourly=temperature_2m",
				"https://api.open-meteo.com/v1/forecast?latitude=-34.61&longitude=-58.38&hourly=temperature_2m",
				"https://api.open-meteo.com/v1/forecast?latitude=40.42&longitude=-3.70&hourly=temperature_2m",
				"https://api.open-meteo.com/v1/forecast?latitude=40.42&longitude=-3.70&hourly=temperature_2m"
			};
		DateTimeFormatter dt = DateTimeFormatter.ofPattern("YYYY-MM-dd HH");
		String now = LocalDateTime.now().format(dt) + ":00";
		now = now.replace(" ", "T");
		try {
			for(int i = 0; i < enlaces.length; i++)
			{
				URL url = new URL(enlaces[i]);
				HttpURLConnection con = (HttpURLConnection) url.openConnection();
				con.connect();
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
					sc.close();
					JSONObject data = new JSONObject(informacion.toString());
					JSONObject temperatureHours = data.getJSONObject("hourly");
					JSONArray times = temperatureHours.getJSONArray("time");
					int j = -1;
					while(++j < times.length())
					{
						if (times.get(j).equals(now))
							break ;
					}
					JSONArray temperatures = temperatureHours.getJSONArray("temperature_2m");
					Object temperaturaActual = temperatures.get(j);
					
					System.out.println(ciudades[i] + ": " + temperaturaActual.toString() + "ºC");
					if (temperaturaActual.toString().compareTo("10") > 0)
						System.out.println("No se recomienda usar abrigo!\n");
					else if (temperaturaActual.equals("10"))
						System.out.println("Puede llevar abrigo o no, a su elección!\n");
					else
						System.out.println("Se recomienda salir abrigado!\n");
					
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
