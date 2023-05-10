package es.ejercicio8.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {
	
	@Before("execution(* es.ejercicio8.register.Registro.*(..))")
	public void printMensajeInicio() {
		System.out.println("Se va a introducir los datos de un usuario");
	}
	
	@Around("execution(* es.ejercicio8.register.Registro.*(..))")
	public Object logTime(ProceedingJoinPoint jointPoint) throws Throwable 
	{
		long startTime = System.currentTimeMillis();
		Object result = jointPoint.proceed();
		long endTime = System.currentTimeMillis();
		System.out.println("Latencia: " + (endTime - startTime));
		return result;
	}
	
	@After("execution(* es.ejercicio8.register.Registro.*(..))")
	public void confirmarRegistro(JoinPoint jointPoint) {
		System.out.println("=============================================");
		System.out.println("Función: " + jointPoint.getSignature().getName()
							+ "\nUsuario computador: " + System.getProperty("user.name"));
	}
}
