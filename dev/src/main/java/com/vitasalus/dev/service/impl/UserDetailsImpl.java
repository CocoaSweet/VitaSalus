package com.vitasalus.dev.service.impl;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.vitasalus.dev.entity.MedicoEntity;
import com.vitasalus.dev.entity.PacienteEntity;

public class UserDetailsImpl implements UserDetails {

	private Long id;
	private String name;
	private String cpf;
	private String email;
	private String password;
	private Collection<? extends GrantedAuthority> authorities;

	public UserDetailsImpl(Long id, String name, String cpf, String email, String password,
			Collection<? extends GrantedAuthority> authorities) {
		super();
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.email = email;
		this.password = password;
		this.authorities = authorities;
	}
	
	public static UserDetailsImpl build(PacienteEntity paciente) {
		return new UserDetailsImpl(paciente.getId(), paciente.getNome(), paciente.getCpf(), paciente.getEmail(),
				paciente.getSenha(), new ArrayList<>());
	}
	public static UserDetailsImpl build(MedicoEntity medico) {
		return new UserDetailsImpl(medico.getId(), medico.getNome(), medico.getCpf(), medico.getEmail(),
				medico.getSenha(), new ArrayList<>());
	}


	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return cpf;
	}

}
