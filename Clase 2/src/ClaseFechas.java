import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ClaseFechas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime fecha_actual_hora = LocalDateTime.now();
		LocalDate fecha_actual = LocalDate.now(); //YYYY-MM-DD
		System.out.println(fecha_actual);
		LocalDate fecha_nacimiento = LocalDate.of(1992, 6, 4);
		
		int edad = fecha_actual.getYear() - fecha_nacimiento.getYear();
		// int edad_dias = fecha_actual.getDayOfYear();
		// int edad_dias_gustavo = fecha_actual.getDayOfYear();
		//System.out.println("Analizando getDayOfYear " + edad_dias);
		System.out.println("La edad de Gustavo es: " + edad);
		
		LocalDate fecha_hoy = LocalDate.now();
		LocalDate fecha_ayer = fecha_hoy.minusDays(1);
		LocalDate fecha_mañana = fecha_hoy.plusDays(1);
		
		System.out.println("La fecha de hoy es: " + fecha_hoy);
		System.out.println("La fecha de ayer es: " + fecha_ayer);
		System.out.println("La fecha de mañana es: " + fecha_mañana);
		
		DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/YYYY");
		//yyyy-MM-dd, dd/MM/YYYY, dd-MM/YYYY, yyyy-MM-dd HH:mm:ss
		DateTimeFormatter formatoFechaHora = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String fechaFormateada = fecha_hoy.format(formatoFecha);
		String fechaFormateadaHora = fecha_actual_hora.format(formatoFechaHora);
		System.out.println("La fecha formateada es: " + fechaFormateada);
		System.out.println("La fecha formateada es: " + fechaFormateadaHora);	
	}
}
