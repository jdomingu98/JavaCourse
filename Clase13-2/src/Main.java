
public class Main {

	public static void main(String [] args)
	{
		Modelo modelo = new Modelo(); //Declaro el modelo
		Vista vista = new Vista(); //Declaro la vista
		Controlador controlador = new Controlador(modelo, vista); //Declaro el controlador asociando el modelo y la vista.
		modelo.setNombre("Gustavo"); //Declaro un ejemplo
		modelo.setContrasenia("abcd1234"); //Declaro un ejemplo 
		modelo.setCorreo("nomehackeesporfavor@gmail.com"); //Declaro un ejemplo	
		vista.mostrarUsuario(modelo.getNombre(), modelo.getCorreo()); //muestro el usuario.
	}

}
