package es.pildoras.aop;

import org.springframework.stereotype.Component;

@Component
public class ClienteDAO
{
	public void saludar()
	{
		System.out.println("Hola que tal, te estoy saludando!");
	}
}
