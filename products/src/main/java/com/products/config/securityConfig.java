package com.products.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

/*
 * class para validar la autentificacion y dar acceso a los recursos
 */
@Configuration
@EnableWebSecurity
public class securityConfig {

	@Autowired
	private JwtAuthenticationFilter jwtAuthenticationFilter;

	@Autowired
	private AuthenticationProvider authProvider;

	/**
	 * Metodo para dar acceso a ciertos endpoint y proteger los demas endpoint 
	 * 
	 * @return Token
	 * @parama HttpSecurity
	 */

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		return http.csrf(csrf -> csrf.disable()).authorizeHttpRequests(authRequest ->
		authRequest
		.requestMatchers(HttpMethod.GET).permitAll()
		.requestMatchers(HttpMethod.OPTIONS).permitAll()
		.requestMatchers("/auth/**").permitAll().anyRequest().authenticated())
		.sessionManagement(
						sessionManager -> sessionManager.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
				.authenticationProvider(authProvider)
				.addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class).build();

	}
}
