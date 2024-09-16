package com.vitasalus.dev.service;

import java.util.Optional;
import com.vitasalus.dev.entity.MedicoEntity;

public interface MedicoService {
	
	Optional<MedicoEntity> findById(Long id);
	Optional<MedicoEntity> findByCpf(String cpf);
	Optional<MedicoEntity> findByCrmAndUfcrm(String crm, String ufcrm);
	MedicoEntity saveMedico(MedicoEntity medicoEntity);
	MedicoEntity updateMedico(MedicoEntity medicoEntity);
	void deleteMedico(Long id);
	void deleteMedico(String cpf);

}
