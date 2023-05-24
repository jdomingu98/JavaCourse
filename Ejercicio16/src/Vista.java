import java.awt.Color;
import java.time.LocalDateTime;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Vista {
	
	private JFrame frame;
	private JPanel panel;
	private JLabel nombreVueloLabel;
	private JLabel origenLabel;
	private JLabel destinoLabel;
	private JLabel tiempoSalidaLabel;
	private JLabel tiempoLlegadaLabel;
	private JLabel numDiasLabel;
	
	public Vista() {
		frame = new JFrame("Java Airlines");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		
		nombreVueloLabel = new JLabel("Nombre del vuelo: ");
		nombreVueloLabel.setOpaque(true);
		nombreVueloLabel.setBackground(Color.CYAN);
		
		origenLabel = new JLabel("Origen: ");
		origenLabel.setOpaque(true);
		origenLabel.setBackground(Color.GREEN);
		
		destinoLabel = new JLabel("Destino: ");
		destinoLabel.setOpaque(true);
		destinoLabel.setBackground(Color.GREEN);
		
		tiempoSalidaLabel = new JLabel("Tiempo de salida: ");
		tiempoSalidaLabel.setOpaque(true);
		tiempoSalidaLabel.setBackground(Color.GRAY);
		
		tiempoLlegadaLabel = new JLabel("Tiempo de llegada: ");
		tiempoLlegadaLabel.setOpaque(true);
		tiempoLlegadaLabel.setBackground(Color.GRAY);
		
		numDiasLabel = new JLabel("Numero de días: ");
		numDiasLabel.setOpaque(true);
		numDiasLabel.setBackground(Color.RED);
		
		panel.add(nombreVueloLabel);
		panel.add(origenLabel);
		panel.add(destinoLabel);
		panel.add(tiempoSalidaLabel);
		panel.add(tiempoLlegadaLabel);
		panel.add(numDiasLabel);
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setSize(400, 400);
		frame.setVisible(true);
	}
	
	public void mostrarDatos(String nombre, String origen, String destino,
			LocalDateTime tiempoSalida, LocalDateTime tiempoLlegada, int numDias)
	{
		nombreVueloLabel.setText("Nombre del vuelo: " + nombre);
		origenLabel.setText("Origen: " + origen);
		destinoLabel.setText("Destino: " + destino);
		tiempoSalidaLabel.setText("Tiempo de Salida: " + tiempoSalida.toString());
		tiempoLlegadaLabel.setText("Timepo de Llegada: " + tiempoLlegada.toString());
		numDiasLabel.setText("Número de días: " + numDias);
	}
}
