package com.vitasalus.dev.dto;

import java.time.LocalDate;

import org.springframework.beans.BeanUtils;
import com.vitasalus.dev.entity.DocumentEntity;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DocumentDTO {

	private Long id;
	private String documentType;
	private String medicoCpf;
	private String pacienteCpf;
	private String description;
	private LocalDate date;

	public DocumentDTO(DocumentEntity document) {
		BeanUtils.copyProperties(document, this);
	}
}
