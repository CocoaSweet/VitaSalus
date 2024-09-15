package com.vitasalus.dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vitasalus.dev.entity.MedicoEntity;

public interface MedicoRepository extends JpaRepository<MedicoEntity, Long> {

}
