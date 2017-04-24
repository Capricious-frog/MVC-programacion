package mvc_proyecto;

import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class ClaseControlador implements ActionListener {


	ClaseModelo objModelo = null;
	ClaseVista objVista = null;

	public ClaseControlador(ClaseVista objVista, ClaseModelo objModelo) { 
		this.objModelo = objModelo; 
		this.objVista = objVista; 
		actionListener(this);
	}


	@Override 
	public void actionPerformed(ActionEvent objEvento) {
		try {

			
		}
		catch(Exception objExcepcion) {
			objExcepcion.printStackTrace();
		}
		System.exit(0);
	}

	public void actionListener(ActionListener escuchador) {
		objVista.botonNumero1.addActionListener(escuchador);
	}

}
