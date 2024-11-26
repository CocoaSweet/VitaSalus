package com.vitasalus.dev.controller;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.vitasalus.dev.dto.*;
import com.vitasalus.dev.service.impl.MedicoServiceImpl;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/medico")
public class MedicoController {
	
	@Autowired
	private MedicoServiceImpl medicoService;
	
	@GetMapping("/{cpf}")
	public Optional<ResponseDoctorDTO> getDoctor(@PathVariable("cpf") String cpf) {
		return medicoService.findByCpf(cpf);
	}
	
	@DeleteMapping("/{cpf}")
	public ResponseEntity<Void> deleteDoctor(@PathVariable("cpf") String cpf ) {
		medicoService.deleteMedico(cpf);
		return ResponseEntity.ok().build();
	}
	
	@PutMapping("/{id}")
    public ResponseEntity<Void> editDoctor(@PathVariable("id") Long id, @RequestBody UpdateUserDTO userDTO) {
        try {
            medicoService.updateMedico(id, userDTO);
            return ResponseEntity.noContent().build();
        } catch (NoSuchElementException e) {
            return ResponseEntity.notFound().build();
        }
    }
	
}
