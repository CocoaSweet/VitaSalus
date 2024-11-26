package com.vitasalus.dev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.vitasalus.dev.dto.*;
import com.vitasalus.dev.service.impl.DocumentServiceImpl;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/document")
public class DocumentController {
	
	@Autowired
	private DocumentServiceImpl documentService;

	@PostMapping
	public List<ResponseDocumentDTO> findAllByDocumentType(@RequestBody DocumentRequestDTO document){
		return documentService.findAllByDocumentTypeAndPatient(document);
	}
	
	@PostMapping("/new-doc")
	public void createDocument(@RequestBody DocumentDTO document) {
		documentService.saveDocument(document);
	}
	
	@DeleteMapping("/{id}")
	public void deleteDocument(@PathVariable("id") Long id) {
		documentService.deleteDocument(id);
	}
}
