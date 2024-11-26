package com.vitasalus.dev.dto;

import java.time.LocalDate;

import org.springframework.beans.BeanUtils;

import com.vitasalus.dev.entity.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class ResponseDocumentDTO {

	private Long id;
	private String documentType;
	private MedicoEntity medico;
	private PacienteEntity paciente;
	private String description;
	private LocalDate date;
	
	public ResponseDocumentDTO(DocumentEntity document) {
		BeanUtils.copyProperties(document, this);
	}
}
