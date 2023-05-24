import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Vista {
	private JFrame frame; //El frame, la ventana. 
	private JPanel panel; //El panel donde van los elementos.
	private JLabel nombreLabel; //Etiqueta de nombre
	private JLabel correoLabel; //Etiqueta de correo
	private JLabel contraseniaLabel; //Etiqueta de contraseña
	private JTextField nombreTextField; //Textfield para llenar el nombre
	private JTextField correoTextField; //textfield para llenar el correo
	private JPasswordField contraseniaPasswordField; //Passwordfield para llenar la password
	private JButton guardarButton; //Boton de guardar. 
	private ActionListener guardarActionListener; //Acción de guardar.
	public Vista()
	{
		frame = new JFrame("Registro del usuario"); //Declaro el JFrame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //operacion por default
		panel = new JPanel(); //Declaro el panel. 
		nombreLabel = new JLabel("Nombre: "); //Declaro la etiqueta de nombre y le doy un valor
		correoLabel = new JLabel("Correo: "); //Declaro la etiqueta de correo y le doy un valor
		contraseniaLabel = new JLabel("Contraseña: "); //Declaro la etiqueta de password y le doy un valor
		nombreTextField = new JTextField(20); //Inicializo el textField de nombre
		correoTextField = new JTextField(20); //Inicializo el textField de correo
		contraseniaPasswordField = new JPasswordField(20); //Inicializo el passwordField de password
		guardarButton = new JButton("Guardar"); //Inicializo el boton de guardar
		guardarActionListener = new ActionListener() //declaro el guardarActionListener
				{
					@Override
					public void actionPerformed(ActionEvent e) 
					{
						String nombre = nombreTextField.getText();
						String correo = correoTextField.getText();
						String contrasenia = contraseniaPasswordField.getText();
					}
				};
		guardarButton.addActionListener(guardarActionListener); //le asocio al boton de guardar la accion. 
		//De aqui para abajo (hasta donde lo indique) le agrego los elementos al panel.
		panel.add(nombreLabel); 
		panel.add(nombreTextField);
		panel.add(correoLabel);
		panel.add(correoTextField);
		panel.add(contraseniaLabel);
		panel.add(contraseniaPasswordField);
		panel.add(guardarButton);
		//hasta aqui agrego elementos al panel.
		frame.getContentPane().add(panel); //Agrego el contenido del panel a la ventana.
		frame.pack(); //Seteo el tamaño de la ventana.
		frame.setVisible(true); //La dejo visible. 
	}
	public void limpiarFormulario() //Funcion de limpieza de formulario.
	{
		nombreTextField.setText("");
		correoTextField.setText("");
		contraseniaPasswordField.setText("");
	}
	//return del actionListener 
	public ActionListener getGuardarActionListener()
	{
		return guardarActionListener;
	}

	public JPasswordField getContraseniaPasswordField() {
		// TODO Auto-generated method stub
		return contraseniaPasswordField;
	}

	public JTextField getCorreoTextField() {
		// TODO Auto-generated method stub
		return correoTextField;
	}
	
	public JTextField getNombreTextField()
	{
		return nombreTextField;
	}

	public void mostrarUsuario(String nombre, String correo) {
		System.out.println("Nombre: " + nombre);
		System.out.println("Correo: " + correo);
	}
	public JButton getGuardarButton() {
		// TODO Auto-generated method stub
		return guardarButton;
	}
}
