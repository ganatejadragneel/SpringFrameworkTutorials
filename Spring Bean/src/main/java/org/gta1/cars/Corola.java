package org.gta1.cars;

import org.gta1.interfaces.Car;
import org.gta1.interfaces.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class Corola implements Car {
	
	@Autowired
	@Qualifier("engineType")
	Engine engine;

	public String specs() {
		
		String specs = "sedan from toyota with engine type as " + engine.type(); 
		
		return specs;
	}	

}
