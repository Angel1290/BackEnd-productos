package com.products.entitys;

import lombok.Builder;

@Builder
public class AuthResponse {

	private String token;

	public AuthResponse(String token) {
		super();
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public AuthResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "AuthResponse [token=" + token + "]";
	}
	
	
	
	

}
