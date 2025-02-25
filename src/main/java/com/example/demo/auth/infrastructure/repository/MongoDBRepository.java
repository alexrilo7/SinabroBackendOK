package com.example.demo.auth.infrastructure.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.auth.infrastructure.entity.UsuarioEntity;

public interface MongoDBRepository extends MongoRepository<UsuarioEntity, String>{

}
