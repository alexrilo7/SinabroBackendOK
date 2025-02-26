package com.example.demo.gestionEquipos.infrastructure.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.demo.gestionEquipos.infrastructure.entity.PartidoEntity;


public interface MongoDBRepositoryPartido extends MongoRepository<PartidoEntity, String>{
	@Query("{ $or: [ { 'equipoLocalId': ?0 }, { 'equipoVisitanteId': ?0 } ] }")
    List<PartidoEntity> findByEquipoId(String equipoId);
}
