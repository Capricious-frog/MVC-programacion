package proyecto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.applet.AudioClip;
import java.util.InputMismatchException;

//Al pulsar un boton todas las ventanas se vuelven invisible y la que quieres acceder se hace visible
public class ClaseControlador extends Thread implements ActionListener {
	
	int res = 0;

	ClaseModelo objModelo = null;
	ClaseVista objVista = null;
	ClaseVista objVista2 = null;
	ClaseVista objVista3 = null;
	ClaseVista objVista4 = null;
	ClaseVista objVista5 = null;

	AudioClip sonido;

	public ClaseControlador(ClaseVista objVista, ClaseModelo objModelo, ClaseVista objVista2, ClaseVista objVista3, ClaseVista objVista4, ClaseVista objVista5) {
		this.objModelo = objModelo;
		this.objVista = objVista;
		this.objVista2 = objVista2;
		this.objVista3 = objVista3;
		this.objVista4 = objVista4;
		this.objVista5 = objVista5;
		actionListener(this);
	}

	//Son las instrucciones de los botones
	public void actionPerformed(ActionEvent objEvento) {
		int rnd1, rnd2;
		final int numMax = 50, numMin = -50;

		if (objEvento.getSource() == objVista.botonNumero1) {
			objVista.setVisible(false);
			objVista2.setVisible(true);
		} else if (objEvento.getSource() == objVista.botonNumero2) {
			JOptionPane.showMessageDialog(null, "Este es un programa hecho por los integrantes del GRUPO3© de 1DM3.\n Todo uso,copia o venta de de este programa sin licencia sera ilegal\n y podra ser llevado y juzgado ante LA LEY.");
		} else if (objEvento.getSource() == objVista.botonNumero3) {
			System.exit(0);
		} else if (objEvento.getSource() == objVista2.botonNumero4) {
			objVista2.setVisible(false);
			objVista3.setVisible(true);
		} else if (objEvento.getSource() == objVista2.botonNumero5) {
			objVista2.setVisible(false);
			objVista4.setVisible(true);
		} else if (objEvento.getSource() == objVista2.botonNumero6) {
			objVista2.setVisible(false);
			objVista5.setVisible(true);
		} else if (objEvento.getSource() == objVista4.botonNumero7) {
			objModelo.preguntasDeHistoria();
		} else if (objEvento.getSource() == objVista4.botonNumero8) {
			objModelo.preguntasDeDeportes();
		} else if (objEvento.getSource() == objVista4.botonNumero9) {
			objModelo.preguntasDeMusicas();
		} else if (objEvento.getSource() == objVista5.botonNumero10) {
			//Accion boton calcular
			try {
				if (res == Integer.parseInt(objVista5.cajaDeTextoNumero3.getText())){
					JOptionPane.showMessageDialog(null, "Has hacertado!");
				} else {
					JOptionPane.showMessageDialog(null, "Ohh no, has fallado!");
				}
			
			}catch (NumberFormatException e){
				JOptionPane.showMessageDialog(null, "No puedes introducir nada que no sean letras!");
			}catch (InputMismatchException e){
				JOptionPane.showMessageDialog(null, "No puedes introducir nada que no sean letras!");
			}
			
			rnd1 = (int) ((numMax-numMin+1)*Math.random()+numMin);
			rnd2 = (int) ((numMax-numMin+1)*Math.random()+numMin);

			switch ((int) ((numMax-numMin+1)*Math.random()+numMin)){
			case 1: ClaseVista.ponerTexto(rnd1+"+"+rnd2); 
			res = rnd1+rnd2;
			break;
			case 2: ClaseVista.ponerTexto(rnd1+"-"+rnd2);
			res = rnd1-rnd2;
			break;
			case 3: ClaseVista.ponerTexto(rnd1+"*"+rnd2);
			res = rnd1*rnd2;
			break;
			case 4: ClaseVista.ponerTexto(rnd1+"/"+rnd2);
			res = rnd1/rnd2;
			break;
			default: ClaseVista.ponerTexto(rnd1+"+"+rnd2);
			res = rnd1+rnd2;
			break;
			}
			
		}else if (objEvento.getSource() == objVista2.botonSalir1) {
			objVista2.setVisible(false);
			objVista.setVisible(true);
		} else if (objEvento.getSource() == objVista3.botonSalir2) {
			objVista3.setVisible(false);
			objVista.setVisible(true);
		} else if (objEvento.getSource() == objVista4.botonSalir3) {
			objVista4.setVisible(false);
			objVista.setVisible(true);
		}else if (objEvento.getSource() == objVista5.botonSalir4) {
			//Juego resolver ecuaciones
			objVista5.setVisible(false);
			objVista.setVisible(true);
		}  else if (objEvento.getSource() == objVista3.botonAtras1){
			objVista3.setVisible(false);
			objVista2.setVisible(true);
		}else if (objEvento.getSource() == objVista4.botonAtras2) {
			objVista4.setVisible(false);
			objVista2.setVisible(true);
		} else if (objEvento.getSource() == objVista5.botonAtras3) {
			//Juego ecauciones fecha atras
			objVista5.setVisible(false);
			objVista2.setVisible(true);
		} else if (objEvento.getSource() == objVista3.botonConvertir) {

			Object moneda1 = this.objVista3.divisas.getSelectedItem();
			String dinero = this.objVista3.cajaDeTextoNumero1.getText();
			Object moneda2 = this.objVista3.divisas2.getSelectedItem();

			try {
				sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Musica/sound.wav"));
				sonido.play();

				objModelo.conversor(moneda1, dinero, moneda2);
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "No se pueden introducir letras.");

			} catch (NullPointerException e) {
				JOptionPane.showMessageDialog(null, "Tienes que elegir una moneda.");
			}
		} 
	}

	public void actionListener(ActionListener escuchador) {
		objVista.botonNumero1.addActionListener(escuchador);
		objVista.botonNumero2.addActionListener(escuchador);
		objVista.botonNumero3.addActionListener(escuchador);
		objVista2.botonNumero4.addActionListener(escuchador);
		objVista2.botonNumero5.addActionListener(escuchador);
		objVista2.botonNumero6.addActionListener(escuchador);
		objVista4.botonNumero7.addActionListener(escuchador);
		objVista4.botonNumero8.addActionListener(escuchador);
		objVista4.botonNumero9.addActionListener(escuchador);
		objVista5.botonNumero10.addActionListener(escuchador);

		objVista2.botonSalir1.addActionListener(escuchador);
		objVista3.botonSalir2.addActionListener(escuchador);
		objVista4.botonSalir3.addActionListener(escuchador);
		objVista5.botonSalir4.addActionListener(escuchador);

		objVista3.botonConvertir.addActionListener(escuchador);

		objVista3.botonAtras1.addActionListener(escuchador);
		objVista4.botonAtras2.addActionListener(escuchador);
		objVista5.botonAtras3.addActionListener(escuchador);

		objVista5.cajaDeTextoNumero3.addActionListener(escuchador);
	}
}