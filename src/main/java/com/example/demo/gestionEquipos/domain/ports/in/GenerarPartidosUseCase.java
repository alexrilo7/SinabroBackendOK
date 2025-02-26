package com.example.demo.gestionEquipos.domain.ports.in;

import java.util.List;

import com.example.demo.gestionEquipos.domain.model.Partido;

public interface GenerarPartidosUseCase {
	public List<Partido> generarPartidos(String equipoId);
}
