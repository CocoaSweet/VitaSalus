package com.vitasalus.dev.entity;

import java.time.LocalDate;

import org.springframework.beans.BeanUtils;

import com.vitasalus.dev.dto.PacienteDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "pacientes", uniqueConstraints = { @UniqueConstraint(columnNames = { "cpf", "email", "telefone" }) })
public class PacienteEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_paciente")
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

	@Column(name = "dt_nascimento")
	private LocalDate dataNascimento;
	
	@Column(name = "senha")
	private String senha;

	public PacienteEntity() {
	}

	public PacienteEntity(PacienteDTO paciente) {
		BeanUtils.copyProperties(paciente, this);
	}


}
