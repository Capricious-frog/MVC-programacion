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

		if(n1=="Euro - €" && n3=="Dolar - $"){
			total=numero1*1.0990;
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.BOLD, 20)));
			JOptionPane.showMessageDialog(null, String.format("%.2f",numero1)+"€ son "+String.format("%.2f",total)+"$");
		}

		else if(n1=="Euro - €" && n3=="Yen - ¥"){
			total=numero1*123.76;
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.BOLD, 20)));
			JOptionPane.showMessageDialog(null, String.format("%.2f",numero1)+"€ son "+String.format("%.2f",total)+"¥");
		}

		else if(n1=="Euro - €" && n3=="Libras - £"){
			total=numero1*0.84777;
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.BOLD, 20)));
			JOptionPane.showMessageDialog(null, String.format("%.2f",numero1)+"€ son "+String.format("%.2f",total)+"£");
		}

		else if(n1=="Euro - €" && n3=="Pesos - $"){
			total=numero1*20.905;
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.BOLD, 20)));
			JOptionPane.showMessageDialog(null, String.format("%.2f",numero1)+"€ son "+String.format("%.2f",total)+"$ (Pesos)");
		}

		else if(n1=="Dolar - $" && n3=="Euro - €"){
			total=numero1*0.90991;
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.BOLD, 20)));
			JOptionPane.showMessageDialog(null, String.format("%.2f",numero1)+"$ son "+String.format("%.2f",total)+"€");
		}

		else if(n1=="Dolar - $" && n3=="Yen - ¥"){
			total=numero1*112.61;
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.BOLD, 20)));
			JOptionPane.showMessageDialog(null, String.format("%.2f",numero1)+"$ son "+String.format("%.2f",total)+"¥");
		}

		else if(n1=="Dolar - $" && n3=="Libras - £"){
			total=numero1*0.77140;
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.BOLD, 20)));
			JOptionPane.showMessageDialog(null, String.format("%.2f",numero1)+"$ son "+String.format("%.2f",total)+"£");
		}

		else if(n1=="Dolar - $" && n3=="Pesos - $"){
			total=numero1*19.021;
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.BOLD, 20)));
			JOptionPane.showMessageDialog(null, String.format("%.2f",numero1)+"$ son "+String.format("%.2f",total)+"$ (Pesos)");
		}

		else if(n1=="Yen - ¥" && n3=="Euro - €"){
			total=numero1*0.0080800;
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.BOLD, 20)));
			JOptionPane.showMessageDialog(null, String.format("%.2f",numero1)+"¥ son "+String.format("%.2f",total)+"€");
		}

		else if(n1=="Yen - ¥" && n3=="Dolar - $"){
			total=numero1*0.0088800;
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.BOLD, 20)));
			JOptionPane.showMessageDialog(null, String.format("%.2f",numero1)+"¥ son "+String.format("%.2f",total)+"$");
		}

		else if(n1=="Yen - ¥" && n3=="Libras - £"){
			total=numero1*0.0068500;
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.BOLD, 20)));
			JOptionPane.showMessageDialog(null, String.format("%.2f",numero1)+"¥ son "+String.format("%.2f",total)+"£");
		}

		else if(n1=="Yen - ¥" && n3=="Pesos - $"){
			total=numero1*0.16891;
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.BOLD, 20)));
			JOptionPane.showMessageDialog(null, String.format("%.2f",numero1)+"¥ son "+String.format("%.2f",total)+"$ (Pesos)");
		}

		else if(n1=="Libras - £" && n3=="Euro - €"){
			total=numero1*1.1796;
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.BOLD, 20)));
			JOptionPane.showMessageDialog(null, String.format("%.2f",numero1)+"£ son "+String.format("%.2f",total)+"€");
		}

		else if(n1=="Libras - £" && n3=="Dolar - $"){
			total=numero1*1.2963;
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.BOLD, 20)));
			JOptionPane.showMessageDialog(null, String.format("%.2f",numero1)+"£ son "+String.format("%.2f",total)+"$");
		}

		else if(n1=="Libras - £" && n3=="Yen - ¥"){
			total=numero1*145.99;
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.BOLD, 20)));
			JOptionPane.showMessageDialog(null, String.format("%.2f",numero1)+"£ son "+String.format("%.2f",total)+"¥");
		}

		else if(n1=="Libras - £" && n3=="Pesos - $"){
			total=numero1*24.658;
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.BOLD, 20)));
			JOptionPane.showMessageDialog(null, String.format("%.2f",numero1)+"£ son "+String.format("%.2f",total)+"$ (Pesos)");
		}

		else if(n1=="Pesos - $" && n3=="Euro - €"){
			total=numero1*1.1796;
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.BOLD, 20)));
			JOptionPane.showMessageDialog(null, String.format("%.2f",numero1)+"$ (Pesos) son "+String.format("%.2f",total)+"€");
		}

		else if(n1=="Pesos - $" && n3=="Dolar - $"){
			total=numero1*1.2963;
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.BOLD, 20)));
			JOptionPane.showMessageDialog(null, String.format("%.2f",numero1)+"$ (Pesos) son "+String.format("%.2f",total)+"$");
		}

		else if(n1=="Pesos - $" && n3=="Libras - £"){
			total=numero1*145.99;
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.BOLD, 20)));
			JOptionPane.showMessageDialog(null, String.format("%.2f",numero1)+"$ (Pesos) son "+String.format("%.2f",total)+"£");
		}

		else if(n1=="Pesos - $" && n3=="Yen - ¥"){
			total=numero1*24.658;
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.BOLD, 20)));
			JOptionPane.showMessageDialog(null, String.format("%.2f",numero1)+"$ (Pesos) son "+String.format("%.2f",total)+"¥");
		}

		else if(n1=="Euro - €" && n3=="Euro - €"){
			total=numero1*24.658;
			UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Tahoma", Font.BOLD, 20)));
			JOptionPane.showMessageDialog(null, "Eres tonto o que");
		}
	}

	public void preguntaHistoria(){
		
		int aciertos=0;
		int errores=0;
		
		Object pregunta1 = JOptionPane.showInputDialog(null,"1- ¿Cuál es la descripción que crees que define mejor el concepto 'clase' en la programación orientada a objetos?",
				"preguntas", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] { "Es un concepto similar al de 'array'","Es un tipo particular de variable", "Es un modelo o plantilla a partir de la cual creamos objetos", "Es una categoria de datos ordenada secuencialmente" },"Es un concepto similar al de 'array'");
		if (pregunta1=="Es un modelo o plantilla a partir de la cual creamos objetos"){
			aciertos++;
		}else{
			errores++;
		}
		Object pregunta2 = JOptionPane.showInputDialog(null,"1- ¿Cuál es la descripción que crees que define mejor el concepto 'clase' en la programación orientada a objetos?",
				"preguntas", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] { "Es un concepto similar al de 'array'","Es un tipo particular de variable", "Es un modelo o plantilla a partir de la cual creamos objetos", "Es una categoria de datos ordenada secuencialmente" },"Es un concepto similar al de 'array'");
		if (pregunta1=="Es un modelo o plantilla a partir de la cual creamos objetos"){
			aciertos++;
		}else{
			errores++;
		}
		Object pregunta3 = JOptionPane.showInputDialog(null,"1- ¿Cuál es la descripción que crees que define mejor el concepto 'clase' en la programación orientada a objetos?",
				"preguntas", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] { "Es un concepto similar al de 'array'","Es un tipo particular de variable", "Es un modelo o plantilla a partir de la cual creamos objetos", "Es una categoria de datos ordenada secuencialmente" },"Es un concepto similar al de 'array'");
		if (pregunta1=="Es un modelo o plantilla a partir de la cual creamos objetos"){
			aciertos++;
		}else{
			errores++;
		}
		Object pregunta4 = JOptionPane.showInputDialog(null,"1- ¿Cuál es la descripción que crees que define mejor el concepto 'clase' en la programación orientada a objetos?",
				"preguntas", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] { "Es un concepto similar al de 'array'","Es un tipo particular de variable", "Es un modelo o plantilla a partir de la cual creamos objetos", "Es una categoria de datos ordenada secuencialmente" },"Es un concepto similar al de 'array'");
		if (pregunta1=="Es un modelo o plantilla a partir de la cual creamos objetos"){
			aciertos++;
		}else{
			errores++;
		}
		Object pregunta5 = JOptionPane.showInputDialog(null,"1- ¿Cuál es la descripción que crees que define mejor el concepto 'clase' en la programación orientada a objetos?",
				"preguntas", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] { "Es un concepto similar al de 'array'","Es un tipo particular de variable", "Es un modelo o plantilla a partir de la cual creamos objetos", "Es una categoria de datos ordenada secuencialmente" },"Es un concepto similar al de 'array'");
		if (pregunta1=="Es un modelo o plantilla a partir de la cual creamos objetos"){
			aciertos++;
		}else{
			errores++;
		}
		Object pregunta6 = JOptionPane.showInputDialog(null,"1- ¿Cuál es la descripción que crees que define mejor el concepto 'clase' en la programación orientada a objetos?",
				"preguntas", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] { "Es un concepto similar al de 'array'","Es un tipo particular de variable", "Es un modelo o plantilla a partir de la cual creamos objetos", "Es una categoria de datos ordenada secuencialmente" },"Es un concepto similar al de 'array'");
		if (pregunta1=="Es un modelo o plantilla a partir de la cual creamos objetos"){
			aciertos++;
		}else{
			errores++;
		}
		Object pregunta7 = JOptionPane.showInputDialog(null,"1- ¿Cuál es la descripción que crees que define mejor el concepto 'clase' en la programación orientada a objetos?",
				"preguntas", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] { "Es un concepto similar al de 'array'","Es un tipo particular de variable", "Es un modelo o plantilla a partir de la cual creamos objetos", "Es una categoria de datos ordenada secuencialmente" },"Es un concepto similar al de 'array'");
		if (pregunta1=="Es un modelo o plantilla a partir de la cual creamos objetos"){
			aciertos++;
		}else{
			errores++;
		}
		Object pregunta8 = JOptionPane.showInputDialog(null,"1- ¿Cuál es la descripción que crees que define mejor el concepto 'clase' en la programación orientada a objetos?",
				"preguntas", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] { "Es un concepto similar al de 'array'","Es un tipo particular de variable", "Es un modelo o plantilla a partir de la cual creamos objetos", "Es una categoria de datos ordenada secuencialmente" },"Es un concepto similar al de 'array'");
		if (pregunta1=="Es un modelo o plantilla a partir de la cual creamos objetos"){
			aciertos++;
		}else{
			errores++;
		}
		Object pregunta9 = JOptionPane.showInputDialog(null,"1- ¿Cuál es la descripción que crees que define mejor el concepto 'clase' en la programación orientada a objetos?",
				"preguntas", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] { "Es un concepto similar al de 'array'","Es un tipo particular de variable", "Es un modelo o plantilla a partir de la cual creamos objetos", "Es una categoria de datos ordenada secuencialmente" },"Es un concepto similar al de 'array'");
		if (pregunta1=="Es un modelo o plantilla a partir de la cual creamos objetos"){
			aciertos++;
		}else{
			errores++;
		}
		Object pregunta10 = JOptionPane.showInputDialog(null,"1- ¿Cuál es la descripción que crees que define mejor el concepto 'clase' en la programación orientada a objetos?",
				"preguntas", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] { "Es un concepto similar al de 'array'","Es un tipo particular de variable", "Es un modelo o plantilla a partir de la cual creamos objetos", "Es una categoria de datos ordenada secuencialmente" },"Es un concepto similar al de 'array'");
		if (pregunta1=="Es un modelo o plantilla a partir de la cual creamos objetos"){
			aciertos++;
		}else{
			errores++;
		}
		Object HistoriaFinal = JOptionPane.showInputDialog(null,"1- ¿Cuál es la descripción que crees que define mejor el concepto 'clase' en la programación orientada a objetos?",
				"preguntas", JOptionPane.QUESTION_MESSAGE, null,
				new Object[] { "Es un concepto similar al de 'array'","Es un tipo particular de variable", "Es un modelo o plantilla a partir de la cual creamos objetos", "Es una categoria de datos ordenada secuencialmente" },"Es un concepto similar al de 'array'");
		
	}
}


