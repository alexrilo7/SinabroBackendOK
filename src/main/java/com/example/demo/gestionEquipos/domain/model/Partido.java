package com.example.demo.gestionEquipos.domain.model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Partido {
	private String id;
	private Equipo equipoLocal;
	private Equipo equipoVisitante;
	private LocalDateTime fecha;
	private String tipo;
}
