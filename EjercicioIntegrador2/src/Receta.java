import java.util.List;

public class Receta implements iRecetas{
	
	public String nombre;
	public String tipoComida;
	public List<Ingrediente> ingredientes;
	
	public Receta(String nombre, String tipoComida, List<Ingrediente> ingredientes) {
		this.nombre = nombre;
		this.tipoComida = tipoComida;
		this.ingredientes = ingredientes;
	}

	@Override
	public int calcularTiempoCoccion(List<Ingrediente> ingredientes) {
		return ingredientes.size();
	}

	@Override
	public int calcularCalorias(List<Ingrediente> ingredientes) {
		return ingredientes.size() * 3;
	}
	

}
