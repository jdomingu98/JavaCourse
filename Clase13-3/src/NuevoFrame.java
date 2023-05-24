import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class NuevoFrame extends JFrame
{
	public NuevoFrame()
	{
		setTitle("Mi otra ventanita");
		setSize(400,300);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		JLabel etiqueta = new JLabel("Ingresa tu nombre: ");
	}
}