package com.example.demo.auth.application.usecases;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.auth.domain.model.Usuario;
import com.example.demo.auth.domain.ports.in.LoginUsuarioUseCase;
import com.example.demo.auth.domain.ports.out.UsuarioRepositoryPort;

@Component
public class LoginUsuarioUseCaseImpl implements LoginUsuarioUseCase {

	@Autowired
	private UsuarioRepositoryPort usuarioRepositoryPort;


	@Override
	public boolean loginUsuario(Usuario usuarioLogin) {
		// TODO Auto-generated method stub
		Optional<Usuario> usuarioEntity = usuarioRepositoryPort.findByUsername(usuarioLogin.getUserName());
		if (usuarioEntity.isEmpty()) {
			return false;
		}
		return usuarioEntity.isPresent() && usuarioEntity.get().getPassword().equals(usuarioLogin.getPassword());
	}

}
