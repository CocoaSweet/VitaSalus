package com.vitasalus.dev.service;

import java.util.Optional;
import com.vitasalus.dev.dto.MedicoDTO;
import com.vitasalus.dev.dto.RequestDoctorDTO;
import com.vitasalus.dev.dto.UpdateUserDTO;

public interface MedicoService {
	
	Optional<RequestDoctorDTO> findById(Long id);
	Optional<RequestDoctorDTO> findByCpf(String cpf);
	Optional<RequestDoctorDTO> findByCrmAndUfcrm(String crm, String ufcrm);
	MedicoDTO editDoctor(MedicoDTO doctor);
	void saveMedico(MedicoDTO medicoEntity);
	void updateMedico(Long id, UpdateUserDTO pacienteDTO);
	void deleteMedico(Long id);
	void deleteMedico(String cpf);

}
