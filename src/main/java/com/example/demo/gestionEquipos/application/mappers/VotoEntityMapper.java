package com.example.demo.gestionEquipos.application.mappers;

import org.mapstruct.Mapper;

import com.example.demo.gestionEquipos.domain.model.Equipo;
import com.example.demo.gestionEquipos.domain.model.Voto;
import com.example.demo.gestionEquipos.infrastructure.entity.EquipoEntity;
import com.example.demo.gestionEquipos.infrastructure.entity.VotoEntity;

@Mapper(componentModel = "spring")
public interface VotoEntityMapper {
	
	Voto toDomain(VotoEntity equipoEntity);

	EquipoEntity toEntity(Equipo equipoDomain);
}
