package com.matrix.bank.securityconfig;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;


public class SecurityConfig {
/*
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		return http.csrf().disable()
				.authorizeHttpRequests()
                .requestMatchers("/api/v1/register","/api/v1/login").permitAll()
                .and().authorizeHttpRequests()
                .and().build();
	}
*/
}
