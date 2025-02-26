package com.example.demo.gestionEquipos.application.mappers;

import org.mapstruct.Mapper;

import com.example.demo.gestionEquipos.domain.model.Equipo;
import com.example.demo.gestionEquipos.infrastructure.entity.EquipoEntity;

@Mapper(componentModel = "spring")
public interface EquipoEntityMapper {
	
	Equipo toDomain(EquipoEntity equipoEntity);

	EquipoEntity toEntity(Equipo equipoDomain);
}
