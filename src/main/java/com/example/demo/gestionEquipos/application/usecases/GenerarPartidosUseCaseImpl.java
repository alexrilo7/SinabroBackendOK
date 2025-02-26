package com.example.demo.gestionEquipos.application.usecases;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.gestionEquipos.domain.model.Partido;
import com.example.demo.gestionEquipos.domain.ports.in.GenerarPartidosUseCase;
import com.example.demo.gestionEquipos.domain.ports.out.PartidoRepositoryPort;

@Component
public class GenerarPartidosUseCaseImpl implements GenerarPartidosUseCase{

	@Autowired
	private PartidoRepositoryPort partidoRepositoryPort;
	
	@Override
	public List<Partido> generarPartidos(String equipoId) {
		// TODO Auto-generated method stub
		return partidoRepositoryPort.findAllById(equipoId);
	}
	

}
