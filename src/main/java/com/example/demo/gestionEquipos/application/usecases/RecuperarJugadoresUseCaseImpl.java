package com.example.demo.gestionEquipos.application.usecases;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.gestionEquipos.domain.model.Jugador;
import com.example.demo.gestionEquipos.domain.ports.in.RecuperarJugadoresUseCase;
import com.example.demo.gestionEquipos.domain.ports.out.JugadorRepositoryPort;

@Component
public class RecuperarJugadoresUseCaseImpl implements RecuperarJugadoresUseCase {

	@Autowired
	JugadorRepositoryPort jugadorRepositoryPort;
	
	@Override
	public List<Jugador> recuperarJugadores() {
		// TODO Auto-generated method stub
		return jugadorRepositoryPort.findAll();
	}


}
