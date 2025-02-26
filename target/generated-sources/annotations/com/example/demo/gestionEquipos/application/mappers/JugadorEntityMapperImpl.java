package com.example.demo.gestionEquipos.application.mappers;

import com.example.demo.gestionEquipos.domain.model.Jugador;
import com.example.demo.gestionEquipos.domain.model.Voto;
import com.example.demo.gestionEquipos.infrastructure.entity.JugadorEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-02-26T20:01:44+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.4 (Eclipse Adoptium)"
)
@Component
public class JugadorEntityMapperImpl implements JugadorEntityMapper {

    @Override
    public Jugador toDomain(JugadorEntity jugadorEntity) {
        if ( jugadorEntity == null ) {
            return null;
        }

        String id = null;
        String nombre = null;
        String apellidos = null;
        int dorsal = 0;
        float valoracion = 0.0f;
        int goles = 0;
        int asistencias = 0;
        String equipoId = null;
        List<Voto> votos = null;

        id = jugadorEntity.getId();
        nombre = jugadorEntity.getNombre();
        apellidos = jugadorEntity.getApellidos();
        dorsal = jugadorEntity.getDorsal();
        valoracion = jugadorEntity.getValoracion();
        goles = jugadorEntity.getGoles();
        asistencias = jugadorEntity.getAsistencias();
        equipoId = jugadorEntity.getEquipoId();
        List<Voto> list = jugadorEntity.getVotos();
        if ( list != null ) {
            votos = new ArrayList<Voto>( list );
        }

        Jugador jugador = new Jugador( id, nombre, apellidos, dorsal, valoracion, goles, asistencias, equipoId, votos );

        return jugador;
    }

    @Override
    public JugadorEntity toEntity(Jugador equipoDomain) {
        if ( equipoDomain == null ) {
            return null;
        }

        JugadorEntity jugadorEntity = new JugadorEntity();

        jugadorEntity.setId( equipoDomain.getId() );
        jugadorEntity.setNombre( equipoDomain.getNombre() );
        jugadorEntity.setApellidos( equipoDomain.getApellidos() );
        jugadorEntity.setDorsal( equipoDomain.getDorsal() );
        jugadorEntity.setValoracion( equipoDomain.getValoracion() );
        jugadorEntity.setGoles( equipoDomain.getGoles() );
        jugadorEntity.setAsistencias( equipoDomain.getAsistencias() );
        jugadorEntity.setEquipoId( equipoDomain.getEquipoId() );
        List<Voto> list = equipoDomain.getVotos();
        if ( list != null ) {
            jugadorEntity.setVotos( new ArrayList<Voto>( list ) );
        }

        return jugadorEntity;
    }
}
