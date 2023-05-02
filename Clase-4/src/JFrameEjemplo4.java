import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import java.awt.Image;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JFrameEjemplo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame ventana = new JFrame("Este es mi programa");
		JLabel etiqueta = new JLabel();
		
		try {
			URL url = new URL("https://media.istockphoto.com/id/1331768618/es/foto/un-camino-ventoso-conduce-al-monte-fitz-roy-las-monta%C3%B1as-circundantes-y-la-ciudad-de-el.jpg?s=612x612&w=0&k=20&c=KseVJhp4eDeLyM_tV6dPoiNb4xGBtTrhmf9yUtjROTA=");
			Image imagen = ImageIO.read(url);
			etiqueta.setIcon(new ImageIcon(imagen));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		JPanel panel = new JPanel();
		JButton boton = new JButton("Saludar");
		boton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("Bienvenid@ a mi ciudad");
			}
		});
		panel.add(etiqueta);
		panel.add(boton);
		ventana.add(panel);
		ventana.pack();
		ventana.setVisible(true);
		
	}

}
