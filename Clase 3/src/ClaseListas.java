import java.util.List;
import java.util.ArrayList;

public class ClaseListas {

	public static void main(String[] args) {
		List<String> nombres = new ArrayList<String>();
		nombres.add("Gustavo");
		nombres.add("Maria");
		nombres.add("Pablo");
		nombres.add("Carlos");
		nombres.add("Emilio");
		nombres.add("Gustavo");
		System.out.println(nombres);
		
		int tamaño = nombres.size();
		System.out.println("El tamaño de la lista es: " + tamaño);
		
		String nombrePos2 = nombres.get(2);
		System.out.println("El nombre de la posicion 2 es: " + nombrePos2);
		
		nombres.remove(5);
		System.out.println("Los nombres actualizados son: " + nombres);
		
		nombres.set(0, "Alberto");
		System.out.println("Los nombres actualizados son: " + nombres);
		
		boolean contiene = nombres.contains("Emilio");
		System.out.println("¿La lista de nombres contiene a Emilio? " + contiene);
		
		nombres.clear();
		System.out.println("Elimine todos los elementos de la lista: " + nombres);
		
		//Listas con varios tipos de datos
		List<Integer> listaDeEnteros = new ArrayList<>();
		listaDeEnteros.add(1);
		listaDeEnteros.add(2);
		listaDeEnteros.add(3);
		
		List<String> colores = new ArrayList<>();
		colores.add("Azul");
		colores.add("Rojo");
		colores.add("Verde");
		
		List<Object> objetoLista = new ArrayList<>();
		objetoLista.add(listaDeEnteros);
		objetoLista.add(colores);
		System.out.println("Mi lista nueva es: " + objetoLista);
	}
}