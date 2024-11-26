package com.vitasalus.dev.repository;

import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;
import com.vitasalus.dev.entity.DocumentEntity;

public interface DocumentRepository extends JpaRepository<DocumentEntity, Long> {

	List<DocumentEntity> findAllByDocumentTypeAndPacienteId(String documentType, Long id);
}
