package com.example.demo.gestionEquipos.application.mappers;

import org.mapstruct.Mapper;

import com.example.demo.gestionEquipos.domain.model.Partido;
import com.example.demo.gestionEquipos.infrastructure.entity.PartidoEntity;

@Mapper(componentModel = "spring")
public interface PartidoEntityMapper {
	
	Partido toDomain(PartidoEntity partidoEntity);

	PartidoEntity toEntity(Partido partidoDomain);
}
