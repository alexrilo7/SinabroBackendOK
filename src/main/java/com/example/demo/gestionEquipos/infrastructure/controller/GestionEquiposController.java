package com.example.demo.gestionEquipos.infrastructure.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.gestionEquipos.application.services.EquipoService;
import com.example.demo.gestionEquipos.domain.model.Equipo;
import com.example.demo.gestionEquipos.domain.model.Jugador;
import com.example.demo.gestionEquipos.domain.model.Partido;
import com.example.demo.gestionEquipos.domain.model.Voto;
import com.example.demo.gestionEquipos.domain.ports.out.PartidoRepositoryPort;

@RestController
@RequestMapping("/gestionEquipos")
public class GestionEquiposController {

	@Autowired
	private EquipoService equipoService;
	
	@Autowired
	private PartidoRepositoryPort mongoDBpartido;

	@GetMapping("/recuperarEquipos")
	public ResponseEntity<List<Equipo>> recuperarEquipos() {
		try {
			List<Equipo> equipos = equipoService.recuperarEquipos();
			return ResponseEntity.ok(equipos);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		}

	}

	@GetMapping("/recuperarPartidos/{equipoId}")
	public ResponseEntity<List<Partido>> obtenerPartidosPorEquipo(@PathVariable String equipoId) {
		List<Partido> partidos = equipoService.generarPartidos(equipoId);
		if (partidos.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(partidos);
	}

	@GetMapping("/crearPartidos")
	public void crearPartidos() {
		List<Equipo> equipos = equipoService.recuperarEquipos();
		for (int j = 1; j < equipos.size(); j++) { // Partido de ida Partido Partido
			Partido partidoIda = new Partido();
			partidoIda.setEquipoLocal(equipos.get(0));
			partidoIda.setEquipoVisitante(equipos.get(j));
			partidoIda.setTipo("ida");
			partidoIda.setFecha(new Date());
			mongoDBpartido.save(partidoIda);

			Partido partidoVuelta = new Partido();
			partidoVuelta.setEquipoLocal(equipos.get(j));
			partidoVuelta.setEquipoVisitante(equipos.get(0));
			partidoVuelta.setTipo("vuelta");
			partidoVuelta.setFecha(new Date());
			mongoDBpartido.save(partidoVuelta);
		}

	}
	
	@GetMapping("/recuperarJugadores")
	public ResponseEntity<List<Jugador>> recuperarJugadores() {
		try {
			List<Jugador> jugadores = equipoService.recuperarJugadores();
			return ResponseEntity.ok(jugadores);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);

		}
	}
	
	@PutMapping("/valorarJugador")
	public ResponseEntity<Jugador> votarJugador(@RequestBody Voto voto) {
		try {
			Jugador votoActualizado = equipoService.votarJugador(voto);
			if(null == votoActualizado) {
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
			}
			return ResponseEntity.ok(votoActualizado);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		}
	}

}
