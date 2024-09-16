package com.vitasalus.dev.service.impl;

import java.util.Optional;
import com.vitasalus.dev.entity.MedicoEntity;
import com.vitasalus.dev.repository.MedicoRepository;
import com.vitasalus.dev.service.MedicoService;

public class MedicoServiceImpl implements MedicoService {

	private final MedicoRepository medicoRepository;
	
	public MedicoServiceImpl(MedicoRepository medicoRepository) {
		this.medicoRepository = medicoRepository;
	}
	
	@Override
	public Optional<MedicoEntity> findById(Long id) {
		return medicoRepository.findById(id);
	}

	@Override
	public Optional<MedicoEntity> findByCpf(String cpf) {
		return medicoRepository.findByCpf(cpf);
	}

	@Override
	public Optional<MedicoEntity> findByCrmAndUfcrm(String crm, String ufcrm) {
		return medicoRepository.findByCrmAndUfcrm(crm, ufcrm);
	}

	@Override
	public MedicoEntity saveMedico(MedicoEntity medicoEntity) {
		return medicoRepository.save(medicoEntity);
	}

	@Override
	public MedicoEntity updateMedico(MedicoEntity medicoEntity) {
		return medicoRepository.save(medicoEntity);
	}

	@Override
	public void deleteMedico(Long id) {
		medicoRepository.deleteById(id);
	}

	@Override
	public void deleteMedico(String cpf) {
		medicoRepository.deleteByCpf(cpf);
	}

}
