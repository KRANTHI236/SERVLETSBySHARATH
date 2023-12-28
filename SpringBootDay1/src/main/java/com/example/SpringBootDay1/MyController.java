package com.example.SpringBootDay1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@RequestMapping("/mycontroller")

public class MyController {
	@GetMapping("/controller")

	public String mycontroller() {

		return "<h1>Welcome to Spring boot Application</h1>";

	}

}
