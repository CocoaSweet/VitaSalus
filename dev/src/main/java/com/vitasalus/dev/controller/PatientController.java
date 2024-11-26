package com.vitasalus.dev.controller;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.vitasalus.dev.dto.*;
import com.vitasalus.dev.service.impl.PacienteServiceImpl;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/paciente")
public class PatientController {
	
	@Autowired
	private PacienteServiceImpl pacienteService;
	
	@GetMapping("/{cpf}")
	public Optional<ResponsePatientDTO> getPatient(@PathVariable("cpf") String cpf) {
		return pacienteService.findByCpf(cpf);
	}
	
	@DeleteMapping("/{cpf}")
	public ResponseEntity<Void> deletePatient(@PathVariable("cpf") String cpf ) {
		pacienteService.deletePaciente(cpf);
		return ResponseEntity.ok().build();
	}
	
	@PutMapping("/{id}")
    public ResponseEntity<Void> editPatient(@PathVariable("id") Long id, @RequestBody UpdateUserDTO userDTO) {
        try {
            pacienteService.updatePaciente(id, userDTO);
            return ResponseEntity.noContent().build();
        } catch (NoSuchElementException e) {
            return ResponseEntity.notFound().build();
        }
    }
	
}
