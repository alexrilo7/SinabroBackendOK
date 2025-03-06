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
    date = "2025-03-06T15:39:53+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.4 (Eclipse Adoptium)"
)
@Component
public class EquipoEntityMapperImpl implements EquipoEntityMapper {

    @Override
    public Equipo toDomain(EquipoEntity equipoEntity) {
        if ( equipoEntity == null ) {
            return null;
        }

        String id = null;
        String nombre = null;
        List<Jugador> jugadores = null;

        id = equipoEntity.getId();
        nombre = equipoEntity.getNombre();
        List<Jugador> list = equipoEntity.getJugadores();
        if ( list != null ) {
            jugadores = new ArrayList<Jugador>( list );
        }

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
        equipoEntity.setNombre( equipoDomain.getNombre() );
        List<Jugador> list = equipoDomain.getJugadores();
        if ( list != null ) {
            equipoEntity.setJugadores( new ArrayList<Jugador>( list ) );
        }

        return equipoEntity;
    }
}
