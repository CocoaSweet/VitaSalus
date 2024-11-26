package com.vitasalus.dev.service;

import java.util.Optional;
import com.vitasalus.dev.dto.*;

public interface PacienteService {

	Optional<ResponsePatientDTO> findById(Long id);
	Optional<ResponsePatientDTO> findByCpf(String cpf);
	void savePaciente(PacienteDTO pacienteEntity);
	void deletePaciente(Long id);
	void deletePaciente(String cpf);
	void updatePaciente(Long id, UpdateUserDTO pacienteDTO);
}
