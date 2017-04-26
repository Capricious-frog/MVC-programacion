import java.awt.Container; 
import java.awt.FlowLayout; 
import javax.swing.JButton; 
import javax.swing.JFrame; 
import javax.swing.JLabel; 
import javax.swing.JTextField;
import javax.swing.*;
import java.awt.Font;
import java.awt.Container;
//import java.awt.Image;
import javax.swing.JFrame;

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
		
		((JPanel)getContentPane()).setOpaque(false); ImageIcon uno=new ImageIcon(this.getClass().getResource("/imagenes/fon.jpg")); JLabel fondo= new JLabel(); fondo.setIcon(uno); getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER); fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
	}
}
