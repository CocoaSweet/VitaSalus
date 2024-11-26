package com.vitasalus.dev.service.impl;

import java.util.NoSuchElementException;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.vitasalus.dev.dto.*;
import com.vitasalus.dev.entity.PacienteEntity;
import com.vitasalus.dev.repository.PacienteRepository;
import com.vitasalus.dev.service.PacienteService;

@Service
public class PacienteServiceImpl implements PacienteService {

	@Autowired
	private final PacienteRepository pacienteRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	public PacienteServiceImpl(PacienteRepository pacienteRepository) {
		this.pacienteRepository = pacienteRepository;
	}

	@Override
	public Optional<ResponsePatientDTO> findById(Long id) {
		Optional<PacienteEntity> pacienteEntity = pacienteRepository.findById(id);
		return pacienteEntity.map(ResponsePatientDTO::new); 
	}

	@Override
	public Optional<ResponsePatientDTO> findByCpf(String cpf) {
		Optional<PacienteEntity> pacienteEntity = pacienteRepository.findByCpf(cpf);
		return pacienteEntity.map(ResponsePatientDTO::new);
	}

	@Override
	public void savePaciente(PacienteDTO paciente) {
		PacienteEntity pacienteEntity = new PacienteEntity(paciente);
		pacienteEntity.setSenha(passwordEncoder.encode(paciente.getSenha()));
		pacienteRepository.save(pacienteEntity);
	}

	@Override
	public void updatePaciente(Long id, UpdateUserDTO pacienteDTO) {
        PacienteEntity existingPatient = pacienteRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Paciente com ID " + id + " não encontrado"));
        
        existingPatient.setEmail(pacienteDTO.getEmail());
        existingPatient.setTelefone(pacienteDTO.getTelefone());
        if (pacienteDTO.getSenha() != null && !pacienteDTO.getSenha().isEmpty()) {
            existingPatient.setSenha(passwordEncoder.encode(pacienteDTO.getSenha()));
        }
        pacienteRepository.save(existingPatient);
    }

	@Override
	public void deletePaciente(Long id) {
		Optional<PacienteEntity> patient = pacienteRepository.findById(id);
		pacienteRepository.delete(patient.get());	}

	@Override
	public void deletePaciente(String cpf) {
		Optional<PacienteEntity> patient = pacienteRepository.findByCpf(cpf);
		pacienteRepository.delete(patient.get());
	}

}
