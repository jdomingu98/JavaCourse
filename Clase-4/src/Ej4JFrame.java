/* EJERCICIO 4:
	- Mediante el uso de JFrame, JLabel, JButton (que muestre la información) y JPanel
	  generar un programa que muestre la siguiente informacion:
		- Un paisaje de tu ciudad (mediante URL)
		- Información relevante sobre la misma, como por ejemplo:
  			! Mensaje de bienvenida
  			! Cantidad de habitantes
  			! Clima habitual
  			! Actividad economica por default. 
	FORMATO DE FUENTE:
		- La fuente debe estar en un tono gris oscuro u otro tono que
  			no sea el negro por default.
		- El programa debe tener un ancho de 1200 y un alto de 800
	ENTREGABLES:
		- Codigo del proyecto.
*/

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Ej4JFrame {

	public static void main(String[] args) {
		JFrame ventana = new JFrame("Esta es mi ciudad");
		JLabel imagenCiudad = new JLabel();
		JPanel panel = new JPanel();
		
		JLabel infoBienvenida = new JLabel("¡Bienvenid@ a Benalmádena!");
		infoBienvenida.setOpaque(true);
		infoBienvenida.setForeground(Color.GRAY);
		
		try {
			URL url = new URL("https://descapada.com/wp-content/uploads/2020/10/benalmadena_puerto_deportivo.jpg");
			Image imagen = ImageIO.read(url);
			ImageIcon imgArreglada = new ImageIcon(imagen.getScaledInstance(1200, 400, java.awt.Image.SCALE_SMOOTH));
			imagenCiudad.setIcon(imgArreglada);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		JButton boton = new JButton("Mostrar datos");
		boton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String textoInfo = "INFORMACIÓN DE LA CIUDAD:\n"
						+ "\t· Provincia a la que pertence: Málaga\n"
						+ "\t· Número de habitantes en 2023: 73160\n"
						+ "\t· Clima habitual: Soleado\n"
						+ "\t· Actividad económica por defecto: Turismo";
				System.out.println(textoInfo);
			}
		});
		panel.add(imagenCiudad);
		panel.add(infoBienvenida);
		panel.add(boton);
		ventana.add(panel);
		ventana.setSize(1200, 800);
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
