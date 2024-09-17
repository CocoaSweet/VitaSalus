package com.vitasalus.dev.service;

import java.util.Optional;
import com.vitasalus.dev.dto.MedicoDTO;
import com.vitasalus.dev.entity.MedicoEntity;

public interface MedicoService {
	
	Optional<MedicoEntity> findById(Long id);
	Optional<MedicoEntity> findByCpf(String cpf);
	Optional<MedicoEntity> findByCrmAndUfcrm(String crm, String ufcrm);
	void saveMedico(MedicoDTO medicoEntity);
	MedicoDTO updateMedico(MedicoDTO medicoEntity);
	void deleteMedico(Long id);
	void deleteMedico(String cpf);

}
