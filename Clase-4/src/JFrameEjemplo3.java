import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class JFrameEjemplo3
{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame ventana = new JFrame("Esta es mi ventana");
		JLabel etiqueta = new JLabel("Esta es mi etiqueta");
		etiqueta.setOpaque(true);
		etiqueta.setForeground(Color.WHITE);
		etiqueta.setBackground(Color.DARK_GRAY);
		ventana.add(etiqueta);
		ventana.setVisible(true);
		ventana.setSize(250,150);
	}

}
