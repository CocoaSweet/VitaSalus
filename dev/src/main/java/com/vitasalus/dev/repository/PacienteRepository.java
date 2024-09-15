package com.vitasalus.dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vitasalus.dev.entity.PacienteEntity;

public interface PacienteRepository extends JpaRepository<PacienteEntity, Long> {

}
