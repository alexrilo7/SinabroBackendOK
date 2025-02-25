package com.example.demo.auth.infrastructure.adapters.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.auth.application.mappers.UsuarioEntityMapper;
import com.example.demo.auth.domain.model.Usuario;
import com.example.demo.auth.domain.ports.out.UsuarioRepositoryPort;
import com.example.demo.auth.infrastructure.entity.UsuarioEntity;

import com.example.demo.auth.infrastructure.repository.MongoDBRepository;

@Component
public class MongoDBUsuarioRepositoryAdapter implements UsuarioRepositoryPort {

	@Autowired
	private MongoDBRepository mongoDBRepository;
	
	@Autowired
	private UsuarioEntityMapper usuarioMapper;

	@Override
	public Usuario save(Usuario usuario) {
		UsuarioEntity usuarioEntity = usuarioMapper.toEntity(usuario);
		if(mongoDBRepository.findById(usuario.getUserName()).isPresent()) {
			return null;
		}
		return usuarioMapper.toDomain(mongoDBRepository.save(usuarioEntity));
	}

	@Override
	public boolean existsByUsername(String username) {
		return findByUsername(username).isPresent();
	}

	@Override
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		List<UsuarioEntity> usuariosBDD = mongoDBRepository.findAll();
		List<Usuario> usuariosDomain = usuariosBDD.stream().map(usuario -> usuarioMapper.toDomain(usuario)).toList(); 
		return usuariosDomain;
	}

	@Override
	public Optional<Usuario> findByUsername(String username) {
		// TODO Auto-generated method stub
		Optional<UsuarioEntity> usuarioLogin = mongoDBRepository.findById(username);
		if(usuarioLogin.isPresent()) {
			return Optional.of(usuarioMapper.toDomain(usuarioLogin.get()));	
		} 
		
		return Optional.empty();
		
	}


	
}
