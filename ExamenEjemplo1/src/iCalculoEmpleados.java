import java.time.LocalDate;

public interface iCalculoEmpleados {
	double calcularSalario(double salarioBase);
	String rotacionRecomendada(String puesto, int antiguedad);
	int antiguedadLaboral(LocalDate fechaActual, LocalDate fechaIngreso);
}
