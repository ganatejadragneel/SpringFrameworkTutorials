package org.gta1.specs;

import org.gta1.interfaces.Engine;
import org.springframework.stereotype.Component;

@Component("V6Engine")
public class V6 implements Engine {

	public String type() {
		// TODO Auto-generated method stub
		return "V6 Engine";
	}

}
