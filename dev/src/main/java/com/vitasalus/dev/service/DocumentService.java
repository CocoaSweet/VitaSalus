package com.vitasalus.dev.service;

import java.util.*;
import com.vitasalus.dev.dto.*;

public interface DocumentService {

	public List<ResponseDocumentDTO> findAllByDocumentTypeAndPatient(String documentType, String cpf);
	public Optional<ResponseDocumentDTO> findById(Long id);
	void saveDocument(DocumentDTO document);
	void deleteDocument(Long id);

}
