package com.example.demo.auth.application.mappers;

import com.example.demo.auth.domain.model.Usuario;
import com.example.demo.auth.infrastructure.entity.UsuarioEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-03-06T15:39:53+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.4 (Eclipse Adoptium)"
)
@Component
public class UsuarioEntityMapperImpl implements UsuarioEntityMapper {

    @Override
    public Usuario toDomain(UsuarioEntity usuarioEntity) {
        if ( usuarioEntity == null ) {
            return null;
        }

        String username = null;
        String password = null;

        username = usuarioEntity.getUsername();
        password = usuarioEntity.getPassword();

        Usuario usuario = new Usuario( username, password );

        return usuario;
    }

    @Override
    public UsuarioEntity toEntity(Usuario usuarioDomain) {
        if ( usuarioDomain == null ) {
            return null;
        }

        UsuarioEntity usuarioEntity = new UsuarioEntity();

        usuarioEntity.setUsername( usuarioDomain.getUsername() );
        usuarioEntity.setPassword( usuarioDomain.getPassword() );

        return usuarioEntity;
    }
}
