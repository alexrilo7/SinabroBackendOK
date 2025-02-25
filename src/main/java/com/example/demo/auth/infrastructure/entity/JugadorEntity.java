package com.example.demo.auth.infrastructure.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document(collection = "jugadores") // Nombre de la colección en MongoDB
@Getter
@Setter
public class JugadorEntity {

	@Id
	private Long id;
	private String nombre;
	private String apellidos;
	private int dorsal;
	private float valoracion;
	private int goles;
	private int asistencias;
	private Long equipoId;
}