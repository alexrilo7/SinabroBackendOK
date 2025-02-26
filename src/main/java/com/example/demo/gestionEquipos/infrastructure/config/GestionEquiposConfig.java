package com.example.demo.gestionEquipos.infrastructure.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class GestionEquiposConfig implements WebMvcConfigurer {
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**") // Permite CORS para todas las rutas
				.allowedOrigins("*")
				.allowedMethods("GET", "POST", "PUT", "DELETE") // Métodos																												
				.allowedHeaders("*"); // Permite todos los encabezados

	}
}
