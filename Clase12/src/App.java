
public class App {

	public static void main(String[] args) {
		Vista vista = new Vista();
		Controlador controlador = new Controlador(vista);
		
		controlador.generarIndex();
	}
}
