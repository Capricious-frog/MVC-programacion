package proyecto;

public class ClasePrincipal {

	public static void main(String args[]) {
		ClaseModelo modelo = new ClaseModelo();
		ClaseVista vista = new ClaseVista();
		ClaseVista vista2 = new ClaseVista(1);
		ClaseVista vista3 = new ClaseVista(false);
		ClaseVista vista4 = new ClaseVista("a");

		new ClaseControlador(vista, modelo, vista2, vista3, vista4);
	}
}