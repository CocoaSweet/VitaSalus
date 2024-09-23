package com.vitasalus.dev.dto;

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

	public UpdateUserDTO() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
