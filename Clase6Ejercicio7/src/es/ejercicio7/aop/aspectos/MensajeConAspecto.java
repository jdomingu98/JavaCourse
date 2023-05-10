package es.ejercicio7.aop.aspectos;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component

public class MensajeConAspecto {
	
	@Before("execution(public void saludar())")
	public void estaPorSaludar()
	{
		System.out.println("Se va a leer el fichero");
	}
}
