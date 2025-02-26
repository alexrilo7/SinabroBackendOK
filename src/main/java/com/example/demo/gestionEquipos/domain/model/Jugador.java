package com.example.demo.gestionEquipos.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Jugador {
	private Long id;
	private String nombre;
	private String apellidos;
	private int dorsal;
	private float valoracion;
	private int goles;
	private int asistencias;
	private Long equipoId;
}
