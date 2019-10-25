package org.gta1.cars;

import org.gta1.interfaces.Car;
import org.gta1.interfaces.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("corola")
public class Corola implements Car {
	
	@Autowired
	@Qualifier("V6Engine")
	Engine engine;

	/*@Autowired(required = false)
	public void setEngine(Engine engine) {
		engine.type = "new V8 Engine";
		this.engine = engine;
	}*/
	
	/*@Autowired()
	public Corola(Engine engine) {
		engine.type = "new V8 Engine";
		this.engine = engine;
	}*/

	public String specs() {
		
		String specs = "sedan from toyota with engine type as " + engine.type(); 
		
		return specs;
	}	

}
