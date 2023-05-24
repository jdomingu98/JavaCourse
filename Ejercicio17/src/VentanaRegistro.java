import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class VentanaRegistro{
	
	private JFrame frame;
	private JPanel panel;
	private JLabel nombreLabel;
	private JTextField nombreTextField;
	private JLabel apellidoLabel;
	private JTextField apellidoTextField;
	private JLabel ciudadLabel;
	private JTextField ciudadTextField;
	private JLabel nombreUsuarioLabel;
	private JTextField nombreUsuarioTextField;
	private JLabel emailLabel;
	private JTextField emailTextField;
	private JLabel contrasenaLabel;
	private JPasswordField passwordField;
	private JLabel salarioLabel;
	private JTextField salarioTextField;
	private JLabel fechaNacimientoLabel;
	private JTextField fechaNacimientoTextField;
	private JButton registro;
	
	public VentanaRegistro() {
		frame = new JFrame();
		panel = new JPanel();
		nombreLabel = new JLabel("Nombre: ");
		nombreTextField = new JTextField(20);
		apellidoLabel = new JLabel("Apellido: ");
		apellidoTextField = new JTextField(20);
		ciudadLabel = new JLabel("Ciudad: ");
		ciudadTextField = new JTextField(20);
		nombreUsuarioLabel = new JLabel("Usuario: ");
		nombreUsuarioTextField = new JTextField(20);
		emailLabel = new JLabel("Correo: ");
		emailTextField = new JTextField(20);
		contrasenaLabel = new JLabel("Contraseña: ");
		passwordField = new JPasswordField(20);
		salarioLabel = new JLabel("Salario: ");
		salarioTextField = new JTextField(20);
		fechaNacimientoLabel = new JLabel("Fecha Nac. (dd/MM/YYYY): ");
		fechaNacimientoTextField = new JTextField(20);
		registro = new JButton("REGISTRARSE");
		
		frame.setTitle("Registro");
		frame.setSize(300,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		registro.addActionListener(new ActionListener()
		{
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e)
			{
				if (!(nombreTextField.getText().equals("") ||
						apellidoTextField.getText().equals("") ||
						ciudadTextField.getText().equals("") ||
						emailTextField.getText().equals("") ||
						salarioTextField.getText().equals("") ||
						nombreUsuarioTextField.getText().equals("") ||
						passwordField.getText().equals("") ||
						fechaNacimientoTextField.getText().equals("")))
				{
					VentanaProductos productos = new VentanaProductos();
					productos.setVisible(true);
					System.out.println("Te has registrado con éxito!");
					frame.dispose();
				}
			}
	
		});
		
		panel.add(nombreLabel);
		panel.add(nombreTextField);
		panel.add(apellidoLabel);
		panel.add(apellidoTextField);
		panel.add(ciudadLabel);
		panel.add(ciudadTextField);
		panel.add(nombreUsuarioLabel);
		panel.add(nombreUsuarioTextField);
		panel.add(emailLabel);
		panel.add(emailTextField);
		panel.add(contrasenaLabel);
		panel.add(passwordField);
		panel.add(salarioLabel);
		panel.add(salarioTextField);
		panel.add(fechaNacimientoLabel);
		panel.add(fechaNacimientoTextField);
		panel.add(registro);
		frame.getContentPane().add(panel);
	}
	
	public JButton getRegistroButton() {
		return registro;
	}

	public JFrame getFrame() {
		return frame;
	}
	
	public JTextField getNombreTextField() {
		return nombreTextField;
	}

	public JTextField getApellidoTextField() {
		return apellidoTextField;
	}

	public JTextField getCiudadTextField() {
		return ciudadTextField;
	}

	public JTextField getNombreUsuarioTextField() {
		return nombreUsuarioTextField;
	}

	public JTextField getEmailTextField() {
		return emailTextField;
	}

	public JPasswordField getPasswordField() {
		return passwordField;
	}

	public JTextField getSalarioTextField() {
		return salarioTextField;
	}

	public JTextField getFechaNacimientoTextField() {
		return fechaNacimientoTextField;
	}
}
