import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class JFrameCalculadora extends JFrame implements ActionListener{
	
	private JLabel pantalla;
	private double resultado = 0;
	private String operacion = "";
	private boolean nuevaOperacion = true;
	
	public JFrameCalculadora()
	{
		setTitle("Mi calculadora");
		setSize(300,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false); //Sirve para poder reajustar la ventana
	
		// Creo la pantalla
		pantalla = new JLabel("0");
		pantalla.setHorizontalAlignment(JLabel.RIGHT);
		pantalla.setPreferredSize(new Dimension(300, 30));
		add(pantalla, BorderLayout.NORTH);
		
		String[] nombreBotones = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0", ".", "+", "-", "*", "/", "="};
		JPanel panelBotones = new JPanel();
		panelBotones.setLayout(new GridLayout(4, 4));
		
		for (int i = 0; i < nombreBotones.length; i++)
		{
				JButton boton = new JButton(nombreBotones[i]);
				boton.addActionListener(this);
				panelBotones.add(boton);
		}
		add(panelBotones, BorderLayout.CENTER);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String textoBoton = e.getActionCommand();
		if (textoBoton.equals("0") || textoBoton.equals("1")
				|| textoBoton.equals("2") || textoBoton.equals("3")
				|| textoBoton.equals("4") || textoBoton.equals("5")
				|| textoBoton.equals("6") || textoBoton.equals("7")
				|| textoBoton.equals("8") || textoBoton.equals("9") || textoBoton.equals("."))
		{
			if (nuevaOperacion)
			{
				pantalla.setText(textoBoton);
				nuevaOperacion = false;
			}
			else
				pantalla.setText(pantalla.getText() + textoBoton);
		}
		else if (textoBoton.equals("+") || textoBoton.equals("-")
					|| textoBoton.equals("*") || textoBoton.equals("/"))
		{
			if (!operacion.equals(""))
				calcular();
			operacion = textoBoton;
			resultado = Double.parseDouble(pantalla.getText());
			nuevaOperacion = true;
		}
		else if (textoBoton.equals("="))
		{
			calcular();
			operacion = "";
			nuevaOperacion = true;
		}
	}
	
	public void calcular()
	{
		if (operacion.equals("+"))
			resultado += Double.parseDouble(pantalla.getText());
		else if (operacion.equals("-"))
			resultado -= Double.parseDouble(pantalla.getText());
		else if (operacion.equals("*"))
			resultado *= Double.parseDouble(pantalla.getText());
		else if (operacion.equals("/"))
			resultado /= Double.parseDouble(pantalla.getText());
		pantalla.setText("" + resultado);
	}
	
	public static void main(String[] args)
	{
		@SuppressWarnings("unused")
		JFrameCalculadora calc = new JFrameCalculadora();
		
	}
}
