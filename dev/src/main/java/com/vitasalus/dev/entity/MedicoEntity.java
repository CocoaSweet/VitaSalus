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
	private String CPF;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "sobrenome")
	private String sobrenome;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "telefone")
	private String telefone;
	
	@Column(name = "crm")
	private String CRM;
	
	@Column(name = "ufcrm")
	private String UFCRM;
	
	@Column(name = "dt_nascimento")
	private Date dataNascimento;
	
	public MedicoEntity() {
	}
	
	public MedicoEntity(Long id, String cPF, String nome, String sobrenome, String email, String telefone, String cRM,
			String uFCRM, Date dataNascimento) {
		super();
		this.id = id;
		CPF = cPF;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.telefone = telefone;
		CRM = cRM;
		UFCRM = uFCRM;
		this.dataNascimento = dataNascimento;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getNome() {
		return nome;
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
	public String getCRM() {
		return CRM;
	}
	public void setCRM(String cRM) {
		CRM = cRM;
	}
	public String getUFCRM() {
		return UFCRM;
	}
	public void setUFCRM(String uFCRM) {
		UFCRM = uFCRM;
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
