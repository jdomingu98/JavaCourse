/*EJERCICIO 6 (EL DEL GATITO <3)
	Usando la siguiente API (https://thecatapi.com/)
		desarrolle un programa que muestre la imagen recomendada
		de los gatitos y generar un boton que vaya actualizando la imagen.
	- APIS
	- JSON
	- Jframe, Jlabel, ImageIcon, URL, JButton, JPanel
	- HTTPS
*/

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.json.*;

public class APIGatosEj6 {

	public static URL setCatURL(URL url)
	{
		StringBuilder informacion = new StringBuilder();
		try {
			Scanner sc = new Scanner(url.openStream());
			while (sc.hasNext())
				informacion.append(sc.nextLine());
			sc.close();
			JSONArray data = new JSONArray(informacion.toString());
			JSONObject obj = new JSONObject();
			obj = data.getJSONObject(0);
			return new URL(obj.get("url").toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void setCatImage(URL url, JLabel imagenGato){
		URL imageURL = setCatURL(url);
		if (imageURL == null)
			throw new NullPointerException("URL not found!");
		else
		{
			try {
				Image imagen = ImageIO.read(imageURL);
				ImageIcon imgArreglada = new ImageIcon(imagen.getScaledInstance(800, 600, java.awt.Image.SCALE_SMOOTH));
				imagenGato.setIcon(imgArreglada);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		JFrame ventana = new JFrame("Random Cats!");
		JPanel panel = new JPanel();
		JLabel imagenGato = new JLabel();
		
		try {
			URL url = new URL("https://api.thecatapi.com/v1/images/search");
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.connect();
			int tiempoDeRespuesta = con.getResponseCode();
			if (tiempoDeRespuesta != 200)
				throw new RuntimeException("HttpResponseCode" + tiempoDeRespuesta);
			else
				setCatImage(url, imagenGato);
			JButton boton = new JButton("Change cat!");
			boton.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					setCatImage(url, imagenGato);
				}
			});
			panel.add(imagenGato);
			panel.add(boton);
			ventana.add(panel);
			ventana.setSize(800, 1200);
			ventana.setVisible(true);
			ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
