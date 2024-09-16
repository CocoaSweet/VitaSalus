package com.vitasalus.dev.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.vitasalus.dev.entity.MedicoEntity;

public interface MedicoRepository extends JpaRepository<MedicoEntity, Long> {

	Optional<MedicoEntity> findByCpf(String cpf);
	Optional<MedicoEntity> findByCrmAndUfcrm(String crm, String ufcrm);
	void deleteByCpf(String cpf);
}
