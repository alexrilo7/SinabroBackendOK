package com.example.demo.auth.infrastructure.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.example.demo.auth.domain.model.Equipo;

import lombok.Getter;
import lombok.Setter;

@Document(collection = "partidos") // Nombre de la colección en MongoDB
@Getter
@Setter
public class PartidoEntity {
	
	@Id
	private Long id;
	private Equipo equipoLocal;
	private Equipo equipoVisitante;
	private LocalDateTime fecha;

}