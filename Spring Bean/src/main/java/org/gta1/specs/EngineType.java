package org.gta1.specs;

import org.gta1.interfaces.Engine;
import org.springframework.stereotype.Component;

@Component("V6Engine")
public class EngineType implements Engine {
	
	String type;
	
	public EngineType() {
		type = "Unknown";
	}

	public EngineType(String type) {
		this.type = type;
	}

	public String type() {
		return type;
	}

}
