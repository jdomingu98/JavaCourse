import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class VentanaLogin extends JFrame{
	
	public VentanaLogin() {
		setTitle("Inicia sesión");
		JPanel panel = new JPanel();
		JLabel nombreUsuarioLabel = new JLabel("Nombre de usuario: ");
		JTextField nombreUsuarioTextField = new JTextField(20);
		JLabel contrasenaLabel = new JLabel("Contraseña: ");
		JPasswordField passwordField = new JPasswordField(20);
		JButton login = new JButton("INICIAR SESIÓN");
		
		setTitle("Inicia sesión");
		setSize(350, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		login.addActionListener(new ActionListener()
		{
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e)
			{
				if (!(nombreUsuarioTextField.getText().equals("") || passwordField.getText().equals("")))
				{
					//Pasar usuario y contraseña???
					VentanaProductos productos = new VentanaProductos();
					productos.setVisible(true);
					dispose();
				}
			}
	
		});
		
		panel.add(nombreUsuarioLabel);
		panel.add(nombreUsuarioTextField);
		panel.add(contrasenaLabel);
		panel.add(passwordField);
		panel.add(login);
		getContentPane().add(panel);
	}

}
