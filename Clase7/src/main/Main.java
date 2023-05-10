package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import configuracion.AspectConfig;
import funcion.Funcion;

public class Main {

	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AspectConfig.class);
		Funcion funcion = context.getBean(Funcion.class);
		System.out.println("Resultado de la suma: "+ funcion.sumar(10, 10));
		System.out.println("Resultado de la suma: "+ funcion.sumar(15000, 18000));
		System.out.println("Resultado de la suma: "+ funcion.sumar(180000, 380000));
		context.close();
	}

}
