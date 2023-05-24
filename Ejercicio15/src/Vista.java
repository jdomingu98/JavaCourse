
public class Vista {
	public void mostrar(Usuario usuario)
	{
		System.out.println("Usuario registrado");
		System.out.println("--------------------------");
		System.out.println("Nombre y apellido: " + usuario.getNombre() + " " + usuario.getApellido());
		System.out.println("Correo electrónico: " + usuario.getCorreo());
		System.out.println("Nombre de Usuario: " + usuario.getNombreUsuario());
		System.out.println("--------------------------");
	}
}
