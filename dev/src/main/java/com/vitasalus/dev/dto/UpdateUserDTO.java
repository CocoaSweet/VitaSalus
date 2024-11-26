package com.vitasalus.dev.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class UpdateUserDTO {

	private Long id;
	private String email;
	private String telefone;
	private String senha;
	
	public UpdateUserDTO(Long id, String email, String telefone, String senha) {
		this.id = id;
		this.email = email;
		this.telefone = telefone;
		this.senha = senha;
	}

}
