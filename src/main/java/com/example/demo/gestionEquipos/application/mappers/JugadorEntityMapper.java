package com.example.demo.gestionEquipos.application.mappers;

import org.mapstruct.Mapper;

import com.example.demo.gestionEquipos.domain.model.Jugador;
import com.example.demo.gestionEquipos.infrastructure.entity.JugadorEntity;

@Mapper(componentModel = "spring")
public interface JugadorEntityMapper {
	
	Jugador toDomain(JugadorEntity jugadorEntity);

	JugadorEntity toEntity(Jugador equipoDomain);
}
