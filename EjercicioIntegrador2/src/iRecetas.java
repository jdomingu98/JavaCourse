import java.util.List;

public interface iRecetas {
	int calcularTiempoCoccion(List<Ingrediente> ingredientes);
	int calcularCalorias(List<Ingrediente> ingredientes);
}
