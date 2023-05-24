import java.time.LocalDate;

public class Libro extends Biblioteca implements iCalculos{
	String nombre;
	String autor;
	String fechaSolicitud;
	String fechaEntrega;
	String estado;
	String dniPersonaPrestamo;
	
	public Libro(String nombreBiblioteca, String nombre, String autor,
			String fechaSolicitud, String fechaEntrega, String estado, String dni) {
		super(nombreBiblioteca);
		this.nombre = nombre;
		this.autor = autor;
		this.fechaSolicitud = fechaSolicitud;
		this.fechaEntrega = fechaEntrega;
		this.estado = estado;
		dniPersonaPrestamo = dni;
	}

	@Override
	public int diasAtraso(LocalDate fechaHoy, LocalDate fechaEstipulada) {
		
		int dias = ((fechaHoy.getYear() - fechaEstipulada.getYear()) * 365) +
				((fechaHoy.getMonthValue() - fechaEstipulada.getMonthValue()) * 30) +
				((fechaHoy.getDayOfMonth() - fechaEstipulada.getDayOfMonth()));
		
		return (dias <= 0 ? 0 : dias);
	}

	@Override
	public String estadoPrestamo(int dias) {
		return dias > 0 ? "VENCIDO" : "EN REGLA";
	}

	@Override
	public int dineroAdeudado(int dias) {
		return dias;
	}

	@Override
	public boolean esMoroso(String estadoPrestamo) {
		return estadoPrestamo.equalsIgnoreCase("VENCIDO");
	}
	
}
