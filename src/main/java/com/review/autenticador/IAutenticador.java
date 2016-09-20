package com.review.autenticador;

import com.review.model.entity.Usuario;

public interface IAutenticador {

	public Usuario autenticar(String redeSocial);

}
