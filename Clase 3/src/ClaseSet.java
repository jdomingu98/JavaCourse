import java.util.Set;
import java.util.HashSet;

public class ClaseSet {

	public static void main(String[] args) {
		
		Set<String> lenguajesDeProgramacion = new HashSet<String>();
		lenguajesDeProgramacion.add("Python");
		lenguajesDeProgramacion.add("Java");
		lenguajesDeProgramacion.add("SQL");
		lenguajesDeProgramacion.add("C#");
		lenguajesDeProgramacion.add("C++");
		lenguajesDeProgramacion.add("Cobol");
		lenguajesDeProgramacion.add("GO");
		lenguajesDeProgramacion.add("Dart");
		lenguajesDeProgramacion.add("Visual Basic");
		lenguajesDeProgramacion.add("JavaScript");
		lenguajesDeProgramacion.add("Matlab");
		lenguajesDeProgramacion.add("Python");
		System.out.println("La lista de lenguajes de programación es: " + lenguajesDeProgramacion);
		
		lenguajesDeProgramacion.remove("GO");
		
		int tamaño = lenguajesDeProgramacion.size();
		System.out.println("El tamaño es: " + tamaño);
		
		//lenguajesDeProgramacion.clear();
		
		Set<Integer> numeros = new HashSet<Integer>();
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		
		Set<Object> objeto = new HashSet<>();
		objeto.add(lenguajesDeProgramacion);
		objeto.add(numeros);
		System.out.println("Los elementos del objeto son: " + objeto);
		
	}
}
