package com.example.demo.gestionEquipos.application.mappers;

import com.example.demo.gestionEquipos.domain.model.Equipo;
import com.example.demo.gestionEquipos.domain.model.Jugador;
import com.example.demo.gestionEquipos.domain.model.Voto;
import com.example.demo.gestionEquipos.infrastructure.entity.EquipoEntity;
import com.example.demo.gestionEquipos.infrastructure.entity.VotoEntity;
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
public class VotoEntityMapperImpl implements VotoEntityMapper {

    @Override
    public Voto toDomain(VotoEntity equipoEntity) {
        if ( equipoEntity == null ) {
            return null;
        }

        Voto voto = new Voto();

        voto.setJugador( equipoEntity.getJugador() );
        voto.setPartido( equipoEntity.getPartido() );
        voto.setUsuario( equipoEntity.getUsuario() );
        voto.setValoracion( equipoEntity.getValoracion() );
        voto.setGoles( equipoEntity.getGoles() );
        voto.setAsistencias( equipoEntity.getAsistencias() );

        return voto;
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
