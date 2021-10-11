package com.vi.autowired;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api")

public class CompayController {
	
	

	private Car car=new Car();
	   
	@GetMapping("/print_engine")	
	public String printEngine() {
		return car.getEngine().engineName;
	}
	


}
