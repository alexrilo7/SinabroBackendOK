package com.example.demo.gestionEquipos.domain.ports.out;

import java.util.List;
import java.util.Optional;

import com.example.demo.gestionEquipos.domain.model.Equipo;

public interface EquipoRepositoryPort {
	Equipo save(Equipo equipo);
	boolean existsById(String id);
	List<Equipo> findAll();
	Optional<Equipo> findById(String id);
}
