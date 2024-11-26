package com.vitasalus.dev.service.impl;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vitasalus.dev.dto.*;
import com.vitasalus.dev.entity.DocumentEntity;
import com.vitasalus.dev.repository.DocumentRepository;
import com.vitasalus.dev.service.DocumentService;

@Service
public class DocumentServiceImpl implements DocumentService{
	
	@Autowired
	private PacienteServiceImpl patient;
	
	@Autowired
	private MedicoServiceImpl medico;
	
	@Autowired
	private final DocumentRepository documentRepository;
	
	public DocumentServiceImpl(DocumentRepository documentRepository) {
		this.documentRepository = documentRepository;
	}
	
	@Override
	public Optional<ResponseDocumentDTO> findById(Long id) {
		Optional<DocumentEntity> document = documentRepository.findById(id);
		return document.map(ResponseDocumentDTO::new);
	}

	@Override
	public List<ResponseDocumentDTO> findAllByDocumentTypeAndPatient(String documentType, String cpf) {
		Long patientId = patient.findByCpf(cpf).get().getId();
		List<DocumentEntity> documentEntity = documentRepository.findAllByDocumentTypeAndPacienteId(documentType, patientId);
		return documentEntity.stream().map(ResponseDocumentDTO::new).toList();
	}

	@Override
	public void saveDocument(DocumentDTO document) {
		Optional<ResponseDoctorDTO> medicoDto = medico.findByCpf(document.getMedicoCpf());
		Optional<ResponsePatientDTO> pacienteDto = patient.findByCpf(document.getPacienteCpf());
		DocumentEntity documentEntity = new DocumentEntity(document, medicoDto, pacienteDto);
		documentRepository.save(documentEntity);
	}

	@Override
	public void deleteDocument(Long id) {
		documentRepository.deleteById(id);
	}

	
}
