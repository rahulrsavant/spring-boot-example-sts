package com.vi.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class Car{

	@Autowired
	EngineInterface engine;

	public EngineInterface getEngine() {
		return engine;
	}

	public void setEngine(EngineInterface engine) {
		this.engine = engine;
	}


	
	

}
