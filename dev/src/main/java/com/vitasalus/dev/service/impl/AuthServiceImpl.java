package com.vitasalus.dev.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;
import com.vitasalus.dev.dto.AcessDTO;
import com.vitasalus.dev.dto.AuthenticationDTO;
import com.vitasalus.dev.security.jwt.JwtUtils;
import com.vitasalus.dev.service.AuthService;

@Service
public class AuthServiceImpl implements AuthService {

	@Autowired
	private JwtUtils jwtUtils;
	@Autowired
	private AuthenticationManager authenticationManager;

	@Override
	public AcessDTO login(AuthenticationDTO authDto) {
		try {
			UsernamePasswordAuthenticationToken userAuth = new UsernamePasswordAuthenticationToken(authDto.getCpf(),
					authDto.getPassword());
			Authentication authentication = authenticationManager.authenticate(userAuth);
			UserDetailsImpl userAuthenticate = (UserDetailsImpl) authentication.getPrincipal();
			String token = jwtUtils.generateTokenFromUserDetailsImpl(userAuthenticate);
			AcessDTO acessDto = new AcessDTO(token);
			return acessDto;

		} catch (BadCredentialsException e) {
			System.out.println(e.toString());
		}
		return null;
	}

	public AcessDTO loginMedico(AuthenticationDTO authDto) {
		try {
			UsernamePasswordAuthenticationToken userAuth = new UsernamePasswordAuthenticationToken(authDto.getCpf(),
					authDto.getPassword());
			Authentication authentication = authenticationManager.authenticate(userAuth);
			UserDetailsImpl userAuthenticate = (UserDetailsImpl) authentication.getPrincipal();
			String token = jwtUtils.generateTokenFromUserDetailsImpl(userAuthenticate);
			return new AcessDTO(token);

		} catch (BadCredentialsException e) {
			System.out.println(e.toString());
		}
		return null;
	}

}
