package com.vitasalus.dev.service;

import java.util.Optional;
import com.vitasalus.dev.entity.PacienteEntity;

public interface PacienteService {

	Optional<PacienteEntity> findById(Long id);
	Optional<PacienteEntity> findByCpf(String cpf);
	PacienteEntity savePaciente(PacienteEntity pacienteEntity);
	PacienteEntity updatePaciente(PacienteEntity pacienteEntity);
	void deletePaciente(Long id);
	void deletePaciente(String cpf);
}
