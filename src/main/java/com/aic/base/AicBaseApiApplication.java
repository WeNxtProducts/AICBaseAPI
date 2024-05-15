package com.aic.base;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;

@SpringBootApplication
@PropertySource("classpath:Properties/login_msgs.properties")
@PropertySource("classpath:Properties/lov_msgs.properties")
@PropertySource("classpath:Properties/auditexcep_msgs.properties")
@PropertySource("classpath:Properties/usermaster_msgs.properties")
@PropertySource("classpath:Properties/password_msgs.properties")
@PropertySource("classpath:Properties/common_msgs.properties")

@EnableEncryptableProperties
@OpenAPIDefinition
@Configuration
@EnableAsync
public class AicBaseApiApplication {
	
	@Value("${spring.allowed.origin}")
	private String allowedOrigin;

	public static void main(String[] args) {
		SpringApplication.run(AicBaseApiApplication.class, args);
	}
	
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")
				.allowedOrigins(allowedOrigin.split(","));
			}
		};
	}

}
