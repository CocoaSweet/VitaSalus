package com.vitasalus.dev.dto;

import java.time.LocalDate;
import org.springframework.beans.BeanUtils;
import com.vitasalus.dev.entity.PacienteEntity;
import lombok.*;

@Getter
@Setter
public class ResponsePatientDTO {

	private Long id;
	private String nome;
	private String sobrenome;
	private String cpf;
	private String email;
	private String telefone;
	private LocalDate dataNascimento;
	
	public ResponsePatientDTO(PacienteEntity paciente) {
		BeanUtils.copyProperties(paciente, this);
	}
	
	public ResponsePatientDTO() {
		
	}

}
