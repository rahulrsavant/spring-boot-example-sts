package com.vi.conroller;

//vidula infotech


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vi.model.Maths;



@RestController
@RequestMapping("/api")

public class EmployeeController {
	
	@PostMapping("/add_and_sub")	
	public Maths getName(@RequestBody Maths m) {
	 m.add= m.n1+m.n2;
	 m.sub= m.n1-m.n2;
		return m;
	}
	


}
