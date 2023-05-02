import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.lang.Math;
import java.text.DecimalFormat;

/*
 * EJERCICIO INTEGRADOR 1:
 * Nos contrataron de la empresa aeronáutica Iberia para poder estandarizar y
 * 	sistematizar la información que tienen hoy en día en un TXT
 * 	-    Nombre del vuelo
	-    Cantidad de pasajeros
	-    Tipo de pasaje
	-    Valor unitario del pasaje
	-    Fecha del vuelo
	Generar una salida que calcule lo siguiente:
		ValorFinalPorVuelo = ValorUnitario * Cant Pasajeros
		DiasDeDiferencia = Fecha Actual – Fecha Vuelo
		Segmentación = Si Tipo_pasaje = Económico && ValorFinalPorVuelo > 100 Entonces es Rentable
		Si Tipo_pasaje = Económico && ValorFinalPorVuelo < 100 Entonces es No Rentable
		Si Tipo_pasaje = Premier && ValorFinalPorVuelo > 1500 Entonces es Rentable
		Si Tipo_pasaje = Premier && ValorFinalPorVuelo < 1500 Entonces es Rentable
		Para los que no esten dentro de estas definiciones, el mensaje debe ser "A CONFIRMAR"
	Ademas, agregar una línea que contabilice el Monto Final recaudado total entre la suma de todos los montos parciales
	El programa debe implementar lo siguiente:
		-    Clases y herencia
		-    Interfaz (Con las funciones que generen el enunciado)
	(!) DEBE GENERAR UN FICHERO DE SALIDA CON LO PROVISTO EN EL TXT Y CON LO AGREGADO DENTRO DEL PROGRAMA (!)
	ENTREGABLES:
		- Codigo del proyecto.
 * */

public class Aeropuerto extends Empresa implements iCalculosVuelos{

	String		nombre;
	int			numPasajeros;
	String		tipoPasaje;
	double		valorUnitario;
	LocalDate	fechaVuelo;
	double		valorFinalPorVuelo;
	int			diasDeDiferencia;
	String		segmentacion;
	
	public Aeropuerto(String nombre, String numPasajeros, String tipoPasaje, String valorUnitario, String fechaVuelo)
	{
		super("Iberia", LocalDate.now(),46892);
		this.nombre =nombre;
		this.numPasajeros = Integer.parseInt(numPasajeros);
		this.tipoPasaje = tipoPasaje;
		this.valorUnitario = Double.parseDouble(valorUnitario);
		this.fechaVuelo = LocalDate.parse(fechaVuelo, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		this.valorFinalPorVuelo = 0.0;
		this.diasDeDiferencia = 0;
		this.segmentacion = "A CONFIRMAR";
	}
	
	public static void main(String[] args)
	{
		File documento = new File("C:\\Users\\jadomingueza\\Desktop\\Java\\EjercicioIntegrador1\\src\\INFO_VUELOS.txt");
		String docSalida = "C:\\Users\\jadomingueza\\Desktop\\Java\\EjercicioIntegrador1\\src\\resultado.txt";
		List<Aeropuerto> vuelos = new ArrayList<Aeropuerto>();
		double montoFinal = 0.0;
		DecimalFormat df = new DecimalFormat("#.00");
		boolean primeraLinea = true;
		try {
			BufferedReader br = new BufferedReader(new FileReader(documento));
			String caracteres = "";
			while ((caracteres = br.readLine()) != null)
			{
				String[] lDiv = caracteres.split("\t");
				if (!primeraLinea)
				{
					vuelos.add(new Aeropuerto(lDiv[0], lDiv[2], lDiv[4],
									lDiv[6], lDiv[8]));
					Aeropuerto a = vuelos.get(vuelos.size() - 1);
					a.valorFinalPorVuelo = a.calcularValorFinalPorVuelo(a.valorUnitario, a.numPasajeros);
					a.diasDeDiferencia = a.calcularDiasDeDiferencia(LocalDate.now(), a.fechaVuelo);
					a.segmentacion = a.setVueloSegmentado(a.tipoPasaje, a.valorFinalPorVuelo);
				}
				else
					primeraLinea = false;
			}
			for (Aeropuerto a : vuelos)
				montoFinal += a.valorFinalPorVuelo;
			File archivo = new File(docSalida);
			if (!archivo.exists())
			{
				archivo.createNewFile();
				System.out.println("Se creó el fichero.");
			}
			FileWriter fw = new FileWriter(archivo);
			BufferedWriter bw = new BufferedWriter(fw);
			String salida = "NOMBRE_VUELO		CANT_PASAJEROS		TIPO_PASAJE		VALOR_UNITARIO		FECHA_VUELO		VALOR_FINAL		DIAS_DIF		SEGMENTACION\n";
			for (Aeropuerto a : vuelos)
			{
				salida += a.nombre + "		" + a.numPasajeros + "		"
						+ a.tipoPasaje + "		" + df.format(a.valorUnitario) + "		" + a.fechaVuelo
						+ "		" + df.format(a.valorFinalPorVuelo) + "		" + a.diasDeDiferencia + "		"
						+ a.segmentacion + "\n";
			}
			salida += "=============================================================================================================================================================\n"
					+ "MONTOS_TOTAL		" + df.format(montoFinal) + "\n";
			bw.write(salida);
			br.close();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public double calcularValorFinalPorVuelo(double valorUnitario, int numPasajeros) {
		return valorUnitario * numPasajeros;
	}

	@Override
	public int calcularDiasDeDiferencia(LocalDate fechaActual, LocalDate fechaVuelo) {
		return Math.abs(fechaVuelo.getDayOfYear() - fechaActual.getDayOfYear());
	}

	@Override
	public String setVueloSegmentado(String tipoPasaje, double valorFinalPorVuelo) {
		
		String segmentado;
		
		if ((tipoPasaje.equals("ECONOMICO") && valorFinalPorVuelo > 100)
				|| (tipoPasaje.equals("PREMIER") && valorFinalPorVuelo > 1500))
			segmentado = "RENTABLE";
		else if ((tipoPasaje.equals("ECONOMICO") && valorFinalPorVuelo < 100)
					||(tipoPasaje.equals("PREMIER") && valorFinalPorVuelo < 1500))
			segmentado = "NO RENTABLE";
		else
			segmentado = "A CONFIRMAR";

		return segmentado;
	}

}
