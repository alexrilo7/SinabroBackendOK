package com.example.demo.auth.application.mappers;

import com.example.demo.auth.domain.model.Usuario;
import com.example.demo.auth.infrastructure.entity.UsuarioEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-26T01:41:20+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.4 (Eclipse Adoptium)"
)
@Component
public class UsuarioEntityMapperImpl implements UsuarioEntityMapper {

    @Override
    public Usuario toDomain(UsuarioEntity usuarioEntity) {
        if ( usuarioEntity == null ) {
            return null;
        }

        String userName = null;
        String password = null;

        userName = usuarioEntity.getUserName();
        password = usuarioEntity.getPassword();

        Usuario usuario = new Usuario( userName, password );

        return usuario;
    }

    @Override
    public UsuarioEntity toEntity(Usuario usuarioDomain) {
        if ( usuarioDomain == null ) {
            return null;
        }

        UsuarioEntity usuarioEntity = new UsuarioEntity();

        usuarioEntity.setUserName( usuarioDomain.getUserName() );
        usuarioEntity.setPassword( usuarioDomain.getPassword() );

        return usuarioEntity;
    }
}
