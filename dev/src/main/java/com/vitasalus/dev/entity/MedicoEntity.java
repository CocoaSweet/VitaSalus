package com.vitasalus.dev.entity;

import java.util.Date;
import jakarta.persistence.*;

@Entity
@Table(name = "medicos", uniqueConstraints={@UniqueConstraint(columnNames={"cpf", "email", "telefone"})})
public class MedicoEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_medico")
	private Long id;

	@Column(name = "cpf")
	private String cpf;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "sobrenome")
	private String sobrenome;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "telefone")
	private String telefone;
	
	@Column(name = "crm")
	private String crm;
	
	@Column(name = "ufcrm")
	private String ufcrm;
	
	@Column(name = "dt_nascimento")
	private Date dataNascimento;
	
	@Column(name = "senha")
	private String senha;
	

	public MedicoEntity() {
	}

	public MedicoEntity(Long id, String cpf, String nome, String sobrenome, String email, String telefone, String crm,
			String ufcrm, Date dataNascimento, String senha) {
		super();
		this.id = id;
		this.cpf = cpf;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.telefone = telefone;
		this.crm = crm;
		this.ufcrm = ufcrm;
		this.dataNascimento = dataNascimento;
		this.senha = senha;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
	public String getCrm() {
		return crm;
	}
	public void setCrm(String crm) {
		this.crm = crm;
	}
	public String getUfcrm() {
		return ufcrm;
	}
	public void setUfcrm(String ufcrm) {
		this.ufcrm = ufcrm;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	
	
	
}
