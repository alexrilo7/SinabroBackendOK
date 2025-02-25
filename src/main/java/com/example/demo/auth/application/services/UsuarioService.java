package com.example.demo.auth.application.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.auth.domain.model.Usuario;
import com.example.demo.auth.domain.ports.in.LoginUsuarioUseCase;
import com.example.demo.auth.domain.ports.in.RegistrarUsuarioUseCase;

@Service
public class UsuarioService implements RegistrarUsuarioUseCase, LoginUsuarioUseCase {

	@Autowired
	private RegistrarUsuarioUseCase registrarUsuarioUseCase;

	@Autowired
	private LoginUsuarioUseCase loginUsuarioUseCase;

	@Override
	public boolean loginUsuario(Usuario usuarioLogin) {
		// TODO Auto-generated method stub
		return loginUsuarioUseCase.loginUsuario(usuarioLogin);
	}

	@Override
	public Usuario registrarUsuario(Usuario usuarioRegistro) {
		// TODO Auto-generated method stub
		return registrarUsuarioUseCase.registrarUsuario(usuarioRegistro);
	}

}
