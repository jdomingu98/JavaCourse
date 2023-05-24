import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador {
	private Modelo modelo; //declaro el modelo
	private Vista vista; //declaro la vista
	public Controlador(Modelo modelo, Vista vista) //declaro la funcion de la clase
	{
		this.modelo= modelo; 
		this.vista = vista;
		this.vista.getGuardarButton().addActionListener(new ActionListener() //asocio el actionListener al GET del boton.
		{
					@Override
					public void actionPerformed(ActionEvent e)
					{
						guardarUsuario();//accion de guardado.
					}
				});
	}
	public void guardarUsuario() //declaro la funcion de guardarUsuario
	{
		String nombre = vista.getNombreTextField().getText(); //obtengo el nombre
		String correo = vista.getCorreoTextField().getText(); //obtengo el correo
		@SuppressWarnings("deprecation")
		String contrasenia = vista.getContraseniaPasswordField().getText(); //obtengo la contraseña
		modelo.setNombre(nombre); //establezco el nombre
		modelo.setContrasenia(contrasenia); //establezco la contrasenia
		modelo.setCorreo(correo); //establezco el correo
		vista.limpiarFormulario(); //limpio el formulario (lo dejo vacio)
		vista.mostrarUsuario(nombre, correo); //muestro el usuario por consola. 
	}
}
