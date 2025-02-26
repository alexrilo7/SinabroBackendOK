package com.example.demo.gestionEquipos.application.mappers;

import com.example.demo.gestionEquipos.domain.model.Equipo;
import com.example.demo.gestionEquipos.domain.model.Jugador;
import com.example.demo.gestionEquipos.infrastructure.entity.EquipoEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-26T18:51:30+0100",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.39.0.v20240820-0604, environment: Java 21.0.4 (Eclipse Adoptium)"
)
@Component
public class EquipoEntityMapperImpl implements EquipoEntityMapper {

    @Override
    public Equipo toDomain(EquipoEntity equipoEntity) {
        if ( equipoEntity == null ) {
            return null;
        }

        String id = null;
        List<Jugador> jugadores = null;
        String nombre = null;

        id = equipoEntity.getId();
        List<Jugador> list = equipoEntity.getJugadores();
        if ( list != null ) {
            jugadores = new ArrayList<Jugador>( list );
        }
        nombre = equipoEntity.getNombre();

        Equipo equipo = new Equipo( id, nombre, jugadores );

        return equipo;
    }

    @Override
    public EquipoEntity toEntity(Equipo equipoDomain) {
        if ( equipoDomain == null ) {
            return null;
        }

        EquipoEntity equipoEntity = new EquipoEntity();

        equipoEntity.setId( equipoDomain.getId() );
        List<Jugador> list = equipoDomain.getJugadores();
        if ( list != null ) {
            equipoEntity.setJugadores( new ArrayList<Jugador>( list ) );
        }
        equipoEntity.setNombre( equipoDomain.getNombre() );

        return equipoEntity;
    }
}
