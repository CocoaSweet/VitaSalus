package com.vitasalus.dev.controller;

import java.util.*;
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
	
	@GetMapping("/{id}")
	public Optional<ResponseDocumentDTO> findById(@PathVariable Long id){
		return documentService.findById(id);
	}

	@GetMapping
	public List<ResponseDocumentDTO> findAllByDocumentType(@RequestParam String documentType, @RequestParam String cpf){
		return documentService.findAllByDocumentTypeAndPatient(documentType, cpf);
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
