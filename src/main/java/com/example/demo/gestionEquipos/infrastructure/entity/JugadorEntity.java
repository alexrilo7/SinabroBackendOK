package com.example.demo.gestionEquipos.infrastructure.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document(collection = "jugadores") // Nombre de la colección en MongoDB
@Getter
@Setter
public class JugadorEntity {

	@Id
	private String id;
	private String nombre;
	private String apellidos;
	private int dorsal;
	private float valoracion;
	private int goles;
	private int asistencias;
	private String equipoId;
}