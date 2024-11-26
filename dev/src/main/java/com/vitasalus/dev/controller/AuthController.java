package com.vitasalus.dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.vitasalus.dev.dto.*;
import com.vitasalus.dev.service.AuthService;
import com.vitasalus.dev.service.impl.MedicoServiceImpl;
import com.vitasalus.dev.service.impl.PacienteServiceImpl;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/auth")
public class AuthController {
	
	@Autowired
	private AuthService authService;
	
	@Autowired
	private MedicoServiceImpl medicoService;
	
	@Autowired
	private PacienteServiceImpl pacienteService;

	@PostMapping(value = "/login") 
	public ResponseEntity<?> login(@RequestBody AuthenticationDTO authDTO){
		return ResponseEntity.ok(authService.login(authDTO));
	}
	@PostMapping(value = "/login-medico") 
	public ResponseEntity<?> loginMedico(@RequestBody AuthenticationDTO authDTO){
		return ResponseEntity.ok(authService.login(authDTO));
	}
	
	@PostMapping(value = "/register-medico")
	public void createMedico(@RequestBody MedicoDTO medico) {
		medicoService.saveMedico(medico);
	}
	
	@PostMapping(value = "/register")
	public void createPaciente(@RequestBody PacienteDTO paciente) {
		pacienteService.savePaciente(paciente);
	}
	
}
