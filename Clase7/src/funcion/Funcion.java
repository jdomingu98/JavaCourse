package funcion;

import org.springframework.stereotype.Component;

@Component
public class Funcion {
	public int sumar(int a, int b)
	{
		try {
			Thread.sleep(1000); //Agrega un retraso de 1 segundo
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		
		return a + b;
	}
}
