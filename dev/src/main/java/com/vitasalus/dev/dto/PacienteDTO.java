package com.vitasalus.dev.dto;

import java.time.LocalDate;
import org.springframework.beans.BeanUtils;
import com.vitasalus.dev.entity.PacienteEntity;
import lombok.*;

@Getter
@Setter
public class PacienteDTO {

	private Long id;
	private String nome;
	private String sobrenome;
	private String cpf;
	private String email;
	private String telefone;
	private LocalDate dataNascimento;
	private String senha;
	
	public PacienteDTO(PacienteEntity paciente) {
		BeanUtils.copyProperties(paciente, this);
	}
	
	
	public PacienteDTO() {
		
	}


	
}
