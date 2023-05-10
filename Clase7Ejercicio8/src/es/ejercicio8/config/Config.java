package es.ejercicio8.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import es.ejercicio8.aspect.LogAspect;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("es.ejercicio8.register")
public class Config {
	@Bean
	public LogAspect logAspect()
	{
		return new LogAspect();
	}
}	

