package com.vitasalus.dev.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
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
	public PacienteEntity savePaciente(PacienteEntity pacienteEntity) {
		pacienteEntity.setSenha(passwordEncoder.encode(pacienteEntity.getSenha()));
		return pacienteRepository.save(pacienteEntity);
	}

	@Override
	public PacienteEntity updatePaciente(PacienteEntity pacienteEntity) {
		pacienteEntity.setSenha(passwordEncoder.encode(pacienteEntity.getSenha()));
		return pacienteRepository.save(pacienteEntity);
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
