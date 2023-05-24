import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//import org.json.*;

public class Main {

	public static void main(String[] args) {
		List<Empleado> empleados = new ArrayList<Empleado>();
		Scanner sc = new Scanner(System.in);
		String nombre = "", apellido, sexo, ciudad, posicion;
		LocalDate fechaIngreso, fechaSalida;
		double salarioBase;
		int anyo, mes, dia;
		String resultado;
		String[] fecha;
		for(int i = 0; i < 3; i++)
		{
			System.out.print("Nombre del empleado: ");
			nombre = sc.next();
			System.out.print("Apellido del empleado: ");
			apellido = sc.next();
			System.out.print("Fecha de ingreso (dd/MM/YYYY): ");
			fecha = sc.next().split("/");
			dia= Integer.parseInt(fecha[0]);
			mes = Integer.parseInt(fecha[1]);
			anyo = Integer.parseInt(fecha[2]);
			fechaIngreso = LocalDate.of(anyo, mes, dia);
			System.out.print("Fecha de salida (dd/MM/YYYY): ");
			resultado = sc.next();
			if (!resultado.equals("-"))
			{	
				fecha = resultado.split("/");
				dia= Integer.parseInt(fecha[0]);
				mes = Integer.parseInt(fecha[1]);
				anyo = Integer.parseInt(fecha[2]);
				fechaSalida = LocalDate.of(anyo, mes, dia);
			}
			else
				fechaSalida = LocalDate.now();
			System.out.print("Sexo: ");
			sexo = sc.next();
			System.out.print("Ciudad: ");
			ciudad = sc.next();
			System.out.print("Posicion: ");
			posicion = sc.next();
			System.out.print("Salario Base: ");
			salarioBase = sc.nextDouble();
			empleados.add(new Empleado(nombre, apellido, fechaIngreso, fechaSalida, sexo, ciudad, posicion, salarioBase));
		}
		sc.close();
		String ruta = "C:\\Users\\jadomingueza\\Desktop\\Java\\ExamenEjemplo1\\src\\resultado.json";
		String resultadoObtenido = "{\n	\"empleados\": [{\n";
		File archivo = new File(ruta);
		try {
			if (!archivo.exists())
			{
				archivo.createNewFile();
				System.out.println("Se creó el fichero.");
			}
			FileWriter fw = new FileWriter(archivo);
			BufferedWriter bw = new BufferedWriter(fw);
			for(int i = 0; i< empleados.size(); i++)
			{
				Empleado e = empleados.get(i);
				int antiguedad = e.antiguedadLaboral(e.fechaSalida, e.fechaIngreso);
				resultadoObtenido += "		\"nombre\": \"" + e.nombre + "\",\n"
										+ "		\"apellido\": \"" + e.apellido + "\",\n"
										+ "		\"fechaIngreso\": \"" + e.fechaIngreso + "\",\n"
										+ "		\"fechaSalida\": \"" + e.fechaSalida + "\",\n"
										+ "		\"sexo\": \"" + e.sexo + "\",\n"
										+ "		\"ciudad\": \"" + e.ciudad + "\",\n"
										+ "		\"posicion\": \"" + e.posicion + "\",\n"
										+ "		\"salarioBase\": " + e.salarioBase + ",\n"
										+ "		\"antiguedad\": " + antiguedad + ",\n"
										+ "		\"salario\": " + e.calcularSalario(e.salarioBase) + ",\n"
										+ "		\"rotacion\": \"" + e.rotacionRecomendada(e.posicion, antiguedad) + "\"\n";
				if (i != (empleados.size() - 1))
					resultadoObtenido += "	}, {\n";
			}
			resultadoObtenido += "	}]\n}";
			bw.write(resultadoObtenido);
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
