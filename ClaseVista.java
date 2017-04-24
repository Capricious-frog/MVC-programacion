package mvc_proyecto;

import java.awt.Container; 
import java.awt.FlowLayout; 
import javax.swing.JButton; 
import javax.swing.JFrame; 
import javax.swing.JLabel; 
import javax.swing.JTextField;

public class ClaseVista extends JFrame {

	private static final long serialVersionUID = 1L;

	Container bloqueContenedor = null;  
	JButton botonNumero1 = null;
	JButton botonNumero2 = null;
	JButton botonNumero3 = null;

	public ClaseVista() {
		
		bloqueContenedor = getContentPane(); 
		setTitle("GRUPO 3"); 
		setLayout(new FlowLayout()); 
		setSize(800,500);

		botonNumero1 = new JButton("BUSCADOR");
		botonNumero2 = new JButton("PROGRAMA 2");
		botonNumero3 = new JButton("PROGRAMA 3");


		bloqueContenedor.add(botonNumero1);
		bloqueContenedor.add(botonNumero2);
		bloqueContenedor.add(botonNumero3);

		setVisible(true);
	}
}
