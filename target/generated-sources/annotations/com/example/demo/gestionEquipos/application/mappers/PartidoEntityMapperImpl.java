package com.example.demo.gestionEquipos.application.mappers;

import com.example.demo.gestionEquipos.domain.model.Partido;
import com.example.demo.gestionEquipos.infrastructure.entity.PartidoEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-26T13:18:55+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.4 (Eclipse Adoptium)"
)
@Component
public class PartidoEntityMapperImpl implements PartidoEntityMapper {

    @Override
    public Partido toDomain(PartidoEntity partidoEntity) {
        if ( partidoEntity == null ) {
            return null;
        }

        Partido partido = new Partido();

        partido.setId( partidoEntity.getId() );
        partido.setEquipoLocal( partidoEntity.getEquipoLocal() );
        partido.setEquipoVisitante( partidoEntity.getEquipoVisitante() );
        partido.setFecha( partidoEntity.getFecha() );

        return partido;
    }

    @Override
    public PartidoEntity toEntity(Partido partidoDomain) {
        if ( partidoDomain == null ) {
            return null;
        }

        PartidoEntity partidoEntity = new PartidoEntity();

        partidoEntity.setId( partidoDomain.getId() );
        partidoEntity.setEquipoLocal( partidoDomain.getEquipoLocal() );
        partidoEntity.setEquipoVisitante( partidoDomain.getEquipoVisitante() );
        partidoEntity.setFecha( partidoDomain.getFecha() );

        return partidoEntity;
    }
}
