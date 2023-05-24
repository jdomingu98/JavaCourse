import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class VentanaProductos extends JFrame{
	
	public VentanaProductos() {
		TarjetaBancaria tarjeta = new TarjetaBancaria("ES00 1111 2222 3333 4444 5555", Math.random() * 1000, Math.random() * 100, "03/09/2029");

		setTitle("Lista de productos");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		JLabel tarjetaLabel = new JLabel("Producto: " + tarjeta.cuentaBancaria);
		JLabel ahorradoLabel = new JLabel("Dinero ahorrado: " + tarjeta.dineroAhorrado + " €");
		JLabel dineroGastadoLabel = new JLabel("Dinero gastado: " + tarjeta.gastadoMes + " €");
		JLabel totalLabel = new JLabel("Dinero total: " + tarjeta.dineroRestante(tarjeta.dineroAhorrado, tarjeta.gastadoMes) + " €");
		JLabel fechaVencimientoLabel = new JLabel("Fecha de vencimiento: " + tarjeta.fechaVencimiento);
		JButton logoutButton = new JButton("Log Out");
		
		logoutButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				dispose();
			}
	
		});
		
		panel.add(tarjetaLabel);
		panel.add(ahorradoLabel);
		panel.add(dineroGastadoLabel);
		panel.add(totalLabel);
		panel.add(fechaVencimientoLabel);
		panel.add(logoutButton);
		getContentPane().add(panel);
	}
}
