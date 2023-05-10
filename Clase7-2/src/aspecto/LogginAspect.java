package aspecto;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.aspectj.lang.JoinPoint;

@Aspect
@Component
public class LogginAspect
{
	@Before("execution (* calculadora.Calculadora.*(..))")
	public void logMethodCall(JoinPoint jointPoint)
	{
		System.out.println("Ejecutando método: " + jointPoint.getSignature().getName());
	}
	
	@After("execution (* calculadora.Calculadora.*(..))")
	public void informo()
	{
		System.out.println("El metodo finalizo");
	}
	
	 
}
