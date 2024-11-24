package com.vitasalus.dev.controller;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vitasalus.dev.dto.RequestPatientDTO;
import com.vitasalus.dev.dto.UpdateUserDTO;
import com.vitasalus.dev.service.impl.PacienteServiceImpl;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/paciente")
public class PatientController {
	
	@Autowired
	private PacienteServiceImpl pacienteService;
	
	@GetMapping("/{id}")
	public Optional<RequestPatientDTO> getPatient(@PathVariable("cpf") String cpf) {
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
