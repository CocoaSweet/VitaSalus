package com.vitasalus.dev.service;

import com.vitasalus.dev.dto.AcessDTO;
import com.vitasalus.dev.dto.AuthenticationDTO;

public interface AuthService {
	
	AcessDTO login(AuthenticationDTO authDTO);

}
