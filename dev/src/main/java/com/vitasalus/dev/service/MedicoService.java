package com.vitasalus.dev.service;

import java.util.Optional;
import com.vitasalus.dev.dto.*;

public interface MedicoService {
	
	Optional<ResponseDoctorDTO> findById(Long id);
	Optional<ResponseDoctorDTO> findByCpf(String cpf);
	Optional<ResponseDoctorDTO> findByCrmAndUfcrm(String crm, String ufcrm);
	MedicoDTO editDoctor(MedicoDTO doctor);
	void saveMedico(MedicoDTO medicoEntity);
	void updateMedico(Long id, UpdateUserDTO pacienteDTO);
	void deleteMedico(Long id);
	void deleteMedico(String cpf);

}
