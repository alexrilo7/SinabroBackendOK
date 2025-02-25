package com.example.demo.auth.domain.ports.out;

import java.util.List;
import java.util.Optional;

import com.example.demo.auth.domain.model.Usuario;

public interface UsuarioRepositoryPort {
	Usuario save(Usuario usuario);
	boolean existsByUsername(String username);
	List<Usuario> findAll();
	Optional<Usuario> findByUsername(String username);
}
