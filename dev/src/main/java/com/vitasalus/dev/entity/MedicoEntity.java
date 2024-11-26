package com.vitasalus.dev.entity;

import java.time.LocalDate;
import org.springframework.beans.BeanUtils;
import com.vitasalus.dev.dto.MedicoDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
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
	private LocalDate dataNascimento;
	
	@Column(name = "senha")
	private String senha;
	

	public MedicoEntity() {
	}

	public MedicoEntity(MedicoDTO medico) {
		BeanUtils.copyProperties(medico, this);
	}

}
