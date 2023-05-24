import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class VentanaPrincipal extends JFrame{
	
	public VentanaPrincipal()
	{
		setTitle("Mi ventana del Homebanking");
		setSize(500,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton abrirBoton = new JButton("Abrir nueva ventana");
		abrirBoton.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						NuevoFrame nuevoFrame = new NuevoFrame();
						nuevoFrame.setVisible(true);
					}
			
				});
		getContentPane().add(abrirBoton);
	}
	
	public static void main(String [] args)
	{
		VentanaPrincipal ventana = new VentanaPrincipal();
		ventana.setVisible(true);
	}
}
