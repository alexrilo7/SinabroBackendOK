package com.example.demo.gestionEquipos.domain.ports.out;

import java.util.List;
import java.util.Optional;

import com.example.demo.gestionEquipos.domain.model.Partido;

public interface PartidoRepositoryPort {
	Partido save(Partido partido);
	boolean existsById(String id);
	List<Partido> findAll();
	Optional<Partido> findById(String id);
	List<Partido> findAllById(String id);
}
