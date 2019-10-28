package org.gta1;

import org.gta1.cars.Corola;
import org.gta1.cars.Swift;
import org.gta1.specs.EngineType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.gta1")
public class AppConfig {
	
	@Bean("myCorola")
	public Corola corola() {
		return new Corola();
	}
	
	@Bean("swift")
	public Swift swift() {
		return new Swift();
	}
	
	@Bean("engineType")
	public EngineType engineType() {
		return new EngineType("V8 Engine");
	}
}
