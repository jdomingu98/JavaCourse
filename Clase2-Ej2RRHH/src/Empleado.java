import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class Empleado extends Persona implements iSalario
{
	String		posicion;
	int			salario;
	LocalDate	fechaIngreso;
	
	@Override
	public double calcularSalarioNeto(int salario) {
		return (salario * 0.8);
	}
	
	public static void main(String[] args)
	{
		Empleado[] empleados = new Empleado[3];
		int i = -1;
		while (++i < empleados.length)
			empleados[i] = new Empleado();
		Scanner sc = new Scanner(System.in);
		empleados[0].nombre = "Juan Antonio";
		empleados[0].apellido = "Domínguez Arcas";
		empleados[0].edad = 24;
		empleados[0].ciudad = "Málaga";
		empleados[1].nombre = "Juan";
		empleados[1].apellido = "Domínguez";
		empleados[1].edad = 28;
		empleados[1].ciudad = "Madrid";
		empleados[2].nombre = "Antonio";
		empleados[2].apellido = "Arcas";
		empleados[2].edad = 30;
		empleados[2].ciudad = "Barcelona";
		
		for (int j = 0; j < 3; j++)
		{
			System.out.println("Ingresa la posición o cargo en la empresa: ");
			empleados[j].posicion = sc.next();
			System.out.println("Ingresa el salario del empleado: ");
			empleados[j].salario = sc.nextInt();
			System.out.println("Ingresa su fecha de ingreso (YYYY-MM-dd)\n");
			System.out.println("Año: ");
			int año = sc.nextInt();
			System.out.println("Mes: ");
			int mes = sc.nextInt();
			System.out.println("Día: ");
			int dia = sc.nextInt();
			empleados[j].fechaIngreso = LocalDate.of(año, mes, dia);
		}
		LocalDate fechaHoy = LocalDate.now();
		String ruta = "C:\\Users\\jadomingueza\\Desktop\\Java\\Ej2RRHH\\src\\informacion_empleados_"+fechaHoy+".txt";
		String contenido = "";
		i = 0;
		while (i < empleados.length)
		{
			double salarioNeto = empleados[i].calcularSalarioNeto(empleados[i].salario);
			contenido += "Empleado " + i
							+ ":\n\tNombre Completo: " + empleados[i].nombre + " "
								+ empleados[i].apellido
							+ "\n\tEdad: " + empleados[i].edad
							+ "\n\tCiudad: " + empleados[i].ciudad
							+ "\n\tPosición: " + empleados[i].posicion
							+ "\n\tFecha Ingreso: " + empleados[i].fechaIngreso
							+ "\n\tSalario Bruto: " + empleados[i].salario
							+ "\n\tSalario Neto: " + salarioNeto + "\n";
			i++;
		}
		File archivo = new File(ruta);
		try {
			if (!archivo.exists())
			{
				archivo.createNewFile();
				System.out.println("Se creó el fichero.");
			}
			FileWriter fw = new FileWriter(archivo);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(contenido);
			bw.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		sc.close();
	}
}
