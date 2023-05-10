package es.ejercicio7.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("es.ejercicio7.aop")
@EnableAspectJAutoProxy

public class Configuracion {
	
}
