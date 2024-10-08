package com.vitasalus.dev.controller;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vitasalus.dev.dto.MedicoDTO;
import com.vitasalus.dev.dto.RequestDoctorDTO;
import com.vitasalus.dev.dto.UpdateUserDTO;
import com.vitasalus.dev.service.impl.MedicoServiceImpl;

@RestController
@RequestMapping("/medico")
public class MedicoController {
	
	@Autowired
	private MedicoServiceImpl medicoService;
	
	@GetMapping("/{id}")
	public Optional<RequestDoctorDTO> getPatient(@PathVariable("id") Long id) {
		return medicoService.findById(id);
	}
	
	@DeleteMapping("/{cpf}")
	public ResponseEntity<Void> deletePatient(@PathVariable("cpf") String cpf ) {
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
