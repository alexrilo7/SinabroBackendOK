package com.example.demo.gestionEquipos.infrastructure.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.gestionEquipos.infrastructure.entity.JugadorEntity;


public interface MongoDBRepositoryJugador extends MongoRepository<JugadorEntity, String>{

}
