package com.example.demo.gestionEquipos.infrastructure.adapters.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.gestionEquipos.application.mappers.EquipoEntityMapper;
import com.example.demo.gestionEquipos.domain.model.Equipo;
import com.example.demo.gestionEquipos.domain.ports.out.EquipoRepositoryPort;
import com.example.demo.gestionEquipos.infrastructure.repository.MongoDBRepositoryEquipo;

@Component
public class MongoDBEquipoRepositoryAdapter implements EquipoRepositoryPort {

	@Autowired
	private MongoDBRepositoryEquipo equipoRepository;

	@Autowired
	private EquipoEntityMapper equipoMapper;

	@Override
	public Equipo save(Equipo equipo) {
		if (equipoRepository.findById(equipo.getId()).isPresent()) {
			return null;
		}
		return equipoMapper.toDomain(equipoRepository.save(equipoMapper.toEntity(equipo)));

	}

	@Override
	public boolean existsById(String id) {
		
		return findById(id).isPresent();
	}

	@Override
	public List<Equipo> findAll() {
		// TODO Auto-generated method stub
		return equipoRepository.findAll().stream().map(equipo -> equipoMapper.toDomain(equipo)).toList();
	}

	@Override
	public Optional<Equipo> findById(String id) {
		// TODO Auto-generated method stub
		equipoRepository.findById(id);
		return Optional.of(equipoMapper.toDomain(equipoRepository.findById(id).get()));
	}

}
