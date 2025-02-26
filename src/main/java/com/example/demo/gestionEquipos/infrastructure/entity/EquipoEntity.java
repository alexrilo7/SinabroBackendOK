package com.example.demo.gestionEquipos.infrastructure.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.example.demo.gestionEquipos.domain.model.Jugador;

import lombok.Getter;
import lombok.Setter;

@Document(collection = "equipos") // Nombre de la colección en MongoDB
@Getter
@Setter
public class EquipoEntity {

	@Id
	private String id;
	private String nombre;
	@DBRef
	private List<Jugador> jugadores;

}