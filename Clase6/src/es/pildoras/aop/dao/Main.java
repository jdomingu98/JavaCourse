package es.pildoras.aop.dao;
//AOP: Aspect Oriented Programming - Programación Orientada a Aspectos

//Bean: 1 funcionalidad

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import es.pildoras.aop.ClienteDAO;
import es.pildoras.aop.Configuracion;

public class Main {

	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(Configuracion.class);
		ClienteDAO elCliente = contexto.getBean("clienteDAO", ClienteDAO.class);
		elCliente.saludar();
		contexto.close();
	}

}
