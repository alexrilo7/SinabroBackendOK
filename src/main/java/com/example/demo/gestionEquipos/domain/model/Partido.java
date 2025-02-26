package com.example.demo.gestionEquipos.domain.model;

import java.util.Date;

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
	private Date fecha;
	private String tipo;
}
