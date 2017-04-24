package mvc_proyecto;


public class ClasePrincipal {

	public static void main(String args[]) {
		ClaseModelo modelo = new ClaseModelo(); 
		ClaseVista vista = new ClaseVista();

		new ClaseControlador(vista, modelo); 
	
	} 
}
