package com.review.autenticador;

import com.review.model.entidade.Usuario;

public interface IAutenticador {

	public Usuario autenticar(String redeSocial);

}
