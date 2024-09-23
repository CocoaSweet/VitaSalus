package com.vitasalus.dev.service;

import java.util.Optional;
import com.vitasalus.dev.dto.PacienteDTO;
import com.vitasalus.dev.dto.RequestPatientDTO;
import com.vitasalus.dev.dto.UpdateUserDTO;

public interface PacienteService {

	Optional<RequestPatientDTO> findById(Long id);
	Optional<RequestPatientDTO> findByCpf(String cpf);
	void savePaciente(PacienteDTO pacienteEntity);
	void deletePaciente(Long id);
	void deletePaciente(String cpf);
	void updatePaciente(Long id, UpdateUserDTO pacienteDTO);
}
