package com.example.demo.auth.domain.model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Partido {
	private Equipo equipoLocal;
	private Equipo equipoVisitante;
	private LocalDateTime fecha;
}
