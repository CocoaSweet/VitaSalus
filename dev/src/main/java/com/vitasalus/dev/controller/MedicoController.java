package com.vitasalus.dev.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medico")
public class MedicoController {
	
	@GetMapping(value = "/teste")
	public void teste() {
		System.out.println("Teste");
	}
}
