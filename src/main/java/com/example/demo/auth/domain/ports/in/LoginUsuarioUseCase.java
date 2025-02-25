package com.example.demo.auth.domain.ports.in;

import com.example.demo.auth.domain.model.Usuario;

public interface LoginUsuarioUseCase {
	public boolean loginUsuario(Usuario loginUsuario);
}
