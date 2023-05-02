import javax.swing.JFrame;
import javax.swing.JLabel;

public class JFrameEjemplo1 {

	public static void main(String[] args)
	{
		//Crea la ventana, el parámetro es el titulo de la ventana
		JFrame ventana = new JFrame("Este es mi ejemplo de HolaMundo");
		JLabel eiqueta = new JLabel("Hola Mundo!");
		
		//Inserto etiqueta dentro de la ventana
		ventana.add(eiqueta);
		
		//Ajustar ventana al contenido del mismo
		//ventana.pack();
		
		//Ajusta la ventana a las dimensiones de los parametros
		ventana.setSize(800, 600);
		
		//Indica que la ventana es visible
		ventana.setVisible(true);
			
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
