package com.aic.base.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter; 

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig { 

	@Autowired
	private JwtAuthFilter authFilter; 

	// User Creation 
	@Bean
	public UserDetailsService userDetailsService() { 
		return new UserInfoService(); 
	} 

	// Configuring HttpSecurity 
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception { 
		return http.csrf().disable() 
				.authorizeHttpRequests() 
				.requestMatchers("/auth/generateToken").permitAll()
				.and()
				.authorizeHttpRequests() 
				.requestMatchers("/auth/addNewUser").permitAll()
				.and()
				.authorizeHttpRequests() 
				.requestMatchers("/swagger-ui/**").permitAll()
				.and()
				.authorizeHttpRequests() 
				.requestMatchers("/v3/**").permitAll()
				.and()
				.authorizeHttpRequests() 
				.requestMatchers("/auth/**").permitAll()
				.and()
				.authorizeHttpRequests()
				.requestMatchers("/common/runasyncservice").permitAll()
				.and()
				.authorizeHttpRequests()
				.requestMatchers("/common/getfield").permitAll()
				.and()
				.authorizeHttpRequests()
				.requestMatchers("/common/getparamlov").permitAll()
				.and()
				.authorizeHttpRequests()
				.requestMatchers("/common/insertAudit").permitAll()
				.and()
				.authorizeHttpRequests() 
				.requestMatchers("/common/editFields").permitAll()
				.and()
				.authorizeHttpRequests()
				.requestMatchers("/common/insertException").permitAll()
				.and()

//				.authorizeHttpRequests() 
//				.requestMatchers("/auth/getCompList", "/auth/getBranchList", "/auth/getDept", "/auth/login").permitAll()
//				.and()
//				.authorizeHttpRequests().requestMatchers("/auth/reset","/auth/forgot-password","/auth/reset-password").authenticated()
//				.and()
				.authorizeHttpRequests().requestMatchers("/common/**").authenticated() 
				.and()
				.authorizeHttpRequests().requestMatchers("/usermaster/**").authenticated() 
				.and()
				.authorizeHttpRequests().requestMatchers("/customer/**").authenticated() 
				.and()
				.authorizeHttpRequests().requestMatchers("/api/encryption/**").authenticated() 
				.and()
				.authorizeHttpRequests().requestMatchers("/auth/password_view").authenticated()
				.and() 
				.sessionManagement() 
				.sessionCreationPolicy(SessionCreationPolicy.STATELESS) 
				.and() 
				.authenticationProvider(authenticationProvider()) 
				.addFilterBefore(authFilter, UsernamePasswordAuthenticationFilter.class) 
				.build(); 
	} 

	// Password Encoding 
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return NoOpPasswordEncoder.getInstance(); // Jasypt handles encryption and decryption
//    }

    @Bean
    public AuthenticationProvider authenticationProvider() {
        CustomAuthenticationProvider authenticationProvider = new CustomAuthenticationProvider(userDetailsService());
        return authenticationProvider;
    }

	@Bean
	public AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception { 
		return config.getAuthenticationManager(); 
	} 


} 

