package com.products.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import com.products.database.repository.UserRepository;
import com.products.entitys.AuthResponse;
import com.products.entitys.LoginRequest;
import com.products.entitys.User;

@Service
public class UserDetailsServiceImpl {

	@Autowired
	private UserRepository userReposiory;

	@Autowired
	private JwtServiceImpl jwtServiceImpl;

	@Autowired
	private AuthenticationManager authenticationManager;

	public AuthResponse login(LoginRequest request) {
		authenticationManager
				.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
		UserDetails user = userReposiory.findByUsername(request.getUsername()).orElseThrow();
		String token = jwtServiceImpl.getToken(user);
		return AuthResponse.builder().token(token).build();

	}
	
	public Optional<User> loadUserByUserName(String  userName) {

		Optional <User> usuario = this.userReposiory.findByUsername(userName);

		return usuario;
	}

}
