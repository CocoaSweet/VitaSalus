package com.vitasalus.dev.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.vitasalus.dev.entity.PacienteEntity;

public interface PacienteRepository extends JpaRepository<PacienteEntity, Long> {

	Optional<PacienteEntity> findByCpf(String cpf);
	void deleteByCpf(String cpf);
}
