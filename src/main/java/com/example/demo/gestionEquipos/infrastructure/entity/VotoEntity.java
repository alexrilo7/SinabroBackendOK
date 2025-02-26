package com.example.demo.gestionEquipos.infrastructure.entity;

import com.example.demo.gestionEquipos.domain.model.Jugador;
import com.example.demo.gestionEquipos.domain.model.Partido;
import com.example.demo.gestionEquipos.domain.model.Usuario;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class VotoEntity {

	private Jugador jugador;
	private Partido partido;
	private Usuario usuario;
	private float valoracion;
	private int goles;
	private int asistencias;
}