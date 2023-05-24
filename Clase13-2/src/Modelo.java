
public class Modelo {
	//En la clase de Modelo declaro todas las variables que voy a usar
	// Ya que aqui debo tener la logica de negocio declarada.
	//En este ejemplo uso nombre, correo y contrasenia.
	//Establezco los getters y setters.
	private String nombre;
	private String correo;
	private String contrasenia;
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getCorreo() {
		return correo;
	}
	
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	public String getContrasenia() {
		return contrasenia;
	}
	
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
}
