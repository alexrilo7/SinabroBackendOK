package com.example.demo.gestionEquipos.infrastructure.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

import com.example.demo.gestionEquipos.domain.model.Equipo;

import lombok.Getter;
import lombok.Setter;

@Document(collection = "partidos") // Nombre de la colección en MongoDB
@Getter
@Setter
public class PartidoEntity {
	
	@Id
	private String id;
	private Equipo equipoLocal;
	private Equipo equipoVisitante;
	@Field(targetType = FieldType.DATE_TIME)
	private Date fecha;
	private String tipo;

}