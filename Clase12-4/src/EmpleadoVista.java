import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EmpleadoVista {
	private JFrame frame;
	private JPanel panel;
	private JLabel nombreLabel;
	private JLabel apellidoLabel;
	private JLabel salarioLabel;
	
	public EmpleadoVista() {
		frame = new JFrame("Empleado");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		nombreLabel = new JLabel("Nombre: ");
		apellidoLabel = new JLabel("Apellido: ");
		salarioLabel = new JLabel("Salario: ");
		
		panel.add(nombreLabel);
		panel.add(apellidoLabel);
		panel.add(salarioLabel);
		
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
	}
	
	public void mostrarEmpleado(String nombre, String apellido, double salario)
	{
		nombreLabel.setText("Nombre: " + nombre);
		apellidoLabel.setText("Apellido: " + apellido);
		salarioLabel.setText("Salario: " + salario);	
	}
	
}
