package es.pildoras.aop.aspectos;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component

public class SaludoConAspecto
{
	@Before("execution(public void saludar())")
	public void estaPorSaludar()
	{
		System.out.println("Ey! Estas por saludar.");
	}
	
	@After("execution(public void saludar())")
	public void meDespido()
	{
		System.out.println("Chau chau adios, me tengo que ir");
	}
}
