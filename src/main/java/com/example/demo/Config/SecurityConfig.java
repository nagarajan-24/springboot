package com.example.demo.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import com.example.demo.UserService.CustomUserService;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
	    http
	        .csrf().disable() 
	        .authorizeHttpRequests(auth -> auth
	            .requestMatchers("/user").permitAll()           
	            .requestMatchers("/api/books/**").authenticated() 
	            .anyRequest().permitAll()                        
	        )
	        .formLogin(form -> form
	            .permitAll()
	            .defaultSuccessUrl("/dashboard", true)
	        );

	    return http.build();
	}
	@Bean
	public UserDetailsService userDetailsService() {
//		UserDetails user = User.withUsername("nagaraj")
//		        .password(passwordEncoder.encode("12345"))
//		        .roles("USER")
//		        .build();
//
//		UserDetails admin = User.withUsername("ishaan")
//		        .password(passwordEncoder.encode("12345"))
//		        .roles("ADMIN")
//		        .build();
//		return new InMemoryUserDetailsManager(user,admin);
		return new CustomUserService();
	}
	@Bean
	public DaoAuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider dao = new DaoAuthenticationProvider();
		dao.setUserDetailsService(userDetailsService());
		dao.setPasswordEncoder(passwordEncoder());
		return dao;
	}
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
