package com.products.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.products.entitys.LoginRequest;
import com.products.service.impl.UserDetailsServiceImpl;
import com.products.utils.ConstantesGlobales;

import io.swagger.oas.annotations.Operation;

/*
 * Class Controller 
 */
@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "http://localhost:4200")
public class AuthenticationController {

	@Autowired
	private UserDetailsServiceImpl userDetailsServiceImpl;

	/**
	 * Expone el endpoint para generar el Token del usario
	 * 
	 * @return Token
	 * @parama Resquest del usario (nombre de usuario y password)
	 */
	@Operation(method = "Login", description = "Generate Token")
	@PostMapping(value = ConstantesGlobales.GENERATE_TOKEN)
	public ResponseEntity<?> login(@RequestBody LoginRequest request) {
		return ResponseEntity.ok(userDetailsServiceImpl.login(request));
	}

	/**
	 * @ Expone el endpoint para Obtener el usuario
	 * 
	 * @return datos del usuario
	 * @param Principal (nombre del usaurio)
	 */
	@Operation(method = "Login", description = "Curent user")
	@GetMapping(value = ConstantesGlobales.CURRENT_USER)
	public ResponseEntity<?> currentUser(Principal principal) {
		return ResponseEntity.ok(userDetailsServiceImpl.loadUserByUserName(principal.getName()));
	}

}
