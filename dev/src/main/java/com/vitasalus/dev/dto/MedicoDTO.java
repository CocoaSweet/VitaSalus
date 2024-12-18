package com.vitasalus.dev.dto;

import java.time.LocalDate;
import org.springframework.beans.BeanUtils;
import com.vitasalus.dev.entity.MedicoEntity;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class MedicoDTO {

	private Long id;
	private String nome;
	private String sobrenome;
	private String cpf;
	private String email;
	private String telefone;
	private String crm;
	private String ufcrm;
	private LocalDate dataNascimento;
	private String senha;
	
	public MedicoDTO(MedicoEntity medico) {
		BeanUtils.copyProperties(medico, this);
	}

}
