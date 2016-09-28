package com.review.model.repositorio;

import com.review.model.entidade.Usuario;

public interface IRepositorioUsuario {
	
	public Usuario buscar(Usuario usuario);

	public Usuario cadastrar(Usuario usuario);

}
