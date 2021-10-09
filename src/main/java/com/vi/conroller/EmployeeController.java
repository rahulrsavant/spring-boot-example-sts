package com.vi.conroller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vi.model.Maths;



@RestController
@RequestMapping("/api")

public class EmployeeController {
	
	@PostMapping("/add")
	//@PostMapping
	
	public int getName(@RequestBody Maths m) {
		return m.n1+m.n2;
	}
	


}
