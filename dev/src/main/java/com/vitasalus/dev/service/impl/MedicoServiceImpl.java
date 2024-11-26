package com.vitasalus.dev.service.impl;

import java.util.NoSuchElementException;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.vitasalus.dev.dto.*;
import com.vitasalus.dev.entity.MedicoEntity;
import com.vitasalus.dev.repository.MedicoRepository;
import com.vitasalus.dev.service.MedicoService;

@Service
public class MedicoServiceImpl implements MedicoService {

	@Autowired
	private final MedicoRepository medicoRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	public MedicoServiceImpl(MedicoRepository medicoRepository) {
		this.medicoRepository = medicoRepository;
	}
	
	@Override
	public Optional<ResponseDoctorDTO> findById(Long id) {
		Optional<MedicoEntity> medicoEntity = medicoRepository.findById(id);
		return medicoEntity.map(ResponseDoctorDTO::new); 	
		}

	@Override
	public Optional<ResponseDoctorDTO> findByCpf(String cpf) {
		Optional<MedicoEntity> medicoEntity = medicoRepository.findByCpf(cpf);
		return medicoEntity.map(ResponseDoctorDTO::new); 		}

	@Override
	public Optional<ResponseDoctorDTO> findByCrmAndUfcrm(String crm, String ufcrm) {
		Optional<MedicoEntity> medicoEntity = medicoRepository.findByCrmAndUfcrm(crm, ufcrm);
		return medicoEntity.map(ResponseDoctorDTO::new); 		}

	@Override
	public void saveMedico(MedicoDTO medico) {
		MedicoEntity medicoEntity = new MedicoEntity(medico);
		medicoEntity.setSenha(passwordEncoder.encode(medico.getSenha()));
		medicoRepository.save(medicoEntity);
	}

	@Override
	public void updateMedico(Long id, UpdateUserDTO medicoDTO) {
        MedicoEntity existingDoctor = medicoRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Paciente com ID " + id + " não encontrado"));
        
        existingDoctor.setEmail(medicoDTO.getEmail());
        existingDoctor.setTelefone(medicoDTO.getTelefone());
        if (medicoDTO.getSenha() != null && !medicoDTO.getSenha().isEmpty()) {
            existingDoctor.setSenha(passwordEncoder.encode(medicoDTO.getSenha()));
        }
        medicoRepository.save(existingDoctor);
    }

	@Override
	public void deleteMedico(Long id) {
		Optional<MedicoEntity> doctor = medicoRepository.findById(id);
		medicoRepository.delete(doctor.get());	}

	@Override
	public void deleteMedico(String cpf) {
		Optional<MedicoEntity> doctor = medicoRepository.findByCpf(cpf);
		medicoRepository.delete(doctor.get());
	}

	public MedicoDTO editDoctor(MedicoDTO doctor) {
		MedicoEntity medicoEntity = new MedicoEntity(doctor);
		return new MedicoDTO(medicoRepository.save(medicoEntity));
	}
}
