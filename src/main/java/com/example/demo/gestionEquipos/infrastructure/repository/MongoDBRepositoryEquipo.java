package com.example.demo.gestionEquipos.infrastructure.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.gestionEquipos.infrastructure.entity.EquipoEntity;


public interface MongoDBRepositoryEquipo extends MongoRepository<EquipoEntity, String>{

}
