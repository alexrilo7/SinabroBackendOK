package com.example.demo.gestionEquipos.application.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.gestionEquipos.domain.model.Equipo;
import com.example.demo.gestionEquipos.domain.model.Jugador;
import com.example.demo.gestionEquipos.domain.model.Partido;
import com.example.demo.gestionEquipos.domain.model.Voto;
import com.example.demo.gestionEquipos.domain.ports.in.GenerarPartidosUseCase;
import com.example.demo.gestionEquipos.domain.ports.in.RecuperarEquiposUseCase;
import com.example.demo.gestionEquipos.domain.ports.in.RecuperarJugadoresUseCase;
import com.example.demo.gestionEquipos.domain.ports.in.VotarJugadorUseCase;

@Service
public class EquipoService implements RecuperarEquiposUseCase, GenerarPartidosUseCase, RecuperarJugadoresUseCase, VotarJugadorUseCase {

	@Autowired
	private RecuperarEquiposUseCase recuperarEquiposUseCase;
	
	@Autowired
	private GenerarPartidosUseCase generarPartidosUseCase;
	
	@Autowired
	private RecuperarJugadoresUseCase recuperarJugadoresUseCase;
	
	@Autowired
	private VotarJugadorUseCase votarJugadorUseCase;

	@Override
	public List<Partido> generarPartidos(String equipoId) {
		// TODO Auto-generated method stub
		return generarPartidosUseCase.generarPartidos(equipoId);
	}

	@Override
	public List<Equipo> recuperarEquipos() {
		// TODO Auto-generated method stub
		return recuperarEquiposUseCase.recuperarEquipos();
	}

	@Override
	public List<Jugador> recuperarJugadores() {
		// TODO Auto-generated method stub
		return recuperarJugadoresUseCase.recuperarJugadores();
	}

	@Override
	public Jugador votarJugador(Voto voto) {
		// TODO Auto-generated method stub
		return votarJugadorUseCase.votarJugador(voto);
	}




}
