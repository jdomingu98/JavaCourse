import java.time.LocalDate;

public interface iCalculos {
	int		diasAtraso(LocalDate fechaHoy, LocalDate fechaEstipulada);
	String	estadoPrestamo(int dias);
	int		dineroAdeudado(int dias);
	boolean esMoroso(String estadoPrestamo);
}
