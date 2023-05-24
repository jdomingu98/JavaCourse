import java.time.LocalDateTime;

/*EJERCICIO 16:
	Desarollar un ejercicio que implemente una Vista donde el usuario pueda ver la información
		de los vuelos en pantalla, los mismos los genera el programa. 
	El programa debe informar lo siguiente:
		Nombre de vuelo: "Caribean Destination"
		ORIGEN: Barcelona
		Destino: El Caribe
		Hora de salida estimada: YYYY-MM-DD HH:MM:SS
		Hora de arribo estimada: YYYY-MM-DD HH:MM:SS
		Duracion del vuelo expresada en días:
		Donde el origen y el destino se muestren con fondo verde,
			y el resto a elección del desarrollador. 
	ENTREGABLES:
		- Codigo del proyecto. 
	CONSIDERACIONES:
		El proyecto debe implementar el Modelo-Vista-Controlador con componentes.
*/

public class Main {

	public static void main(String[] args) {
		Modelo modelo = new Modelo();
		Vista vista = new Vista();
		Controlador controlador = new Controlador(modelo, vista);
		controlador.actualizarVuelo("Caribean Destination", "Barcelona", "El Caribe", LocalDateTime.of(2023, 4, 8, 22, 32, 19), LocalDateTime.of(2023, 4, 9, 1, 12, 42));
		controlador.mostrarVuelo();
	}

}
