package com.vitasalus.dev.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.vitasalus.dev.entity.MedicoEntity;
import com.vitasalus.dev.entity.PacienteEntity;
import com.vitasalus.dev.repository.MedicoRepository;
import com.vitasalus.dev.repository.PacienteRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private MedicoRepository medicoRepository;
	
	@Autowired
	private PacienteRepository pacienteRepository;
	
	@Override
	public UserDetails loadUserByUsername(String cpf) throws UsernameNotFoundException {
		PacienteEntity paciente = pacienteRepository.findByCpf(cpf).get();
		return UserDetailsImpl.build(paciente);
	}
	
	public UserDetails loadMedicoByUsername(String username) throws UsernameNotFoundException{
		MedicoEntity medico = medicoRepository.findByCpf(username).get();
		return UserDetailsImpl.build(medico);
	}
	

}
