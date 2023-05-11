
public class Artista implements iCalculosSpotify{
	public String	nombre;
	public String	genero;
	public int	numReproducciones;
	public String	topPais;
	
	public Artista(String nombre, String genero, int numReproducciones, String pais)
	{
		this.nombre = nombre;
		this.genero = genero;
		this.numReproducciones = numReproducciones;
		topPais = pais;
	}

	@Override
	public double calcularRecaudacionMonetaria(int numReproducciones) {
		return numReproducciones * 0.02;
	}

	@Override
	public double proyeccionAnual(double recaudacionMonetaria) {
		return recaudacionMonetaria * 12;
	}
}
