package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import calculadora.Calculadora;
import configuracion.AspectConfig;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(AspectConfig.class);
		context.scan("calculadora", "aspecto");
		context.refresh();
		Calculadora calculadora = context.getBean(Calculadora.class);
		int resultado1 = calculadora.sumar(10, 10);
		System.out.println("El resultado de la suma es: " + resultado1);
		
		int resultado2 = calculadora.division(10, 10);
		System.out.println("El resultado de la division es: " + resultado2);
		
		int resultado3 = calculadora.multiplicacion(10, 10);
		System.out.println("El resultado de la multiplicacion es: " + resultado3);
		
		int resultado4 = calculadora.restar(100, 50);
		System.out.println("El resultado de la resta es: " + resultado4);
		
		int resultado5 = calculadora.factorizar(10, 10, 10);
		System.out.println("El numero factorizado es: " + resultado5);
		
		context.close();
	}

}
