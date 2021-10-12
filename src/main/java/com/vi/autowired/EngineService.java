package com.vi.autowired;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class EngineService implements EngineInterface{	

	public String getEngineName() {
		return "engine";
	}
}
