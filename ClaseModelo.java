package mvc_proyecto;

import javax.swing.JOptionPane;

public class ClaseModelo {
	
	
	public void numero(int n1){
		
		int num=(int)(Math.random()*10+1);
		
		if(n1==num){
			JOptionPane.showMessageDialog(null,"ENHORABUENA, HAS ACERTADO EL NUMERO.");		
		}else{
			JOptionPane.showMessageDialog(null,"MALA SUERTE, HAS FALLADO, EL NUMERO ERA "+num);
		}
	}
		
}
		
