package com.example.demo.gestionEquipos.application.usecases;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.gestionEquipos.domain.model.Equipo;
import com.example.demo.gestionEquipos.domain.ports.in.RecuperarEquiposUseCase;
import com.example.demo.gestionEquipos.domain.ports.out.EquipoRepositoryPort;

@Component
public class RecuperarEquiposUseCaseImpl implements RecuperarEquiposUseCase {

	@Autowired
	EquipoRepositoryPort equipoRepositoryPort;
	
	@Override
	public List<Equipo> recuperarEquipos() {
		// TODO Auto-generated method stub
		return equipoRepositoryPort.findAll();
	}


}
