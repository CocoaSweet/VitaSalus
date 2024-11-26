package com.vitasalus.dev.entity;

import java.time.LocalDate;
import java.util.Optional;

import com.vitasalus.dev.dto.DocumentDTO;
import com.vitasalus.dev.dto.ResponseDoctorDTO;
import com.vitasalus.dev.dto.ResponsePatientDTO;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Table(name = "documents")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class DocumentEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "document_id")
	private Long id;
	
	@Column(name = "document_type")
	private String documentType;
	
	@ManyToOne
	@JoinColumn(name = "id_medico")
	private MedicoEntity medico = new MedicoEntity();
	
	@ManyToOne
	@JoinColumn(name = "id_paciente")
	private PacienteEntity paciente = new PacienteEntity();
	
	@Column(name = "document_desc")
	private String description;
	
	@Column(name = "document_dt")
	private LocalDate date;
	
	public DocumentEntity(DocumentDTO document, Optional<ResponseDoctorDTO> medicoDto, Optional<ResponsePatientDTO> pacienteDto){
		this.documentType = document.getDocumentType();
		this.medico.setId(medicoDto.get().getId());
		this.paciente.setId(pacienteDto.get().getId());
		this.description = document.getDescription();
		this.date = document.getDate();
	}

}
