package proyecto;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.Font;

public class ClaseVista extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;

	JPanel addPanel = new JPanel();
	JButton addButton = new JButton("Add");

	/*Todos estan en el mismo orden que abajo
	 * 
	 * bloqueContenedor  Bloque contenedor de la ventana principal
	 * bloqueContenedor2 --> Bloque contenedor de la ventana del primer programa (conversor de dinero)
	 * bloqueContenedor3 --> Bloque contenedor de la ventana de programas (menu de programas)
	 * bloqueContenedor4 --> Bloque contenedor los quizz (menu para seleccionar entre los tres quizz)
	 * bloqueContenedor5 --> Bloque contenedor sin utilizar (juego solucionar ecuaciones)
	 * 
	 * cajaDeTextoNumero1 --> Caja de texto conversor
	 * cajaDeTextoNumero2 --> Caja de texto numero para el juego solucionar ecuaciones
	 * cajaDeTextoNumero3 --> Caja de texto numero resultado juego solucionar ecuaciones
	 * 
	 * botonNumero1 --> Boton "programas" ventana principal
	 * botonNumero2 --> Boton "informacion" ventana principal
	 * botonNumero3 --> Boton "Salir" ventana principal
	 * botonNumero4 --> Boton "Programa 1" lista programas
	 * botonNumero5 --> Boton "Programa 2" lista programas
	 * botonNumero6 --> Boton "Programa 3" lista programas
	 * botonNumero7 --> Boton "Historia" programa quiz
	 * botonNumero8 --> Boton "Deportes" programa quiz
	 * botonNumero9 --> Boton "Musica" programa quiz
	 * botonNumero10 --> Boton enviar programa juego solucionar ecuaciones
	 * botonNumero11 --> Boton emprezar juego ecuaciones
	 * 
	 * botonSalir1 --> Boton casa segunda lista programas
	 * botonSalir2 --> Boton casa programa conversor
	 * botonSalir3 --> Boton casa programa quiz
	 * botonSalir4 --> Boton programa juego memoria
	 * 
	 * botonAtras1 --> Boton flecha atras conversor
	 * botonAtras2 --> Boton flecha atras quiz
	 * botonAtras3 --> Boton flecha atras juego solucionar ecuaciones
	 * 
	 * botonConvertir --> Boton "Convertir" en el conversor
	 */
	
	
	
	Container bloqueContenedor = null;
	Container bloqueContenedor2 = null;
	Container bloqueContenedor3 = null;
	Container bloqueContenedor4 = null;
	Container bloqueContenedor5 = null;
	
	JTextField cajaDeTextoNumero1 = null;
	public static JTextField cajaDeTextoNumero2 = null;
	JTextField cajaDeTextoNumero3 = null;
	
	JButton botonNumero1 = null;
	JButton botonNumero2 = null;
	JButton botonNumero3 = null;
	JButton botonNumero4 = null;
	JButton botonNumero5 = null;
	JButton botonNumero6 = null;
	JButton botonNumero7 = null;
	JButton botonNumero8 = null;
	JButton botonNumero9 = null;
	JButton botonNumero10 = null;
	JButton botonNumero11 = null;
	
	JButton botonSalir1 = null;
	JButton botonSalir2 = null;
	JButton botonSalir3 = null;
	JButton botonSalir4 = null;
	
	JButton botonAtras1 = null;
	JButton botonAtras2 = null;
	JButton botonAtras3 = null;
	JButton botonConvertir = null;

	//Array con las diferentes opciones de conversion
	String[] arrayDivisas = {
			"Euro - €",
			"Dolar - $",
			"Yen - ¥",
			"Libras - £",
			"Pesos - $"
	};

	JComboBox<Object> divisas = null, divisas2 = null;
	JFrame frame = null;

	//Ventana principal
	public ClaseVista() {

		bloqueContenedor = getContentPane();
		setTitle("GRUPO 3");
		setLayout(new FlowLayout());
		bloqueContenedor.setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(910, 600);
		setLocationRelativeTo(null);

		botonNumero1 = new JButton("PROGRAMAS");
		botonNumero1.setBounds(350, 270, 200, 50);
		botonNumero1.setFont(new Font("Fipps", Font.ITALIC, 15));
		bloqueContenedor.add(botonNumero1);

		botonNumero2 = new JButton("INFORMACION");
		botonNumero2.setBounds(350, 350, 200, 50);
		botonNumero2.setFont(new Font("Fipps", Font.ITALIC, 15));
		bloqueContenedor.add(botonNumero2);

		botonNumero3 = new JButton("SALIR");
		botonNumero3.setBounds(350, 430, 200, 50);
		botonNumero3.setFont(new Font("Fipps", Font.ITALIC, 15));
		bloqueContenedor.add(botonNumero3);

		//Comando para poner una imagen de fondo
		((JPanel) getContentPane()).setOpaque(false);
		ImageIcon uno = new ImageIcon(this.getClass().getResource("/imagenes/fondo.gif"));
		JLabel fondo = new JLabel();
		fondo.setIcon(uno);
		getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
		fondo.setBounds(0, 0, uno.getIconWidth(), uno.getIconHeight());

		setVisible(true);

	}

	//Ventana del programa conversor
	public ClaseVista(boolean z) {

		bloqueContenedor3 = getContentPane();
		setTitle("CONVERSOR");
		setLayout(new FlowLayout());
		bloqueContenedor3.setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(910, 600);
		setLocationRelativeTo(null);

		divisas = new JComboBox<Object>(arrayDivisas);
		divisas.setBounds(100, 170, 120, 50);
		divisas.setFont(new Font("Tahoma", Font.BOLD, 20));
		divisas.setSelectedIndex(-1);
		bloqueContenedor3.add(divisas);

		cajaDeTextoNumero1 = new JTextField("", 10);
		cajaDeTextoNumero1.setBounds(350, 160, 200, 80);
		cajaDeTextoNumero1.setFont(new Font("Tahoma", Font.BOLD, 25));
		cajaDeTextoNumero1.setHorizontalAlignment(JTextField.CENTER);
		bloqueContenedor3.add(cajaDeTextoNumero1);

		divisas2 = new JComboBox<Object>(arrayDivisas);
		divisas2.setBounds(670, 170, 120, 50);
		divisas2.setFont(new Font("Tahoma", Font.BOLD, 20));
		divisas2.setSelectedIndex(-1);
		bloqueContenedor3.add(divisas2);

		botonConvertir = new JButton("Convertir");
		botonConvertir.setBounds(350, 350, 200, 80);
		botonConvertir.setFont(new Font("Tahoma", Font.BOLD, 20));
		bloqueContenedor3.add(botonConvertir);

		botonSalir2 = new JButton("");
		botonSalir2.setBounds(795, 470, 70, 70);
		botonSalir2.setFont(new Font("Tahoma", Font.BOLD, 20));
		bloqueContenedor3.add(botonSalir2);
		botonSalir2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/casa.png")));

		botonAtras1 = new JButton("");
		botonAtras1.setBounds(25, 470, 70, 70);
		botonAtras1.setFont(new Font("Tahoma", Font.BOLD, 20));
		bloqueContenedor3.add(botonAtras1);
		botonAtras1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/back.png")));

		//Comando para poner una imagen de fondo
		((JPanel) getContentPane()).setOpaque(false);
		ImageIcon uno = new ImageIcon(this.getClass().getResource("/imagenes/fondo_dinero.jpg"));
		JLabel fondo = new JLabel();
		fondo.setIcon(uno);
		getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
		fondo.setBounds(0, 0, uno.getIconWidth(), uno.getIconHeight());


		setVisible(false);
	}

	//Ventana con la lista de programas
	public ClaseVista(int i) {

		bloqueContenedor2 = getContentPane();
		setTitle("POGRAMAS");
		setLayout(new FlowLayout());
		bloqueContenedor2.setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(910, 600);
		setLocationRelativeTo(null);

		botonNumero4 = new JButton("PROGRAMA 1");
		botonNumero4.setBounds(60, 70, 200, 50);
		botonNumero4.setFont(new Font("Fipps", Font.ITALIC, 15));
		bloqueContenedor2.add(botonNumero4);

		botonNumero5 = new JButton("PROGRAMA 2");
		botonNumero5.setBounds(60, 240, 200, 50);
		botonNumero5.setFont(new Font("Fipps", Font.ITALIC, 15));
		bloqueContenedor2.add(botonNumero5);

		botonNumero6 = new JButton("PROGRAMA 3");
		botonNumero6.setBounds(60, 400, 200, 50);
		botonNumero6.setFont(new Font("Fipps", Font.ITALIC, 15));
		bloqueContenedor2.add(botonNumero6);

		botonSalir1 = new JButton("");
		botonSalir1.setBounds(795, 470, 70, 70);
		botonSalir1.setFont(new Font("Tahoma", Font.BOLD, 20));
		bloqueContenedor2.add(botonSalir1);
		botonSalir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/casa.png")));

		//Comando para poner una imagen de fondo
		((JPanel) getContentPane()).setOpaque(false);
		ImageIcon uno = new ImageIcon(this.getClass().getResource("/imagenes/fondo2.png"));
		JLabel fondo = new JLabel();
		fondo.setIcon(uno);
		getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
		fondo.setBounds(0, 0, uno.getIconWidth(), uno.getIconHeight());

		setVisible(false);

	}

	//Ventana de los diferentes quizz
	public ClaseVista(String i) {

		bloqueContenedor4 = getContentPane();
		setTitle("QUIZ");
		setLayout(new FlowLayout());
		bloqueContenedor4.setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(910, 600);
		setLocationRelativeTo(null);

		botonNumero7 = new JButton("HISTORIA");
		botonNumero7.setBounds(50, 350, 200, 50);
		botonNumero7.setFont(new Font("Fipps", Font.ITALIC, 15));
		bloqueContenedor4.add(botonNumero7);

		botonNumero8 = new JButton("DEPORTES");
		botonNumero8.setBounds(356, 350, 200, 50);
		botonNumero8.setFont(new Font("Fipps", Font.ITALIC, 15));
		bloqueContenedor4.add(botonNumero8);

		botonNumero9 = new JButton("MUSICA");
		botonNumero9.setBounds(650, 350, 200, 50);
		botonNumero9.setFont(new Font("Fipps", Font.ITALIC, 15));
		bloqueContenedor4.add(botonNumero9);

		botonSalir3 = new JButton("");
		botonSalir3.setBounds(795, 470, 70, 70);
		botonSalir3.setFont(new Font("Tahoma", Font.BOLD, 20));
		bloqueContenedor4.add(botonSalir3);
		botonSalir3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/casa.png")));

		botonAtras2 = new JButton("");
		botonAtras2.setBounds(25, 470, 70, 70);
		botonAtras2.setFont(new Font("Tahoma", Font.BOLD, 20));
		bloqueContenedor4.add(botonAtras2);
		botonAtras2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/back.png")));

		//Comando para poner una imagen de fondo
		((JPanel) getContentPane()).setOpaque(false);
		ImageIcon uno = new ImageIcon(this.getClass().getResource("/imagenes/fondo_deportes.png"));
		JLabel fondo = new JLabel();
		fondo.setIcon(uno);
		getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
		fondo.setBounds(0, 0, uno.getIconWidth(), uno.getIconHeight());

		setVisible(false);
	}

	public ClaseVista(float f) {

		bloqueContenedor5 = getContentPane();
		setTitle("Juego de memoria");
		setLayout(new FlowLayout());
		bloqueContenedor5.setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(910, 600);
		setLocationRelativeTo(null);

		//Area de texto con la ecuacion a resolver
		cajaDeTextoNumero2 = new JTextField("", 10);
		cajaDeTextoNumero2.setBounds(340, 100, 230, 60);
		cajaDeTextoNumero2.setFont(new Font("Tahoma", Font.BOLD, 25));
		cajaDeTextoNumero2.setHorizontalAlignment(JTextField.CENTER);
		cajaDeTextoNumero2.setEditable(false);
		bloqueContenedor5.add(cajaDeTextoNumero2);

		//Area de texto para introducir el numero
		cajaDeTextoNumero3 = new JTextField("", 10);
		cajaDeTextoNumero3.setBounds(350, 300, 200, 50);
		cajaDeTextoNumero3.setFont(new Font("Tahoma", Font.BOLD, 25));
		cajaDeTextoNumero3.setHorizontalAlignment(JTextField.CENTER);
		bloqueContenedor5.add(cajaDeTextoNumero3);


		//Boton de emprezar
		botonNumero10 = new JButton("COMPROBAR");
		botonNumero10.setBounds(350, 400, 200, 50);
		botonNumero10.setFont(new Font("Fipps", Font.ITALIC, 15));
		bloqueContenedor5.add(botonNumero10);

		

		//Boton inicio con icono de casa
		botonSalir4 = new JButton("");
		botonSalir4.setBounds(795, 470, 70, 70);
		botonSalir4.setFont(new Font("Tahoma", Font.BOLD, 20));
		bloqueContenedor5.add(botonSalir4);
		botonSalir4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/casa.png")));

		//Boton flecha ventana anterior
		botonAtras3 = new JButton("");
		botonAtras3.setBounds(25, 470, 70, 70);
		botonAtras3.setFont(new Font("Tahoma", Font.BOLD, 20));
		bloqueContenedor5.add(botonAtras3);
		botonAtras3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/back.png")));


		//Comando para poner una imagen de fondo
		((JPanel) getContentPane()).setOpaque(false);
		ImageIcon uno = new ImageIcon(this.getClass().getResource("/Imagenes/memoria.png"));
		JLabel fondo = new JLabel();
		fondo.setIcon(uno);
		getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
		fondo.setBounds(0, 0, uno.getIconWidth(), uno.getIconHeight());
		setVisible(false);
	}

	public static void ponerTexto(String numer){
		cajaDeTextoNumero2.setText(numer);
	}
}