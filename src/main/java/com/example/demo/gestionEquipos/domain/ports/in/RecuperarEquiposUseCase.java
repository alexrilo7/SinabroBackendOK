package com.example.demo.gestionEquipos.domain.ports.in;

import java.util.List;

import com.example.demo.gestionEquipos.domain.model.Equipo;

public interface RecuperarEquiposUseCase {
	public List<Equipo> recuperarEquipos();
}
