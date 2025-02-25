package com.example.demo.auth.application.mappers;

import org.mapstruct.Mapper;

import com.example.demo.auth.domain.model.Usuario;
import com.example.demo.auth.infrastructure.entity.UsuarioEntity;

@Mapper(componentModel = "spring")
public interface UsuarioEntityMapper {
	
	Usuario toDomain(UsuarioEntity usuarioEntity);

	UsuarioEntity toEntity(Usuario usuarioDomain);
}
