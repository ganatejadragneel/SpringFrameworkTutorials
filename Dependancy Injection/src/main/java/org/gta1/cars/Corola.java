package org.gta1.cars;

import org.gta1.interfaces.Car;
import org.springframework.stereotype.Component;

@Component("corola")
public class Corola implements Car {

	public String specs() {
		// TODO Auto-generated method stub
		return "sedan from toyota";
	}

}
