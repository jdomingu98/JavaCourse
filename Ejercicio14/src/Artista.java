<<<<<<< HEAD

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
=======

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
>>>>>>> 772c8971d3b3114c4b299ff7941e83895fe49b45
