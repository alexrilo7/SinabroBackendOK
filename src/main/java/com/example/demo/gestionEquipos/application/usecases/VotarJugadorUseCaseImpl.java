package com.example.demo.gestionEquipos.application.usecases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.gestionEquipos.domain.model.Jugador;
import com.example.demo.gestionEquipos.domain.model.Voto;
import com.example.demo.gestionEquipos.domain.ports.in.VotarJugadorUseCase;
import com.example.demo.gestionEquipos.domain.ports.out.JugadorRepositoryPort;

@Component
public class VotarJugadorUseCaseImpl implements VotarJugadorUseCase{

	@Autowired
	private JugadorRepositoryPort jugadorRepositoryPort;
	
	@Override
	public Jugador votarJugador(Voto voto) {
		// TODO Auto-generated method stub	
		
		return jugadorRepositoryPort.votarJugador(voto);
	}
	

}
