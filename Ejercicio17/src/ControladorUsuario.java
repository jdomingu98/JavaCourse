import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ControladorUsuario {
	private ModeloUsuario modelo;
	private VentanaRegistro vistaRegistro;
	private VentanaPrincipal vistaPrincipal;
	
	public ControladorUsuario(ModeloUsuario modelo, VentanaPrincipal vistaPrincipal)
	{
		this.modelo = modelo;
		this.vistaPrincipal = vistaPrincipal;
		this.vistaPrincipal.setVisible(true);
		this.vistaRegistro = new VentanaRegistro();
		this.vistaRegistro.getRegistroButton().addActionListener(new ActionListener()
				{
							@Override
							public void actionPerformed(ActionEvent e)
							{
								registrarUsuario();
							}
						});
	}
	
	public void registrarUsuario()
	{
		String nombre = vistaRegistro.getNombreTextField().getText();
		modelo.setNombre(nombre);
		
		String apellido = vistaRegistro.getApellidoTextField().getText();
		modelo.setApellido(apellido);
		
		String ciudad = vistaRegistro.getCiudadTextField().getText();
		modelo.setCiudad(ciudad);
		
		String email = vistaRegistro.getEmailTextField().getText();
		modelo.setEmail(email);
		
		String nombreUsuario = vistaRegistro.getNombreUsuarioTextField().getText();
		modelo.setNombreUsuario(nombreUsuario);
		
		@SuppressWarnings("deprecation")
		String contrasena = vistaRegistro.getPasswordField().getText();
		modelo.setPassword(contrasena);
		
		DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MM/YYYY");
		LocalDate fechaNacimiento = LocalDate.parse(vistaRegistro.getFechaNacimientoTextField().getText(), dt);
		modelo.setFechaNacimiento(fechaNacimiento);
		
		double salario = Double.parseDouble(vistaRegistro.getSalarioTextField().getText());
		modelo.setSalario(salario);
	}
}
