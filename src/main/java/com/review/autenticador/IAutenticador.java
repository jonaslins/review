package com.review.autenticador;

import org.springframework.web.context.request.WebRequest;

import com.review.model.entidade.Usuario;

public interface IAutenticador {

	public Usuario autenticar(WebRequest request, String redeSocial);

}
