package com.vitasalus.dev.service;

import com.vitasalus.dev.dto.*;

public interface AuthService {
	
	AcessDTO login(AuthenticationDTO authDTO);

}
