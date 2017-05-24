package proyecto;

public class ClasePrincipal {

	public static void main(String args[]) {
		ClaseModelo modelo = new ClaseModelo();
		
		//Ventana principal
		ClaseVista vista = new ClaseVista();
		//Ventana de los programas
		ClaseVista vista2 = new ClaseVista(1);
		//Ventana programa 1 (Conversor dinero)
		ClaseVista vista3 = new ClaseVista(false);
		//Ventana programa 2 (Quizz)
		ClaseVista vista4 = new ClaseVista("a");
		//Ventana programa 3 (Juego memoria)
		ClaseVista vista5 = new ClaseVista((float)1.1);

		new ClaseControlador(vista, modelo, vista2, vista3, vista4, vista5);
	}
}