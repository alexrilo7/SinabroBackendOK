package com.example.demo.auth.infrastructure.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document(collection = "usuarios") // Nombre de la colección en MongoDB
@Getter
@Setter
public class UsuarioEntity {

    @Id
    private String userName;
    private String password;

}