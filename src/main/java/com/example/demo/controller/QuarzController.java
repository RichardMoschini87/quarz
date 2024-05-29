package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Persona;

@RestController
public class QuarzController {
	
	@GetMapping("/test")
	public Persona getTest() {
		return new Persona("Richard", "Moschini");
	}

}
