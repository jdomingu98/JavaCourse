package configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import aspecto.TimeLoggerAspect;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("funcion")
public class AspectConfig {
	
	@Bean
	public TimeLoggerAspect timeLoggerAspect()
	{
		return new TimeLoggerAspect();
	}
}
