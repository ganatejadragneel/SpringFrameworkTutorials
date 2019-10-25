package org.gta1.cars;

import org.gta1.interfaces.Car;
import org.springframework.stereotype.Component;

@Component("swift")
public class Swift implements Car {

	public String specs() {
		// TODO Auto-generated method stub
		return "hatchback from suzuki";
	}

}
