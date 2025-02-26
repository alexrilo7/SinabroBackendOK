package com.example.demo.auth.application.usecases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.auth.domain.model.Usuario;
import com.example.demo.auth.domain.ports.in.RegistrarUsuarioUseCase;
import com.example.demo.auth.domain.ports.out.UsuarioRepositoryPort;

@Component
public class RegistrarUsuarioUseCaseImpl implements RegistrarUsuarioUseCase{

	@Autowired
	private UsuarioRepositoryPort usuarioRepositoryPort;
	
	@Override
	public Usuario registrarUsuario(Usuario usuarioRegistro) {
		// TODO Auto-generated method stub
		if(usuarioRepositoryPort.existsByUsername(usuarioRegistro.getUsername())) {
			return null;
		}
		return usuarioRepositoryPort.save(usuarioRegistro);
	}
	

}
