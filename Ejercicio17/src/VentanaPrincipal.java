import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class VentanaPrincipal extends JFrame{
	
	public VentanaPrincipal()
	{
		JPanel panel = new JPanel();
		setTitle("Banco Santander");
		setSize(700,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel titleLabel = new JLabel("Bienvenid@ a nuestra aplicación de Homebanking, "
				+ "si ya sos usuario por favor logueate, sino, registrate");
		JButton loginButton = new JButton("Iniciar sesión");
		JButton registerButton = new JButton("Registro");
		
		loginButton.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						VentanaLogin login = new VentanaLogin();
						login.setVisible(true);
						dispose();
					}
			
				});
		registerButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				VentanaRegistro registro = new VentanaRegistro();
				registro.getFrame().setVisible(true);
				dispose();
			}
	
		});
		panel.add(titleLabel);
		panel.add(loginButton);
		panel.add(registerButton);
		getContentPane().add(panel);
	}
}
