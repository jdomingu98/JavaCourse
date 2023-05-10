package es.pildoras.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("es.pildoras.aop")
@EnableAspectJAutoProxy //Habilita AOP dentro del proyecto

public class Configuracion {
	
}
