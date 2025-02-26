package com.example.demo.gestionEquipos.domain.ports.in;

import com.example.demo.gestionEquipos.domain.model.Jugador;
import com.example.demo.gestionEquipos.domain.model.Voto;

public interface VotarJugadorUseCase {
	public Jugador votarJugador(Voto voto);
}
