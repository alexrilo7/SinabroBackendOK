package com.example.demo.gestionEquipos.domain.ports.in;

import java.util.List;

import com.example.demo.gestionEquipos.domain.model.Jugador;

public interface RecuperarJugadoresUseCase {
	public List<Jugador> recuperarJugadores();
}
