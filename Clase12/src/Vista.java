public class Vista {
	
	public void mostrarIndex(Usuario usuario)
	{
		System.out.println("Bienvenido " + usuario.getNombre());
		System.out.println("Correo electrónico: " + usuario.getCorreo());
	}
}
