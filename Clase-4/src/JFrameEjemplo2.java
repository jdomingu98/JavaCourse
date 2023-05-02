import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class JFrameEjemplo2 {
	public static void main(String[] args)
	{
		JFrame ventana = new JFrame("Otro ejemplo");
		ImageIcon icono = new ImageIcon("C:\\Users\\jadomingueza\\Desktop\\Java\\Clase-4\\src\\icono.png");
		ImageIcon icono_arreglado = new ImageIcon(icono.getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH));
		JLabel etiqueta = new JLabel("Este es mi programa!", icono_arreglado, JLabel.CENTER);
		ventana.add(etiqueta);
		ventana.setSize(300,100); //Ancho x Alto
		ventana.setVisible(true);
	}
}
