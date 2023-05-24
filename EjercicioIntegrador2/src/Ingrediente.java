
public class Ingrediente extends Alimento{
	String gramos;
	String cantidadUnidades;
	
	public Ingrediente(String nombre, String medida, String gramos) {
		super(nombre);
		this.gramos = gramos;
		cantidadUnidades = medida;
	}
}
