package com.javatpoint.conroller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/v1")

public class EmployeeController {
	
	@GetMapping("/messege")
	public String getMessage() {

		return "hi this is first program";
	}

}
