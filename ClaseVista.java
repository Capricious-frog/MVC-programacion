import java.awt.Container; 
import java.awt.FlowLayout; 
import javax.swing.JButton; 
import javax.swing.JFrame; 
import javax.swing.JLabel; 
import javax.swing.JTextField;
import javax.swing.*;
import java.awt.*;
import javax.swing.*;
import java.awt.Font;
import java.awt.Container;
import java.awt.Image;
import javax.swing.JFrame;


public class ClaseVista extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;

	JPanel addPanel = new JPanel();
	JButton addButton= new JButton("Add");
	    
	Container bloqueContenedor = null;  
	Container bloqueContenedor2 = null;
	JButton botonNumero1 = null;
	JButton botonNumero2 = null;
	JButton botonNumero3 = null;

	public ClaseVista() {
		
		bloqueContenedor = getContentPane(); 
		setTitle("GRUPO 3"); 
		setLayout(new FlowLayout()); 
		bloqueContenedor.setLayout(null);
		setSize(900,600);

		botonNumero1 = new JButton("PROGRAMA 1");
		botonNumero1.setBounds(350,220,200,80);
		bloqueContenedor.add(botonNumero1);	
		
		botonNumero2 = new JButton("INFORMACION");
		botonNumero2.setBounds(350,320,200,80);
		bloqueContenedor.add(botonNumero2);	
		
		botonNumero3 = new JButton("SALIR");
		botonNumero3.setBounds(350,420,200,80);
		bloqueContenedor.add(botonNumero3);	
		

		setVisible(true);
		
		((JPanel)getContentPane()).setOpaque(false); ImageIcon uno=new ImageIcon(this.getClass().getResource("/Imagenes/fondo.jpg")); JLabel fondo= new JLabel(); fondo.setIcon(uno); getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER); fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight()); 
	}
}
