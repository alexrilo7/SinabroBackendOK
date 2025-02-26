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
    date = "2025-02-26T16:02:15+0100",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.39.0.v20240820-0604, environment: Java 21.0.4 (Eclipse Adoptium)"
)
@Component
public class VotoEntityMapperImpl implements VotoEntityMapper {

    @Override
    public Voto toDomain(VotoEntity equipoEntity) {
        if ( equipoEntity == null ) {
            return null;
        }

        Voto voto = new Voto();

        voto.setAsistencias( equipoEntity.getAsistencias() );
        voto.setGoles( equipoEntity.getGoles() );
        voto.setJugador( equipoEntity.getJugador() );
        voto.setPartido( equipoEntity.getPartido() );
        voto.setUsuario( equipoEntity.getUsuario() );
        voto.setValoracion( equipoEntity.getValoracion() );

        return voto;
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
