package com.vitasalus.dev.service;

import java.util.*;
import com.vitasalus.dev.dto.*;

public interface DocumentService {

	List<ResponseDocumentDTO> findAllByDocumentTypeAndPatient(DocumentRequestDTO document);
	void saveDocument(DocumentDTO document);
	void deleteDocument(Long id);

}
