package com.example.demo.auth.infrastructure.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.auth.application.services.UsuarioService;
import com.example.demo.auth.domain.model.Usuario;

@RestController
@RequestMapping("/auth")
public class AuthController {

	@Autowired
	private UsuarioService usuarioService;
	

	@PostMapping("/login")
	public ResponseEntity<Map<String, String>> loginUsuario(@RequestBody Usuario usuarioDTO) {
		boolean logueado = usuarioService.loginUsuario(usuarioDTO);
		Map<String, String> response = new HashMap<>();

		if (logueado) {
			response.put("access_token", "Login exitoso");
		} else {
			response.put("error", "usuario o password incorrectos");
		}
		return logueado ? new ResponseEntity<>(response, HttpStatus.OK)
				: new ResponseEntity<>(response, HttpStatus.UNAUTHORIZED);

	}

	@PostMapping("/registro")
	public ResponseEntity<Map<String, String>> registroUsuario(@RequestBody Usuario usuarioDTO) {
		Usuario usuarioRegistrado = usuarioService.registrarUsuario(usuarioDTO);
		Map<String, String> response = new HashMap<>();
		if (null != usuarioRegistrado) {
			response.put("message", "Usuario Registrado Correctamente");
		} else {
			response.put("error", "Error: Usuario ya existente");
		}

		return null != usuarioRegistrado ? new ResponseEntity<>(response, HttpStatus.CREATED)
				: new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping("/")
	public String hola() {
		return "Hola";
	}

}
