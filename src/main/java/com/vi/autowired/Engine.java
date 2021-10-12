package com.vi.autowired;

import org.springframework.stereotype.Component;

@Component
public class Engine implements EngineInterface {

	public String getEngineName() {
		return "engine115";
	}

}
