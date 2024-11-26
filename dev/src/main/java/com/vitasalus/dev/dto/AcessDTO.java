package com.vitasalus.dev.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AcessDTO {

	private String token;

	public AcessDTO(String token) {
		this.token = token;
	}
}
