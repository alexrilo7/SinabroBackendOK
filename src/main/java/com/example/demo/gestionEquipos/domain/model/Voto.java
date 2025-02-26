package com.example.demo.gestionEquipos.domain.model;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Voto {

	private Jugador jugador;
	private Partido partido;
	private Usuario usuario;
	private float valoracion;
	private int goles;
	private int asistencias;
}