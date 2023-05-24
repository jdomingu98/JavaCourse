import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Modelo implements iCalculoVuelos{
	private String nombre;
	private String origen;
	private String destino;
	private LocalDateTime tiempoSalida;
	private LocalDateTime tiempoLlegada;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public LocalDateTime getTiempoSalida() {
		return tiempoSalida;
	}

	public void setTiempoSalida(LocalDateTime tiempoSalida) {
		DateTimeFormatter formatoFechaHora = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		this.tiempoSalida = LocalDateTime.parse(tiempoSalida.format(formatoFechaHora), formatoFechaHora);
	}

	public LocalDateTime getTiempoLlegada() {
		return tiempoLlegada;
	}

	public void setTiempoLlegada(LocalDateTime tiempoLlegada) {
		DateTimeFormatter formatoFechaHora = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		this.tiempoLlegada = LocalDateTime.parse(tiempoLlegada.format(formatoFechaHora), formatoFechaHora);
	}

	@Override
	public int numeroDiasVuelo(LocalDateTime tiempoSalida, LocalDateTime tiempoLlegada) {
		int numDias = 0;
		
		numDias += Math.abs(tiempoSalida.getYear() - tiempoLlegada.getYear()) * 365;
		numDias += Math.abs(tiempoSalida.getMonthValue() - tiempoLlegada.getMonthValue()) * 30;
		numDias += Math.abs(tiempoSalida.getDayOfMonth() - tiempoLlegada.getDayOfMonth());
	
		return numDias;
	}
}
