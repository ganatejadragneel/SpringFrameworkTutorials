package org.gta1;

import org.gta1.interfaces.Car;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String args[]) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Car myCar = context.getBean("myCorola",Car.class);
		System.out.println(myCar.specs());
		context.close();
	}
}
