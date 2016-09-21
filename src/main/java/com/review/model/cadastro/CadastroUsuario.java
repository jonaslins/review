package com.review.model.cadastro;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.review.model.entidade.Usuario;
import com.review.model.repositorio.RepositorioUsuarioBDR;

@Component
@Transactional
public class CadastroUsuario {
	
	@Autowired
	private RepositorioUsuarioBDR userRepository;

	public Usuario buscar(Usuario usuario) {
		return userRepository.findByEmail(usuario.getEmail());
	}

	public void cadastrar(Usuario usuario) {
		userRepository.save(usuario);	
	}

}
