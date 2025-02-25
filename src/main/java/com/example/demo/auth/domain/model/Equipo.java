package com.example.demo.auth.domain.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Equipo {
	private Long id;
	private String nombre;
	private List<Jugador> jugadores;
}
