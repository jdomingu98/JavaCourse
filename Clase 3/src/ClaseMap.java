import java.util.HashMap;

public class ClaseMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> usuarios = new HashMap<>();
		usuarios.put("Gustavo", 30);
		usuarios.put("Gustavo", 30);
		usuarios.put("Gustavo", 30);
		usuarios.put("Gustavo", 30);
		usuarios.put("Gustavo", 30);
		usuarios.put("Maria", 25);
		usuarios.put("Pablo", 26);
		usuarios.put("Hernan", 39);
		usuarios.put("Ignacio", 22);
		
		System.out.println(usuarios);
		
		int edadGustavo = usuarios.get("Gustavo");
		System.out.println("La edad de gustavo es: " + edadGustavo);
		
		usuarios.put("Gustavo", 50);
		System.out.println("Los usuarios modificados son: " + usuarios);
		
		usuarios.remove("Gustavo");
		System.out.println("Los usuarios fueron modificados: " + usuarios);
		
		for (String nombre : usuarios.keySet())
		{
			int edad = usuarios.get(nombre);
			System.out.println("El nombre es: " + nombre + " y su edad es " + edad);
		}
	}

}
