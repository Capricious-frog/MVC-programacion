import java.awt.Container; 
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.*;
import javax.swing.*;
import java.awt.Font;
import java.awt.Container;
import java.awt.Image;
import java.io.IOException;
import javax.swing.plaf.*;

public class ClaseModelo  {


	public void conversor(Object n1, String n2, Object n3) {

		Double total;
		Double numero1 = Double.parseDouble(n2);

		if(n1=="Euro - �" && n3=="Dolar - $"){
			total=numero1*1.0990;
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.BOLD, 20)));
			JOptionPane.showMessageDialog(null, String.format("%.2f",numero1)+"� son "+String.format("%.2f",total)+"$");
		}

		else if(n1=="Euro - �" && n3=="Yen - �"){
			total=numero1*123.76;
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.BOLD, 20)));
			JOptionPane.showMessageDialog(null, String.format("%.2f",numero1)+"� son "+String.format("%.2f",total)+"�");
		}

		else if(n1=="Euro - �" && n3=="Libras - �"){
			total=numero1*0.84777;
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.BOLD, 20)));
			JOptionPane.showMessageDialog(null, String.format("%.2f",numero1)+"� son "+String.format("%.2f",total)+"�");
		}

		else if(n1=="Euro - �" && n3=="Pesos - $"){
			total=numero1*20.905;
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.BOLD, 20)));
			JOptionPane.showMessageDialog(null, String.format("%.2f",numero1)+"� son "+String.format("%.2f",total)+"$ (Pesos)");
		}

		else if(n1=="Dolar - $" && n3=="Euro - �"){
			total=numero1*0.90991;
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.BOLD, 20)));
			JOptionPane.showMessageDialog(null, String.format("%.2f",numero1)+"$ son "+String.format("%.2f",total)+"�");
		}

		else if(n1=="Dolar - $" && n3=="Yen - �"){
			total=numero1*112.61;
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.BOLD, 20)));
			JOptionPane.showMessageDialog(null, String.format("%.2f",numero1)+"$ son "+String.format("%.2f",total)+"�");
		}

		else if(n1=="Dolar - $" && n3=="Libras - �"){
			total=numero1*0.77140;
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.BOLD, 20)));
			JOptionPane.showMessageDialog(null, String.format("%.2f",numero1)+"$ son "+String.format("%.2f",total)+"�");
		}

		else if(n1=="Dolar - $" && n3=="Pesos - $"){
			total=numero1*19.021;
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.BOLD, 20)));
			JOptionPane.showMessageDialog(null, String.format("%.2f",numero1)+"$ son "+String.format("%.2f",total)+"$ (Pesos)");
		}

		else if(n1=="Yen - �" && n3=="Euro - �"){
			total=numero1*0.0080800;
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.BOLD, 20)));
			JOptionPane.showMessageDialog(null, String.format("%.2f",numero1)+"� son "+String.format("%.2f",total)+"�");
		}

		else if(n1=="Yen - �" && n3=="Dolar - $"){
			total=numero1*0.0088800;
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.BOLD, 20)));
			JOptionPane.showMessageDialog(null, String.format("%.2f",numero1)+"� son "+String.format("%.2f",total)+"$");
		}

		else if(n1=="Yen - �" && n3=="Libras - �"){
			total=numero1*0.0068500;
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.BOLD, 20)));
			JOptionPane.showMessageDialog(null, String.format("%.2f",numero1)+"� son "+String.format("%.2f",total)+"�");
		}

		else if(n1=="Yen - �" && n3=="Pesos - $"){
			total=numero1*0.16891;
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.BOLD, 20)));
			JOptionPane.showMessageDialog(null, String.format("%.2f",numero1)+"� son "+String.format("%.2f",total)+"$ (Pesos)");
		}

		else if(n1=="Libras - �" && n3=="Euro - �"){
			total=numero1*1.1796;
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.BOLD, 20)));
			JOptionPane.showMessageDialog(null, String.format("%.2f",numero1)+"� son "+String.format("%.2f",total)+"�");
		}

		else if(n1=="Libras - �" && n3=="Dolar - $"){
			total=numero1*1.2963;
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.BOLD, 20)));
			JOptionPane.showMessageDialog(null, String.format("%.2f",numero1)+"� son "+String.format("%.2f",total)+"$");
		}

		else if(n1=="Libras - �" && n3=="Yen - �"){
			total=numero1*145.99;
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.BOLD, 20)));
			JOptionPane.showMessageDialog(null, String.format("%.2f",numero1)+"� son "+String.format("%.2f",total)+"�");
		}

		else if(n1=="Libras - �" && n3=="Pesos - $"){
			total=numero1*24.658;
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.BOLD, 20)));
			JOptionPane.showMessageDialog(null, String.format("%.2f",numero1)+"� son "+String.format("%.2f",total)+"$ (Pesos)");
		}

		else if(n1=="Pesos - $" && n3=="Euro - �"){
			total=numero1*1.1796;
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.BOLD, 20)));
			JOptionPane.showMessageDialog(null, String.format("%.2f",numero1)+"$ (Pesos) son "+String.format("%.2f",total)+"�");
		}

		else if(n1=="Pesos - $" && n3=="Dolar - $"){
			total=numero1*1.2963;
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.BOLD, 20)));
			JOptionPane.showMessageDialog(null, String.format("%.2f",numero1)+"$ (Pesos) son "+String.format("%.2f",total)+"$");
		}

		else if(n1=="Pesos - $" && n3=="Libras - �"){
			total=numero1*145.99;
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.BOLD, 20)));
			JOptionPane.showMessageDialog(null, String.format("%.2f",numero1)+"$ (Pesos) son "+String.format("%.2f",total)+"�");
		}

		else if(n1=="Pesos - $" && n3=="Yen - �"){
			total=numero1*24.658;
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.BOLD, 20)));
			JOptionPane.showMessageDialog(null, String.format("%.2f",numero1)+"$ (Pesos) son "+String.format("%.2f",total)+"�");
		}

		else if(n1=="Euro - �" && n3=="Euro - �"){
			total=numero1*24.658;
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.BOLD, 20)));
			JOptionPane.showMessageDialog(null, "Eres tonto o que");
		}
	}

	public void preguntasDeHistoria(){

		int aciertos=0;
		int errores=0;
		String error1 = "";

		Object pregunta1 = JOptionPane.showInputDialog(null,"1- �En que a�o descrubri� Col�n Am�rica?",
				"preguntas", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] { " ","1502.","1488.", "1496.", "1492." },"");
		if (pregunta1=="1492."){
			aciertos++;
		}else{
			error1="�En que a�o descrubri� Col�n Am�rica? - 1492.";
			errores++;
		}
		Object pregunta2 = JOptionPane.showInputDialog(null,"2- �Cu�l era la capital del Imperio Inca?",
				"preguntas", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] {" ","Lima.","Cuzco.", "Machu Picchu.", "Quito." },"");
		if (pregunta2=="Cuzco."){
			aciertos++;
		}else{
			error1=error1+"\n�Cu�l era la capital del Imperio Inca? - Cuzco.";
			errores++;
		}
		Object pregunta3 = JOptionPane.showInputDialog(null,"3- �En que guerra particip� Juana de Arco?",
				"preguntas", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] { " ", "La guerra de los 30 a�os.","La guerra de los 100 a�os.", "La primera cruzada.", "Guerras napole�nicas." },"");
		if (pregunta3=="La guerra de los 100 a�os."){
			aciertos++;
		}else{
			error1=error1+"\n�En que guerra particip� Juana de Arco? - La guerra de los 100 a�os.";
			errores++;
		}
		Object pregunta4 = JOptionPane.showInputDialog(null,"4- �Cu�ndo se produjo principalmente el Siglo de Oro?",
				"preguntas", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] {" ","Siglo XV.","Siglo XVI.","Siglo XVII.", "Siglo XIV"},"");
		if (pregunta4=="Siglo XVI."){
			aciertos++;
		}else{
			error1=error1+"\n�Cu�ndo se produjo principalmente el Siglo de Oro? - Siglo XVI.";
			errores++;
		}
		Object pregunta5 = JOptionPane.showInputDialog(null,"5- �C�mo se llamaba el padre de Alejandro Magno?",
				"preguntas", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] {" ", "Filipo II de Macedonia.","Ptolomeo I.", "Leonidas.","Flipo I de Grecia." },"");
		if (pregunta5=="Filipo II de Macedonia."){
			aciertos++;
		}else{
			error1=error1+"\n�C�mo se llamaba el padre de Alejandro Magno? - Filipo II de Macedonia.";
			errores++;
		}
		Object pregunta6 = JOptionPane.showInputDialog(null,"6- �De qu� a�o es la Pepa, la primera Constituci�n espa�ola?",
				"preguntas", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] {" ", "1806.","1792.", "1822.", "1812" },"");
		if (pregunta6=="1812."){
			aciertos++;
		}else{
			error1=error1+"\n�De qu� a�o es la Pepa, la primera Constituci�n espa�ola? - 1812.";
			errores++;
		}
		Object pregunta7 = JOptionPane.showInputDialog(null,"7- �Qui�n fue el primer emperador romano?",
				"preguntas", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] {" ", "Ner�n.","Cesar Augusto.", "Julio Cesar.","Cal�gula." },"");
		if (pregunta7=="Cesar Augusto."){
			aciertos++;
		}else{
			error1=error1+"\n�Qui�n fue el primer emperador romano? - Cesar Augusto.";
			errores++;
		}

		Object pregunta8 = JOptionPane.showInputDialog(null,"8- �Inglaterra, Francia y Rusia conformaron la...?",
				"preguntas", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] {" ", "Entente.","Centrales.", "Alianza.", "El eje." },"");
		if (pregunta8=="Alianza."){
			aciertos++;
		}else{
			error1=error1+"\n�Inglaterra, Francia y Rusia conformaron la...? - Alianza. ";
			errores++;
		}

		Object pregunta9 = JOptionPane.showInputDialog(null,"9- �En que pa�s naci� Adolf Hitler?",
				"preguntas", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] {" ", "Alemania.","Austria.", "Polonia.", "Suiza." },"");
		if (pregunta9=="Austria."){
			aciertos++;
		}else{
			error1=error1+"\n�En que pa�s naci� Adolf Hitler? - Austria.";
			errores++;
		}
		Object pregunta10 = JOptionPane.showInputDialog(null,"10- �En que isla muri� Napole�n?",
				"preguntas", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] {" ", "Corcega.","Elba.", "Santa Elena.", "Cerde�a." },"");
		if (pregunta10=="Santa Elena."){
			aciertos++;
		}else{
			error1=error1+"\n�En que isla muri� Napole�n? - Santa Elena.";
			errores++;
		}
		JOptionPane.showMessageDialog(null, "Preguntas acertadas: "+aciertos+", Preguntas falladas: "+errores+"\n"+error1);
	}

	public void preguntasDeDeportes(){

		int aciertos=0;
		int errores=0;
		String error1 = "";

		Object pregunta1 = JOptionPane.showInputDialog(null,"1- �Cu�ntas finales del mundo jug� la Selecci�n Argentina de f�tbol?",
				"preguntas", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] { " ","Cinco.","Seis.", "Cuatro.", "Tres." },"");
		if (pregunta1=="Cuatro."){
			aciertos++;
		}else{
			error1="�Cu�ntas finales del mundo jug� la Selecci�n Argentina de f�tbol? - Cuatro.";
			errores++;
		}
		Object pregunta2 = JOptionPane.showInputDialog(null,"2- �Cu�ntos jugadores componen un equipo de rugby?",
				"preguntas", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] {" ","11.","12.", "15.", "21." },"");
		if (pregunta2=="15."){
			aciertos++;
		}else{
			error1=error1+"\n�Cu�ntos jugadores componen un equipo de rugby? - 15.";
			errores++;
		}
		Object pregunta3 = JOptionPane.showInputDialog(null,"3- �En qu� pa�s se invent� el voleibol?",
				"preguntas", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] { " ", "Gran Breta�a.","Francia.", "Rusia.", "Estados Unidos." },"");
		if (pregunta3=="Estados Unidos."){
			aciertos++;
		}else{
			error1=error1+"\n�En qu� pa�s se invent� el voleibol? - Estados Unidos";
			errores++;
		}
		Object pregunta4 = JOptionPane.showInputDialog(null,"4- �Qu� halterofilo espa�ol es campe�n del mundo?",
				"preguntas", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] {" ","Maria de la Puente.","Junior Santana.","Lydia Valentin.", "David Sachez."},"");
		if (pregunta4=="Lydia Valentin."){
			aciertos++;
		}else{
			error1=error1+"\n�Qu� halterofilo espa�ol es campe�n del mundo? - Lydia Valentin.";
			errores++;
		}
		Object pregunta5 = JOptionPane.showInputDialog(null,"5- �De qu� color es el cero en el cilindro de la ruleta?",
				"preguntas", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] {" ", "Blanco.","Negro.", "Rojo.","Verde." },"");
		if (pregunta5=="Verde."){
			aciertos++;
		}else{
			error1=error1+"\n�De qu� color es el cero en el cilindro de la ruleta? - Verde.";
			errores++;
		}
		Object pregunta6 = JOptionPane.showInputDialog(null,"6- �Cu�ntos puntos vale un tiro libre encestado en baloncesto?",
				"preguntas", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] {" ", "Uno.","Dos.", "Tres.", "Depende." },"");
		if (pregunta6=="Uno."){
			aciertos++;
		}else{
			error1=error1+"\n�Cu�ntos puntos vale un tiro libre encestado en baloncesto? - Uno.";
			errores++;
		}
		Object pregunta7 = JOptionPane.showInputDialog(null,"7- �Cu�l de estos pilotos no es de F1?",
				"preguntas", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] {" ", "Richard Petty.","Fernando Alonso.", "Sebastian Vettel.","Mark Webber." },"");
		if (pregunta7=="Richard Petty."){
			aciertos++;
		}else{
			error1=error1+"\n�Cu�l de estos pilotos no es de F1? - Richard Petty.";
			errores++;
		}
		Object pregunta8 = JOptionPane.showInputDialog(null,"8- �D�nde se invent� el tenis de mesa?",
				"preguntas", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] {" ", "China.","Jap�n.", "Korea del Sur.", "Inglaterra." },"");
		if (pregunta8=="Inglaterra."){
			aciertos++;
		}else{
			error1=error1+"\n�D�nde se invent� el tenis de mesa? - Inglaterra.";
			errores++;
		}
		Object pregunta9 = JOptionPane.showInputDialog(null,"9- �Cu�nto dura un partido de balonmano?",
				"preguntas", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] {" ", "30 minutos.","45 minutos.", "60 minutos.", "90 minutos." },"");
		if (pregunta9=="60 minutos."){
			aciertos++;
		}else{
			error1=error1+"\n�Cu�nto dura un partido de balonmano? - 60 minutos.";
			errores++;
		}
		Object pregunta10 = JOptionPane.showInputDialog(null,"10- �Cu�ntos cuadros tiene un tablero de ajedrez?",
				"preguntas", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] {" ", "36.","54.", "64.", "81." },"");
		if (pregunta10=="64."){
			aciertos++;
		}else{
			error1=error1+"\n�Cu�ntos cuadros tiene un tablero de ajedrez? - 64.";
			errores++;
		}
		JOptionPane.showMessageDialog(null, "Preguntas acertadas: "+aciertos+", Preguntas falladas: "+errores+"\n"+error1);

	}

	public void preguntasDeMusicas(){

		int aciertos=0;
		int errores=0;
		String error1="";

		Object pregunta1 = JOptionPane.showInputDialog(null,"1- �Qui�n gan� el festival de Eurovisi�n 2017?",
				"preguntas", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] { " ","Portugal.","Espa�a.", "Denmark.", "Romania." },"");
		if (pregunta1=="Portugal."){
			aciertos++;
		}else{
			error1=error1+"�Qui�n gan� el festival de Eurovisi�n 2017? - Portugal.";
			errores++;
		}
		Object pregunta2 = JOptionPane.showInputDialog(null,"2- �C�mo se llama el cantante que interpreta la canci�n Do it for your lover?",
				"preguntas", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] {" ","Manel Navarro.","Alejandro Sanz.", "Eneritz Ram�rez.", "Jon Ander Moraleda." },"");
		if (pregunta2=="Manel Navarro."){
			aciertos++;
		}else{
			error1=error1+"\n";
			errores++;
		}
		Object pregunta3 = JOptionPane.showInputDialog(null,"3- �C�mo sigue est� canci�n despacito quiero respirar t� fuego despacito...?",
				"preguntas", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] { " ", "Deja que te diga cosas al oido.","Deja que al oido te diga cosas.", "Si no est�s conmigo.", "Hasta el final." },"");
		if (pregunta3=="Deja que te diga cosas al oido."){
			aciertos++;
		}else{
			errores++;
		}
		Object pregunta4 = JOptionPane.showInputDialog(null,"4- �En qu� ciudad comienza la historia del jazz?",
				"preguntas", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] {" ","Manhattan.","Nueva Orle�ns.","Madrid.","Londres."},"");
		if (pregunta4=="Nueva Orle�ns."){
			aciertos++;
		}else{
			errores++;
		}
		Object pregunta5 = JOptionPane.showInputDialog(null,"5- �Qu� cantante canta la canci�n de Darte un beso?",
				"preguntas", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] {" ", "Romeo Santos.","Daddy Yankee.", "Enrique Inglesias.","Prince Royce." },"");
		if (pregunta5=="Prince Royce."){
			aciertos++;
		}else{
			errores++;
		}
		Object pregunta6 = JOptionPane.showInputDialog(null,"6- �Qui�n de estos cantantes ha tenido cancer?",
				"preguntas", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] {" ", "Lady Gaga.","Britney Spears.", "Whitney houston.", "Todos." },"");
		if (pregunta6=="Britney Spears."){
			aciertos++;
		}else{
			errores++;
		}
		Object pregunta7 = JOptionPane.showInputDialog(null,"7- �Cu�l de estos cantantes es Gay?",
				"preguntas", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] {" ", "Alejandro Sanz.","Ricky Martin.", "Melendi.","Carlos Baute." },"");
		if (pregunta7=="Ricky Martin."){
			aciertos++;
		}else{
			errores++;
		}
		Object pregunta8 = JOptionPane.showInputDialog(null,"8- �C�mo qued� Manel Navarro en Eurovisi�n?",
				"preguntas", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] {" ", "18.","25.", "23.", "26." },"");
		if (pregunta8=="26."){
			aciertos++;
		}else{
			errores++;
		}
		Object pregunta9 = JOptionPane.showInputDialog(null,"9- �Cu�ntas son en el grupo de Fifth Harmony?",
				"preguntas", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] {" ", "5.","3.", "6.", "4" },"");
		if (pregunta9=="4."){
			aciertos++;
		}else{
			errores++;
		}
		Object pregunta10 = JOptionPane.showInputDialog(null,"10- �Qu� tipo de m�sica es la canci�n de Propuesta Indecente ?",
				"preguntas", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] {" ", "Reggaeton.","Pop.", "House.", "Bachata." },"");
		if (pregunta10=="Bachata."){
			aciertos++;
		}else{
			errores++;
		}
		JOptionPane.showMessageDialog(null, "Preguntas acertadas: "+aciertos+", Preguntas falladas: "+errores+"\n"+error1);

	}
}