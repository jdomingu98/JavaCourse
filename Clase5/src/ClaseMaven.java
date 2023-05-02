/*
 * POM: Project Object Model
 * Maven: Herramienta de gestión de proyectos de software de Java
 * 	y otros lenguajes de programacion. A través del archivo POM se encarga
 *	del manejo
 *
 * */

import java.util.List;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Collections;

import org.json.*;

import com.google.gson.*;

public class ClaseMaven
{
	public static void main(String[] args)
	{
		JSONObject objeto = new JSONObject();
		JSONArray arrayJson = new JSONArray();
		objeto.put("nombre", "Gustavo");
		objeto.put("Apellido", "Vargas");
		objeto.put("Edad", 30);
		arrayJson.put(objeto);
		String stringJson = objeto.toString();
		System.out.println(objeto);
		System.out.println(stringJson);
		System.out.println(arrayJson);
		System.out.println("----------------------SALTO DE LINEA ---------------------");
		String cadenaDeCaracteres = "{\"nombre\": \"Gustavo\", \"apellido\":\"Vargas\", \"edad\": 30}";
		JSONObject jsonObjeto = new JSONObject(cadenaDeCaracteres);
		String nombre = jsonObjeto.getString("nombre");
		String apellido = jsonObjeto.getString("apellido");
		int edad = jsonObjeto.getInt("edad");
		System.out.println("El nombre es: " + nombre + ", el apellido es: " + apellido + ", la edad es: " + edad);
		
		//Crear un JSON anidado
		JSONObject persona = new JSONObject();
		persona.put("nombre", "Gustavo");
		persona.put("Apellido", "Vargas");
		persona.put("Edad", 30);
		persona.put("Correo electronico", "gavargas@grupoloyal.com");
		
		JSONObject direccion = new JSONObject();
		direccion.put("Calle", "Calle false 1234");
		direccion.put("Ciudad", "Barcelona");
		direccion.put("Pais", "España");
		persona.put("direccion", direccion);
		
		//String calle = persona.getJSONObject("direccion").getString("Calle");
		System.out.println("La informacion de la persona es: " + persona);
		
		System.out.println("----------------------SALTO DE LINEA ---------------------");
		
		//Ejemplo de array
		JSONArray personas = new JSONArray();
		JSONObject persona1 = new JSONObject();
		persona1.put("Nombre", "Pablo");
		persona1.put("Edad", 25);
		
		JSONObject persona2 = new JSONObject();
		persona2.put("Nombre", "Gustavo");
		persona2.put("Edad", 30);
		personas.put(persona1);
		personas.put(persona2);
		System.out.println("Las personas registradas hasta el momento son: " + personas);
		
		/*
		//Ordenar un objeto de tipo JSON
		String jsonString = "{\"a\": 1, \"b\": 2, \"c\": 3}";
		JSONObject jsonObj = new JSONObject(jsonString);
		
		List<String> llaves = new ArrayList<>(jsonObj.keySet());
		Collections.sort(llaves);
		
		JSONObject elementosOrdenados = new JSONObject();
		for(String llave : llaves)
		{
			elementosOrdenados.put(llave, llaves.get(llave));
		}
		*/
		
		System.out.println("----------------------SALTO DE LINEA ---------------------");
		
		//Ordeno Array de JSON
		String jsonString = "[3,2,1,0]";
		JSONArray jsonArray = new JSONArray(jsonString);
		List<Integer> lista = new ArrayList<>();
		for(int i = 0; i < jsonArray.length(); i++)
		{
			lista.add(jsonArray.getInt(i));
		}
		Collections.sort(lista);
		System.out.println("Mi array ordenado es el siguiente: " + lista);
		
		System.out.println("----------------------SALTO DE LINEA ---------------------");

		String jsonA = "{\"nombre\": \"Gustavo\", \"apellido\":\"Vargas\", \"edad\": 30}";

		Gson gson = new GsonBuilder().create();
		
		@SuppressWarnings("unchecked")
		TreeMap<String, Object> treeMap = gson.fromJson(jsonA, TreeMap.class);
		System.out.println("El objeto JSON ordenado tiene esta aparencia: " + treeMap);
	}
}
