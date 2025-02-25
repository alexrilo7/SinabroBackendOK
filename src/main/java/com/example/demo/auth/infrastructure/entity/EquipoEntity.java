package com.example.demo.auth.infrastructure.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.example.demo.auth.domain.model.Jugador;

import lombok.Getter;
import lombok.Setter;

@Document(collection = "equipos") // Nombre de la colección en MongoDB
@Getter
@Setter
public class EquipoEntity {

	@Id
	private Long id;
	private String nombre;
	private List<Jugador> jugadores;

}