package com.example.demo.gestionEquipos.application.mappers;

import com.example.demo.gestionEquipos.domain.model.Partido;
import com.example.demo.gestionEquipos.infrastructure.entity.PartidoEntity;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Date;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-26T16:03:56+0100",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.39.0.v20240820-0604, environment: Java 21.0.4 (Eclipse Adoptium)"
)
@Component
public class PartidoEntityMapperImpl implements PartidoEntityMapper {

    @Override
    public Partido toDomain(PartidoEntity partidoEntity) {
        if ( partidoEntity == null ) {
            return null;
        }

        Partido partido = new Partido();

        partido.setEquipoLocal( partidoEntity.getEquipoLocal() );
        partido.setEquipoVisitante( partidoEntity.getEquipoVisitante() );
        if ( partidoEntity.getFecha() != null ) {
            partido.setFecha( LocalDateTime.ofInstant( partidoEntity.getFecha().toInstant(), ZoneId.of( "UTC" ) ) );
        }
        partido.setId( partidoEntity.getId() );
        partido.setTipo( partidoEntity.getTipo() );

        return partido;
    }

    @Override
    public PartidoEntity toEntity(Partido partidoDomain) {
        if ( partidoDomain == null ) {
            return null;
        }

        PartidoEntity partidoEntity = new PartidoEntity();

        partidoEntity.setEquipoLocal( partidoDomain.getEquipoLocal() );
        partidoEntity.setEquipoVisitante( partidoDomain.getEquipoVisitante() );
        if ( partidoDomain.getFecha() != null ) {
            partidoEntity.setFecha( Date.from( partidoDomain.getFecha().toInstant( ZoneOffset.UTC ) ) );
        }
        partidoEntity.setId( partidoDomain.getId() );
        partidoEntity.setTipo( partidoDomain.getTipo() );

        return partidoEntity;
    }
}
