import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TarjetaBancaria implements iCalculos{
	public String cuentaBancaria = "ES00 1111 2222 3333 4444 5555";
	public double dineroAhorrado;
	public double gastadoMes;
	public LocalDate fechaVencimiento;
	
	public TarjetaBancaria(String cuentaBancaria, double ahorrado, double gastadoMes, String fecha)
	{
		this.cuentaBancaria = cuentaBancaria;
		DecimalFormat twoDecimals = new DecimalFormat("#,##");
		dineroAhorrado = Double.valueOf(twoDecimals.format(ahorrado));//Double.parseDouble(ahorrado);
		this.gastadoMes= Double.valueOf(twoDecimals.format(gastadoMes));//Double.parseDouble(gastadoMes);
		DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		this.fechaVencimiento = LocalDate.parse(fecha, dt);
	}

	@Override
	public double dineroRestante(double ahorrado, double gastado) {
		return ahorrado - gastado;
	}
	
	
}
