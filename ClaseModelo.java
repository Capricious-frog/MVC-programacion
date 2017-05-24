import javax.swing.*;
import java.awt.Font;
import javax.swing.plaf.*;
import java.applet.AudioClip;

public class ClaseModelo {

	AudioClip sonido;

	//Programa conversor de dinero
	public void conversor(Object n1, String n2, Object n3) {

		Double total;
		Double numero1 = Double.parseDouble(n2);

		if (n1 == "Euro - €" && n3 == "Dolar - $") {
			total = numero1 * 1.0990;
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.BOLD, 20)));
			JOptionPane.showMessageDialog(null, String.format("%.2f", numero1) + "€ son " + String.format("%.2f", total) + "$");
		} else if (n1 == "Euro - €" && n3 == "Yen - ¥") {
			total = numero1 * 123.76;
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.BOLD, 20)));
			JOptionPane.showMessageDialog(null, String.format("%.2f", numero1) + "€ son " + String.format("%.2f", total) + "¥");
		} else if (n1 == "Euro - €" && n3 == "Libras - £") {
			total = numero1 * 0.84777;
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.BOLD, 20)));
			JOptionPane.showMessageDialog(null, String.format("%.2f", numero1) + "€ son " + String.format("%.2f", total) + "£");
		} else if (n1 == "Euro - €" && n3 == "Pesos - $") {
			total = numero1 * 20.905;
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.BOLD, 20)));
			JOptionPane.showMessageDialog(null, String.format("%.2f", numero1) + "€ son " + String.format("%.2f", total) + "$ (Pesos)");
		} else if (n1 == "Dolar - $" && n3 == "Euro - €") {
			total = numero1 * 0.90991;
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.BOLD, 20)));
			JOptionPane.showMessageDialog(null, String.format("%.2f", numero1) + "$ son " + String.format("%.2f", total) + "€");
		} else if (n1 == "Dolar - $" && n3 == "Yen - ¥") {
			total = numero1 * 112.61;
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.BOLD, 20)));
			JOptionPane.showMessageDialog(null, String.format("%.2f", numero1) + "$ son " + String.format("%.2f", total) + "¥");
		} else if (n1 == "Dolar - $" && n3 == "Libras - £") {
			total = numero1 * 0.77140;
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.BOLD, 20)));
			JOptionPane.showMessageDialog(null, String.format("%.2f", numero1) + "$ son " + String.format("%.2f", total) + "£");
		} else if (n1 == "Dolar - $" && n3 == "Pesos - $") {
			total = numero1 * 19.021;
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.BOLD, 20)));
			JOptionPane.showMessageDialog(null, String.format("%.2f", numero1) + "$ son " + String.format("%.2f", total) + "$ (Pesos)");
		} else if (n1 == "Yen - ¥" && n3 == "Euro - €") {
			total = numero1 * 0.0080800;
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.BOLD, 20)));
			JOptionPane.showMessageDialog(null, String.format("%.2f", numero1) + "¥ son " + String.format("%.2f", total) + "€");
		} else if (n1 == "Yen - ¥" && n3 == "Dolar - $") {
			total = numero1 * 0.0088800;
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.BOLD, 20)));
			JOptionPane.showMessageDialog(null, String.format("%.2f", numero1) + "¥ son " + String.format("%.2f", total) + "$");
		} else if (n1 == "Yen - ¥" && n3 == "Libras - £") {
			total = numero1 * 0.0068500;
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.BOLD, 20)));
			JOptionPane.showMessageDialog(null, String.format("%.2f", numero1) + "¥ son " + String.format("%.2f", total) + "£");
		} else if (n1 == "Yen - ¥" && n3 == "Pesos - $") {
			total = numero1 * 0.16891;
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.BOLD, 20)));
			JOptionPane.showMessageDialog(null, String.format("%.2f", numero1) + "¥ son " + String.format("%.2f", total) + "$ (Pesos)");
		} else if (n1 == "Libras - £" && n3 == "Euro - €") {
			total = numero1 * 1.1796;
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.BOLD, 20)));
			JOptionPane.showMessageDialog(null, String.format("%.2f", numero1) + "£ son " + String.format("%.2f", total) + "€");
		} else if (n1 == "Libras - £" && n3 == "Dolar - $") {
			total = numero1 * 1.2963;
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.BOLD, 20)));
			JOptionPane.showMessageDialog(null, String.format("%.2f", numero1) + "£ son " + String.format("%.2f", total) + "$");
		} else if (n1 == "Libras - £" && n3 == "Yen - ¥") {
			total = numero1 * 145.99;
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.BOLD, 20)));
			JOptionPane.showMessageDialog(null, String.format("%.2f", numero1) + "£ son " + String.format("%.2f", total) + "¥");
		} else if (n1 == "Libras - £" && n3 == "Pesos - $") {
			total = numero1 * 24.658;
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.BOLD, 20)));
			JOptionPane.showMessageDialog(null, String.format("%.2f", numero1) + "£ son " + String.format("%.2f", total) + "$ (Pesos)");
		} else if (n1 == "Pesos - $" && n3 == "Euro - €") {
			total = numero1 * 1.1796;
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.BOLD, 20)));
			JOptionPane.showMessageDialog(null, String.format("%.2f", numero1) + "$ (Pesos) son " + String.format("%.2f", total) + "€");
		} else if (n1 == "Pesos - $" && n3 == "Dolar - $") {
			total = numero1 * 1.2963;
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.BOLD, 20)));
			JOptionPane.showMessageDialog(null, String.format("%.2f", numero1) + "$ (Pesos) son " + String.format("%.2f", total) + "$");
		} else if (n1 == "Pesos - $" && n3 == "Libras - £") {
			total = numero1 * 145.99;
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.BOLD, 20)));
			JOptionPane.showMessageDialog(null, String.format("%.2f", numero1) + "$ (Pesos) son " + String.format("%.2f", total) + "£");
		} else if (n1 == "Pesos - $" && n3 == "Yen - ¥") {
			total = numero1 * 24.658;
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.BOLD, 20)));
			JOptionPane.showMessageDialog(null, String.format("%.2f", numero1) + "$ (Pesos) son " + String.format("%.2f", total) + "¥");
		} else if (n1 == "Euro - €" && n3 == "Euro - €") {
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.BOLD, 20)));
			JOptionPane.showMessageDialog(null, "Eres tonto o que");
		} else if (n1 == "Dolar - $" && n3 == "Dolar - $") {
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.BOLD, 20)));
			JOptionPane.showMessageDialog(null, "No se puede convertir al mismo tipo de divisa.");
		} else if (n1 == "Yen - ¥" && n3 == "Yen - ¥") {
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.BOLD, 20)));
			JOptionPane.showMessageDialog(null, "No se puede convertir al mismo tipo de divisa.");
		} else if (n1 == "Libras - £" && n3 == "Libras - £") {
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.BOLD, 20)));
			JOptionPane.showMessageDialog(null, "No se puede convertir al mismo tipo de divisa.");
		} else if (n1 == "Pesos - $" && n3 == "Pesos - $") {
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.BOLD, 20)));
			JOptionPane.showMessageDialog(null, "No se puede convertir al mismo tipo de divisa.");
		}
	}

	//Quizz de historia
	public void preguntasDeHistoria() {

		int aciertos = 0, errores = 0;
		String error1 = "";

		Object pregunta1 = JOptionPane.showInputDialog(null, "1- ¿En que año descrubrió Colón América?",
				"preguntas", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] {
						" ",
						"1502.",
						"1488.",
						"1496.",
						"1492."
		}, "");

		if (pregunta1 == "1492.") {
			aciertos++;
		} else {
			error1 = "¿En que año descrubrió Colón América? - 1492.";
			errores++;
		}

		Object pregunta2 = JOptionPane.showInputDialog(null, "2- ¿Cuál era la capital del Imperio Inca?",
				"preguntas", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] {
						" ",
						"Lima.",
						"Cuzco.",
						"Machu Picchu.",
						"Quito."
		}, "");

		if (pregunta2 == "Cuzco.") {
			aciertos++;
		} else {
			error1 = error1 + "\n¿Cuál era la capital del Imperio Inca? - Cuzco.";
			errores++;
		}

		Object pregunta3 = JOptionPane.showInputDialog(null, "3- ¿En que guerra participó Juana de Arco?",
				"preguntas", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] {
						" ",
						"La guerra de los 30 años.",
						"La guerra de los 100 años.",
						"La primera cruzada.",
						"Guerras napoleónicas."
		}, "");

		if (pregunta3 == "La guerra de los 100 años.") {
			aciertos++;
		} else {
			error1 = error1 + "\n¿En que guerra participó Juana de Arco? - La guerra de los 100 años.";
			errores++;
		}

		Object pregunta4 = JOptionPane.showInputDialog(null, "4- ¿Cuándo se produjo principalmente el Siglo de Oro?",
				"preguntas", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] {
						" ",
						"Siglo XV.",
						"Siglo XVI.",
						"Siglo XVII.",
						"Siglo XIV"
		}, "");

		if (pregunta4 == "Siglo XVI.") {
			aciertos++;
		} else {
			error1 = error1 + "\n¿Cuándo se produjo principalmente el Siglo de Oro? - Siglo XVI.";
			errores++;
		}

		Object pregunta5 = JOptionPane.showInputDialog(null, "5- ¿Cómo se llamaba el padre de Alejandro Magno?",
				"preguntas", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] {
						" ",
						"Filipo II de Macedonia.",
						"Ptolomeo I.",
						"Leonidas.",
						"Flipo I de Grecia."
		}, "");

		if (pregunta5 == "Filipo II de Macedonia.") {
			aciertos++;
		} else {
			error1 = error1 + "\n¿Cómo se llamaba el padre de Alejandro Magno? - Filipo II de Macedonia.";
			errores++;
		}

		Object pregunta6 = JOptionPane.showInputDialog(null, "6- ¿De qué año es la Pepa, la primera Constitución española?",
				"preguntas", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] {
						" ",
						"1806.",
						"1792.",
						"1822.",
						"1812"
		}, "");

		if (pregunta6 == "1812.") {
			aciertos++;
		} else {
			error1 = error1 + "\n¿De qué año es la Pepa, la primera Constitución española? - 1812.";
			errores++;
		}

		Object pregunta7 = JOptionPane.showInputDialog(null, "7- ¿Quién fue el primer emperador romano?",
				"preguntas", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] {
						" ",
						"Nerón.",
						"Cesar Augusto.",
						"Julio Cesar.",
						"Calígula."
		}, "");

		if (pregunta7 == "Cesar Augusto.") {
			aciertos++;
		} else {
			error1 = error1 + "\n¿Quién fue el primer emperador romano? - Cesar Augusto.";
			errores++;
		}

		Object pregunta8 = JOptionPane.showInputDialog(null, "8- ¿Inglaterra, Francia y Rusia conformaron la...?",
				"preguntas", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] {
						" ",
						"Entente.",
						"Centrales.",
						"Alianza.",
						"El eje."
		}, "");

		if (pregunta8 == "Alianza.") {
			aciertos++;
		} else {
			error1 = error1 + "\n¿Inglaterra, Francia y Rusia conformaron la...? - Alianza. ";
			errores++;
		}

		Object pregunta9 = JOptionPane.showInputDialog(null, "9- ¿En que país nació Adolf Hitler?",
				"preguntas", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] {
						" ",
						"Alemania.",
						"Austria.",
						"Polonia.",
						"Suiza."
		}, "");

		if (pregunta9 == "Austria.") {
			aciertos++;
		} else {
			error1 = error1 + "\n¿En que país nació Adolf Hitler? - Austria.";
			errores++;
		}

		Object pregunta10 = JOptionPane.showInputDialog(null, "10- ¿En que isla murió Napoleón?",
				"preguntas", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] {
						" ",
						"Corcega.",
						"Elba.",
						"Santa Elena.",
						"Cerdeña."
		}, "");

		if (pregunta10 == "Santa Elena.") {
			aciertos++;
		} else {
			error1 = error1 + "\n¿En que isla murió Napoleón? - Santa Elena.";
			errores++;
		}
		
		if(errores==10){
			sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Musica/sound2.wav"));
			sonido.play();
		}else if(aciertos==10){
			sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Musica/sound3.wav"));
			sonido.play();
		}

		/*Resultado del quizz
		Te muestra las preguntas falladas y lo aciertos*/
		JOptionPane.showMessageDialog(null, "Preguntas acertadas: " + aciertos + ", Preguntas falladas: " + errores + "\n" + error1);
	}

	//Quizz de deportes
	public void preguntasDeDeportes() {

		int aciertos = 0, errores = 0;
		String error1 = "";

		Object pregunta1 = JOptionPane.showInputDialog(null, "1- ¿Cuántas finales del mundo jugó la Selección Argentina de fútbol?",
				"preguntas", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] {
						" ",
						"Cinco.",
						"Seis.",
						"Cuatro.",
						"Tres."
		}, "");

		if (pregunta1 == "Cuatro.") {
			aciertos++;
		} else {
			error1 = "¿Cuántas finales del mundo jugó la Selección Argentina de fútbol? - Cuatro.";
			errores++;
		}

		Object pregunta2 = JOptionPane.showInputDialog(null, "2- ¿Cuántos jugadores componen un equipo de rugby?",
				"preguntas", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] {
						" ",
						"11.",
						"12.",
						"15.",
						"21."
		}, "");

		if (pregunta2 == "15.") {
			aciertos++;
		} else {
			error1 = error1 + "\n¿Cuántos jugadores componen un equipo de rugby? - 15.";
			errores++;
		}

		Object pregunta3 = JOptionPane.showInputDialog(null, "3- ¿En qué país se inventó el voleibol?",
				"preguntas", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] {
						" ",
						"Gran Bretaña.",
						"Francia.",
						"Rusia.",
						"Estados Unidos."
		}, "");

		if (pregunta3 == "Estados Unidos.") {
			aciertos++;
		} else {
			error1 = error1 + "\n¿En qué país se inventó el voleibol? - Estados Unidos";
			errores++;
		}

		Object pregunta4 = JOptionPane.showInputDialog(null, "4- ¿Qué halterofilo español es campeón del mundo?",
				"preguntas", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] {
						" ",
						"Maria de la Puente.",
						"Junior Santana.",
						"Lydia Valentin.",
						"David Sachez."
		}, "");

		if (pregunta4 == "Lydia Valentin.") {
			aciertos++;
		} else {
			error1 = error1 + "\n¿Qué halterofilo español es campeón del mundo? - Lydia Valentin.";
			errores++;
		}

		Object pregunta5 = JOptionPane.showInputDialog(null, "5- ¿De qué color es el cero en el cilindro de la ruleta?",
				"preguntas", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] {
						" ",
						"Blanco.",
						"Negro.",
						"Rojo.",
						"Verde."
		}, "");

		if (pregunta5 == "Verde.") {
			aciertos++;
		} else {
			error1 = error1 + "\n¿De qué color es el cero en el cilindro de la ruleta? - Verde.";
			errores++;
		}

		Object pregunta6 = JOptionPane.showInputDialog(null, "6- ¿Cuántos puntos vale un tiro libre encestado en baloncesto?",
				"preguntas", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] {
						" ",
						"Uno.",
						"Dos.",
						"Tres.",
						"Depende."
		}, "");

		if (pregunta6 == "Uno.") {
			aciertos++;
		} else {
			error1 = error1 + "\n¿Cuántos puntos vale un tiro libre encestado en baloncesto? - Uno.";
			errores++;
		}

		Object pregunta7 = JOptionPane.showInputDialog(null, "7- ¿Cuál de estos pilotos no es de F1?",
				"preguntas", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] {
						" ",
						"Richard Petty.",
						"Fernando Alonso.",
						"Sebastian Vettel.",
						"Mark Webber."
		}, "");

		if (pregunta7 == "Richard Petty.") {
			aciertos++;
		} else {
			error1 = error1 + "\n¿Cuál de estos pilotos no es de F1? - Richard Petty.";
			errores++;
		}

		Object pregunta8 = JOptionPane.showInputDialog(null, "8- ¿Dónde se inventó el tenis de mesa?",
				"preguntas", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] {
						" ",
						"China.",
						"Japón.",
						"Korea del Sur.",
						"Inglaterra."
		}, "");

		if (pregunta8 == "Inglaterra.") {
			aciertos++;
		} else {
			error1 = error1 + "\n¿Dónde se inventó el tenis de mesa? - Inglaterra.";
			errores++;
		}

		Object pregunta9 = JOptionPane.showInputDialog(null, "9- ¿Cuánto dura un partido de balonmano?",
				"preguntas", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] {
						" ",
						"30 minutos.",
						"45 minutos.",
						"60 minutos.",
						"90 minutos."
		}, "");

		if (pregunta9 == "60 minutos.") {
			aciertos++;
		} else {
			error1 = error1 + "\n¿Cuánto dura un partido de balonmano? - 60 minutos.";
			errores++;
		}

		Object pregunta10 = JOptionPane.showInputDialog(null, "10- ¿Cuántos cuadros tiene un tablero de ajedrez?",
				"preguntas", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] {
						" ",
						"36.",
						"54.",
						"64.",
						"81."
		}, "");

		if (pregunta10 == "64.") {
			aciertos++;
		} else {
			error1 = error1 + "\n¿Cuántos cuadros tiene un tablero de ajedrez? - 64.";
			errores++;
		}
		
		if(errores==10){
			sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Musica/sound2.wav"));
			sonido.play();
		}else if(aciertos==10){
			sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Musica/sound3.wav"));
			sonido.play();
		}
		JOptionPane.showMessageDialog(null, "Preguntas acertadas: " + aciertos + ", Preguntas falladas: " + errores + "\n" + error1);

	}

	public void preguntasDeMusicas() {

		int aciertos = 0, errores = 0;
		String error1 = "";

		Object pregunta1 = JOptionPane.showInputDialog(null, "1- ¿Quién ganó el festival de Eurovisión 2017?",
				"preguntas", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] {
						" ",
						"Portugal.",
						"España.",
						"Denmark.",
						"Romania."
		}, "");
		if (pregunta1 == "Portugal.") {
			aciertos++;
		} else {
			error1 = error1 + "\n¿Quién ganó el festival de Eurovisión 2017? - Portugal.";
			errores++;
		}
		Object pregunta2 = JOptionPane.showInputDialog(null, "2- ¿Donde murió mozart?",
				"preguntas", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] {
						" ",
						"Roma, Italia.",
						"Praga, Republica Checa.",
						"Sofia, Bulgaria.",
						"Viena, Austria."
		}, "");
		if (pregunta2 == "Viena, Austria.") {
			aciertos++;
		} else {
			error1 = error1 + "\n¿Donde murió mozart? - Viena, Austria.";
			errores++;
		}
		Object pregunta3 = JOptionPane.showInputDialog(null, "3-¿Con qué material está construida una flauta travesera?",
				"preguntas", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] {
						" ",
						"Madera.",
						"Acero.",
						"Metal.",
						"Cobre."
		}, "");
		if (pregunta3 == "Metal.") {
			aciertos++;
		} else {
			error1 = error1 + "\n¿Con qué material está construida una flauta travesera? - Metal.";
			errores++;
		}
		Object pregunta4 = JOptionPane.showInputDialog(null, "4-¿En qué ciudad comienza la historia del jazz?",
				"preguntas", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] {
						" ",
						"Manhattan.",
						"Nueva Orleáns.",
						"Madrid.",
						"Londres."
		}, "");
		if (pregunta4 == "Nueva Orleáns.") {
			aciertos++;
		} else {
			error1 = error1 + "\n¿En qué ciudad comienza la historia del jazz? - Nueva Orleans.";
			errores++;
		}
		Object pregunta5 = JOptionPane.showInputDialog(null, "5-¿El xilófono es un instrumento de...?",
				"preguntas", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] {
						" ",
						"Viento metal.",
						"Percusion.",
						"Viento madera.",
						"Cualquiera de las tres."
		}, "");
		if (pregunta5 == "Percusion.") {
			aciertos++;
		} else {
			error1 = error1 + "\n¿El xilófono es un instrumento de...? - Percusion.";
			errores++;
		}
		Object pregunta6 = JOptionPane.showInputDialog(null, "6-¿Cuantas cuerdas tiene un violin?",
				"preguntas", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] {
						" ",
						"3.",
						"5.",
						"4.",
						"6."
		}, "");
		if (pregunta6 == "4.") {
			aciertos++;
		} else {
			error1 = error1 + "\n¿Cuantas cuerdas tiene un violin? - 4";
			errores++;
		}
		Object pregunta7 = JOptionPane.showInputDialog(null, "7-¿En que año se fundó el grupo de los Beatles?",
				"preguntas", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] {
						" ",
						"1960.",
						"1958.",
						"1968.",
						"1971."
		}, "");
		if (pregunta7 == "1958.") {
			aciertos++;
		} else {
			error1 = error1 + "\n¿En que año se fundó el grupo de los Beatles? - 1958.";
			errores++;
		}
		Object pregunta8 = JOptionPane.showInputDialog(null, "8-¿Cual de estas canciones no es de Queen?",
				"preguntas", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] {
						" ",
						"Bohemian Rhapsody.",
						"Start me up.",
						"We Will Rock You.",
						"I want it all."
		}, "");
		if (pregunta8 == "Start me up.") {
			aciertos++;
		} else {
			error1 = error1 + "\n¿Cual de estas canciones no es de Queen? - Start me up.";
			errores++;
		}
		Object pregunta9 = JOptionPane.showInputDialog(null, "9-¿Quien es el cantante de los Rolling Stones?",
				"preguntas", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] {
						" ",
						"Mick Jagger.",
						"Keith Richards.",
						"Mick Avony.",
						"Ronnie Wood."
		}, "");
		if (pregunta9 == "Mick Jagger.") {
			aciertos++;
		} else {
			error1 = error1 + "\n¿Quien es el cantante de los Rolling Stones? - Mick Jagger.";
			errores++;
		}
		Object pregunta10 = JOptionPane.showInputDialog(null, "10-¿En que año murió Brian Johnson (AC/DC)?",
				"preguntas", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] {
						" ",
						"2014.",
						"2009.",
						"2017.",
						"No está muerto."
		}, "");
		if (pregunta10 == "No está muerto.") {
			aciertos++;
		} else {
			error1 = error1 + "\n¿En que año murió Brian Johnson (AC/DC)? - No está muerto.";
			errores++;
		}
		if(errores==10){
			sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Musica/sound2.wav"));
			sonido.play();
		}else if(aciertos==10){
			sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Musica/sound3.wav"));
			sonido.play();
		}
		JOptionPane.showMessageDialog(null, "Preguntas acertadas: " + aciertos + ", Preguntas falladas: " + errores + "\n" + error1);

	}	
}