import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Libro> libros = new ArrayList<Libro>();
		String nombre = "", autor = "", fechaSolicitud = "", fechaEntrega = "";
		String estado = "", dni = "", caracteres, contenido = "", estadoPrestamo;
		String ruta = "C:\\Users\\jadomingueza\\Desktop\\Java\\ExamenFinal\\inventario_y_vencimientos_" + LocalDate.now() + ".txt";
		int diasAtraso;
		
		File documento = new File("C:\\Users\\jadomingueza\\Desktop\\Java\\ExamenFinal\\Biblioteca Nacional de España.txt");
		try {
			int i = 1;
			BufferedReader br = new BufferedReader(new FileReader(documento));
			while ((caracteres = br.readLine()) != null)
			{
				if (i == 2)
					nombre = caracteres;
	
				if (i == 4)
					autor = caracteres;

				if (i == 6)
					fechaSolicitud = caracteres;
		
				if (i == 8)
					fechaEntrega = caracteres;
			
				if (i == 10)
					estado = caracteres;
				
				if (i == 12)
				{
					dni = caracteres;
					libros.add(new Libro("Biblioteca Nacional de España",
								nombre, autor, fechaSolicitud, fechaEntrega, estado, dni));
					i = 0;
				}
				
				i++;
			}
			br.close();
			for(Libro l : libros)
			{	
				String[] date = l.fechaEntrega.split("/");
				diasAtraso = l.diasAtraso(LocalDate.now(), LocalDate.of(Integer.parseInt(date[2]), Integer.parseInt(date[1]), Integer.parseInt(date[0])));
				estadoPrestamo = l.estadoPrestamo(diasAtraso);
				contenido += "Nombre libro: " + l.nombre + "\n"
					+ "Autor: " + l.autor + "\n"
					+ "Fecha de Solicitud: " + l.fechaSolicitud + "\n"
					+ "Fecha de Entrega Estipulada: " + l.fechaEntrega + "\n"
					+ "Estado: " + l.estado + "\n"
					+ "DNI: " + l.dniPersonaPrestamo + "\n"
					+ "Días de atraso: " + diasAtraso + "\n"
					+ "Estado del préstamo: " + estadoPrestamo + "\n"
					+ "Dinero Adeudado: " + l.dineroAdeudado(diasAtraso) + "€\n"
					+ "Moroso: " + (l.esMoroso(estadoPrestamo) ? "SI" : "NO") + "\n"
					+ "==========================================\n";
			}
			File archivo = new File(ruta);
			if (!archivo.exists())
			{
				archivo.createNewFile();
				System.out.println("¡Se ha generado el fichero!");
			}
			FileWriter fw = new FileWriter(archivo);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(contenido);
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
