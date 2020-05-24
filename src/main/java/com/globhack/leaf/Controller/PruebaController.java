package com.globhack.leaf.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class PruebaController {
	
	@GetMapping("/prueba")
	public String metodoPrueba() {
		String prueba = "prueba despliegue";
		
		
		return prueba;
		
	}
}
