import java.time.LocalDate;

public interface iCalculosVuelos {
	double calcularValorFinalPorVuelo(double valorUnitario, int numPasajeros);
	int calcularDiasDeDiferencia(LocalDate fechaActual, LocalDate fechaVuelo);
	String setVueloSegmentado(String tipoPasaje, double valorFinalPorVuelo);
}
