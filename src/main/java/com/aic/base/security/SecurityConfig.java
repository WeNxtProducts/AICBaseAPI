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
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer; 

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig implements WebMvcConfigurer{ 

	@Autowired
	private JwtAuthFilter authFilter; 

	// User Creation 
	@Bean
	public UserDetailsService userDetailsService() { 
		return new UserInfoService(); 
	} 
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
	    registry.addInterceptor(new TokenInterceptor())
	            .addPathPatterns("/auth/expire-session**");
	}

	// Configuring HttpSecurity 
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception { 
		return http.csrf().disable() 
				.authorizeHttpRequests() 
				.requestMatchers("/auth/generateToken").permitAll()
				.and()
				.authorizeHttpRequests() 
				.requestMatchers("/auth/addNewUser").authenticated()
				.and()
				.authorizeHttpRequests() 
				.requestMatchers("/swagger-ui/**").permitAll()
				.and()
				.authorizeHttpRequests() 
				.requestMatchers("/v3/**").permitAll()
				.and()
				.authorizeHttpRequests() 
				.requestMatchers("/log/logger").authenticated()
				.and()
				.authorizeHttpRequests() 
				.requestMatchers("/auth/**").permitAll()
				.and()
//				.authorizeHttpRequests()
//				.requestMatchers("/common/runasyncservice").authenticated()
//				.and()
//				.authorizeHttpRequests()
//				.requestMatchers("/common/editFields").authenticated()
//				.and()
//				.authorizeHttpRequests()
//				.requestMatchers("/common/lovtoJson").authenticated()
//				.and()
//				.authorizeHttpRequests()
//				.requestMatchers("/common/getparamlov").authenticated()
//				.and()
//				.authorizeHttpRequests()
//				.requestMatchers("/common/insertAudit").authenticated()
//				.and()
				.authorizeHttpRequests()
				.requestMatchers("/emailTemplate/**").authenticated()
				.and()
				.authorizeHttpRequests()
				.requestMatchers("/auth/expire-session**").authenticated()
				.and()
				.authorizeHttpRequests()
				.requestMatchers("/common/**").authenticated()
				.and()
//				.authorizeHttpRequests()
//				.requestMatchers("/common/insertException").authenticated()
//				.and()
//				.authorizeHttpRequests()
//				.requestMatchers("/common/rulesJson").authenticated()
//				.and()
//				.authorizeHttpRequests()
//				.requestMatchers("/common/boundaryConds").authenticated()
//				.and()
//				.authorizeHttpRequests()
//				.requestMatchers("common/invokeProcedure").authenticated()
//				.and()
//				.authorizeHttpRequests().requestMatchers("/common/getMapQuery").authenticated()
//				.and()
//				.authorizeHttpRequests().requestMatchers("/common/**").authenticated() 
//				.and()
				.authorizeHttpRequests().requestMatchers("/usermaster/**").authenticated() 
				.and()
				.authorizeHttpRequests().requestMatchers("/customer/**").authenticated() 
				.and()
				.authorizeHttpRequests().requestMatchers("/api/encryption/**").authenticated() 
				.and()
				.authorizeHttpRequests().requestMatchers("/auth/password_view").authenticated()
				.and() 
				.authorizeHttpRequests().requestMatchers("/queryMaster/**").authenticated()
				.and()
				.authorizeHttpRequests().requestMatchers("/auto-dispatch/**").authenticated()
				.and()
				.authorizeHttpRequests()
				.requestMatchers("common/ltQquotAssuredDtlsEdit").permitAll()
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

