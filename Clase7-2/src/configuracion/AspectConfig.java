package configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import aspecto.LogginAspect;

@Configuration
@EnableAspectJAutoProxy
public class AspectConfig {
	@Bean
	public LogginAspect logginAspect()
	{
		return new LogginAspect();
	}
}
