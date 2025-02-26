package com.example.demo.gestionEquipos.domain.ports.out;

import java.util.List;
import java.util.Optional;

import com.example.demo.gestionEquipos.domain.model.Jugador;

public interface JugadorRepositoryPort {
	Jugador save(Jugador jugador);
	boolean existsById(String id);
	List<Jugador> findAll();
	Optional<Jugador> findById(String id);
}
