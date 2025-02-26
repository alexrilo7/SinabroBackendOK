package com.example.demo.gestionEquipos.infrastructure.adapters.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.gestionEquipos.application.mappers.JugadorEntityMapper;
import com.example.demo.gestionEquipos.domain.model.Jugador;
import com.example.demo.gestionEquipos.domain.model.Voto;
import com.example.demo.gestionEquipos.domain.ports.out.JugadorRepositoryPort;
import com.example.demo.gestionEquipos.infrastructure.entity.JugadorEntity;
import com.example.demo.gestionEquipos.infrastructure.repository.MongoDBRepositoryJugador;

@Component
public class MongoDBJugadorRepositoryAdapter implements JugadorRepositoryPort {

	@Autowired
	private MongoDBRepositoryJugador jugadorRepository;

	@Autowired
	private JugadorEntityMapper jugadorMapper;

	@Override
	public Jugador save(Jugador jugador) {
		if (jugadorRepository.findById(jugador.getId()).isPresent()) {
			return null;
		}
		return jugadorMapper.toDomain(jugadorRepository.save(jugadorMapper.toEntity(jugador)));

	}

	@Override
	public boolean existsById(String id) {
		
		return findById(id).isPresent();
	}

	@Override
	public List<Jugador> findAll() {
		// TODO Auto-generated method stub
		return jugadorRepository.findAll().stream().map(jugador -> jugadorMapper.toDomain(jugador)).toList();
	}

	@Override
	public Optional<Jugador> findById(String id) {
		// TODO Auto-generated method stub
		return Optional.of(jugadorMapper.toDomain(jugadorRepository.findById(id).get()));
	}

	@Override
	public Jugador votarJugador(Voto voto) {
		if (!jugadorRepository.findById(voto.getJugador().getId()).isPresent()) {
			return null;
		}
		JugadorEntity jugadorEntity = jugadorRepository.findById(voto.getJugador().getId()).get();
		jugadorEntity.getVotos().add(voto);
		
		return jugadorMapper.toDomain(jugadorRepository.save(jugadorEntity));
	}

}
