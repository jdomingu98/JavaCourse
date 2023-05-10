package aspecto;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.ProceedingJoinPoint;

@Aspect
public class TimeLoggerAspect
{
	@Around("execution(* funcion.Funcion.sumar(int, int))")
	public Object logTime(ProceedingJoinPoint jointPoint) throws Throwable 
	{
		long startTime = System.currentTimeMillis();
		Object result = jointPoint.proceed();
		long endTime = System.currentTimeMillis();
		System.out.println("Tiempo de ejecucion: " + (endTime - startTime));
		return result;
	}
}
