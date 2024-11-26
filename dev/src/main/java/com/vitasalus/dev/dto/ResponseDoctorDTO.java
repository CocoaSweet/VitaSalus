package com.vitasalus.dev.dto;

import java.time.LocalDate;
import org.springframework.beans.BeanUtils;
import com.vitasalus.dev.entity.MedicoEntity;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class ResponseDoctorDTO {

	private Long id;
	private String nome;
	private String sobrenome;
	private String cpf;
	private String email;
	private String telefone;
	private String crm;
	private String ufcrm;
	private LocalDate dataNascimento;
	
	public ResponseDoctorDTO(MedicoEntity medico) {
		BeanUtils.copyProperties(medico, this);
	}
	
	@Override
	public String toString() {
		return "ResponseDoctorDTO [nome=" + nome + ", sobrenome=" + sobrenome + ", cpf=" + cpf + ", email=" + email
				+ ", telefone=" + telefone + ", crm=" + crm + ", ufcrm=" + ufcrm + ", dataNascimento=" + dataNascimento
				+ "]";
	}
	
	
}
