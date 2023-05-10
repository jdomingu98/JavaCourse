
public class Poblacion implements iPoblacion{

	public String ciudad;
	public int poblacionParcial;
	
	public Poblacion(String ciudad, int pob)
	{
		this.ciudad = ciudad;
		poblacionParcial = pob;
	}
	
	@Override
	public double calcularPoblacionFinal(int poblacionParcial) {
		return poblacionParcial * 0.8;
	}

}
