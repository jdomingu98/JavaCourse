// MVC basado en Componentes

public class Main {

	public static void main(String[] args)
	{
			Modelo modelo = new Modelo();
			Vista vista = new Vista();
			Controlador controlador = new Controlador(modelo, vista);
			controlador.actualizarUsuario("Gustavo Vargas", "gavargas@grupoloyal.com");
			controlador.mostrarUsuario();
	}

}
