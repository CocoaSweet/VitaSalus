package com.vitasalus.dev.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.vitasalus.dev.dto.PacienteDTO;
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
	public Optional<PacienteEntity> findById(Long id) {
		return pacienteRepository.findById(id);
	}

	@Override
	public Optional<PacienteEntity> findByCpf(String cpf) {
		return pacienteRepository.findByCpf(cpf);
	}

	@Override
	public void savePaciente(PacienteDTO paciente) {
		PacienteEntity pacienteEntity = new PacienteEntity(paciente);
		pacienteEntity.setSenha(passwordEncoder.encode(paciente.getSenha()));
		pacienteRepository.save(pacienteEntity);
	}

	@Override
	public PacienteDTO updatePaciente(PacienteDTO paciente) {
		PacienteEntity pacienteEntity = new PacienteEntity(paciente);
		pacienteEntity.setSenha(passwordEncoder.encode(paciente.getSenha()));
		return new PacienteDTO(pacienteRepository.save(pacienteEntity));
	}

	@Override
	public void deletePaciente(Long id) {
		pacienteRepository.deleteById(id);
	}

	@Override
	public void deletePaciente(String cpf) {
		pacienteRepository.deleteByCpf(cpf);
	}

}
