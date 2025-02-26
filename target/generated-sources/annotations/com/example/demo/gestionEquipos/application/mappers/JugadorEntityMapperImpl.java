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
    date = "2025-02-26T16:12:51+0100",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.39.0.v20240820-0604, environment: Java 21.0.4 (Eclipse Adoptium)"
)
@Component
public class JugadorEntityMapperImpl implements JugadorEntityMapper {

    @Override
    public Jugador toDomain(JugadorEntity jugadorEntity) {
        if ( jugadorEntity == null ) {
            return null;
        }

        String apellidos = null;
        int asistencias = 0;
        int dorsal = 0;
        String equipoId = null;
        int goles = 0;
        String id = null;
        String nombre = null;
        float valoracion = 0.0f;
        List<Voto> votos = null;

        apellidos = jugadorEntity.getApellidos();
        asistencias = jugadorEntity.getAsistencias();
        dorsal = jugadorEntity.getDorsal();
        equipoId = jugadorEntity.getEquipoId();
        goles = jugadorEntity.getGoles();
        id = jugadorEntity.getId();
        nombre = jugadorEntity.getNombre();
        valoracion = jugadorEntity.getValoracion();
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

        jugadorEntity.setApellidos( equipoDomain.getApellidos() );
        jugadorEntity.setAsistencias( equipoDomain.getAsistencias() );
        jugadorEntity.setDorsal( equipoDomain.getDorsal() );
        jugadorEntity.setEquipoId( equipoDomain.getEquipoId() );
        jugadorEntity.setGoles( equipoDomain.getGoles() );
        jugadorEntity.setId( equipoDomain.getId() );
        jugadorEntity.setNombre( equipoDomain.getNombre() );
        jugadorEntity.setValoracion( equipoDomain.getValoracion() );
        List<Voto> list = equipoDomain.getVotos();
        if ( list != null ) {
            jugadorEntity.setVotos( new ArrayList<Voto>( list ) );
        }

        return jugadorEntity;
    }
}
