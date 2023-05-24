import java.time.LocalDateTime;

public class Controlador {
	
	private Modelo modelo;
	private Vista vista;
	
	public Controlador(Modelo modelo, Vista vista)
	{
		this.modelo = modelo;
		this.vista = vista;
	}
	
	public void actualizarVuelo(String nombre, String origen, String destino, LocalDateTime tiempoSalida, LocalDateTime tiempoLlegada) {
		modelo.setNombre(nombre);
		modelo.setOrigen(origen);
		modelo.setDestino(destino);
		modelo.setTiempoSalida(tiempoSalida);
		modelo.setTiempoLlegada(tiempoLlegada);
	}
	
	public void mostrarVuelo()
	{
		String nombre = modelo.getNombre();
		String origen = modelo.getOrigen();
		String destino = modelo.getDestino();
		LocalDateTime tiempoSalida = modelo.getTiempoSalida();
		LocalDateTime tiempoLlegada = modelo.getTiempoLlegada();
		vista.mostrarDatos(nombre, origen, destino, tiempoSalida, tiempoLlegada,
				modelo.numeroDiasVuelo(tiempoSalida, tiempoLlegada));
	}
	
	
}
