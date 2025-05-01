package com.example.demo.Controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeControler {
	
	@GetMapping
	public String greet() {
		return "Hello Nagarajan";
	}
	@GetMapping("/dashboard")
	public String dashboard() {
		return "Login Succuess";
	}
}
