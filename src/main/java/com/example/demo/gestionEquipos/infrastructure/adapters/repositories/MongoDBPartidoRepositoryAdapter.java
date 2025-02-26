package com.example.demo.gestionEquipos.infrastructure.adapters.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.gestionEquipos.application.mappers.PartidoEntityMapper;
import com.example.demo.gestionEquipos.domain.model.Partido;
import com.example.demo.gestionEquipos.domain.ports.out.PartidoRepositoryPort;
import com.example.demo.gestionEquipos.infrastructure.repository.MongoDBRepositoryPartido;

@Component
public class MongoDBPartidoRepositoryAdapter implements PartidoRepositoryPort {

	@Autowired
	private MongoDBRepositoryPartido partidoRepository;

	@Autowired
	private PartidoEntityMapper partidoMapper;

	@Override
	public Partido save(Partido partido) {
		return partidoMapper.toDomain(partidoRepository.save(partidoMapper.toEntity(partido)));
	}

	@Override
	public boolean existsById(String id) {

		return findById(id).isPresent();
	}

	@Override
	public List<Partido> findAll() {
		// TODO Auto-generated method stub
		return partidoRepository.findAll().stream().map(partido -> partidoMapper.toDomain(partido)).toList();
	}

	@Override
	public Optional<Partido> findById(String id) {
		// TODO Auto-generated method stub
		partidoRepository.findById(id);
		return Optional.of(partidoMapper.toDomain(partidoRepository.findById(id).get()));
	}

	@Override
	public List<Partido> findAllById(String id) {
		// TODO Auto-generated method stub
		return partidoRepository.findByEquipoId(id).stream().map(partido -> partidoMapper.toDomain(partido)).toList();
	}


}
