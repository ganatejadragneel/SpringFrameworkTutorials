package org.gta1.specs;

import org.gta1.interfaces.Engine;
import org.springframework.stereotype.Component;

@Component
public class V8 implements Engine {

	public String type() {
		// TODO Auto-generated method stub
		return "V8 Engine";
	}

}
