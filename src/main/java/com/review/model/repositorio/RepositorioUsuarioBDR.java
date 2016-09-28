package com.review.model.repositorio;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.review.model.entidade.Usuario;
import com.review.model.repositorio.jpa.JpaRepositoryUsuario;

@Component("repositorioUsuario")
public class RepositorioUsuarioBDR implements IRepositorioUsuario{
	
	@Autowired
	private JpaRepositoryUsuario jpaRepositoryUsuario;

	public Usuario buscar(Usuario usuario) {
		return jpaRepositoryUsuario.findByEmail(usuario.getEmail());
	}

	public Usuario cadastrar(Usuario usuario) {
		return jpaRepositoryUsuario.save(usuario);	
	}
	
}