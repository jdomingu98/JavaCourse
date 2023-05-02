/* EJERCICIO 5:
	Generar un programa de tipo Maven que declare lo siguiente:
	- 3 objetos de Tipo JSON que contengan la siguiente información para los empleados de la empresa:
		- Nombre
		- Apellido
		- Ciudad
		- Edad
		- Email
	Luego, insertarlos a traves de un array. Mostrarlo por consola.
 */
import org.json.*;

public class MavenEj5 {

	public static void main(String[] args) {
		
		JSONArray personas = new JSONArray();
		JSONObject persona1 = new JSONObject();
		JSONObject persona2 = new JSONObject();
		JSONObject persona3 = new JSONObject();
		
		persona1.put("Nombre", "Gustavo");
		persona1.put("Apellido", "Vargas");
		persona1.put("Ciudad", "Barcelona");
		persona1.put("Edad", 30);
		persona1.put("Email", "gavargas@grupoloyal.com");
		
		persona2.put("Nombre", "Maria");
		persona2.put("Apellido", "Dos Santos");
		persona2.put("Ciudad", "Madrid");
		persona2.put("Edad", 22);
		persona2.put("Email", "m2santos@gmail.com");
		
		persona3.put("Nombre", "Juan Antonio");
		persona3.put("Apellido", "Dominguez");
		persona3.put("Ciudad", "Málaga");
		persona3.put("Edad", 24);
		persona3.put("Email", "jadomingueza@indra.es");
		
		personas.put(persona1);
		personas.put(persona2);
		personas.put(persona3);
		
		System.out.println("Las personas insertadas son: " + personas);
	}
}
