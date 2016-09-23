package com.review.autenticador;

import org.springframework.web.context.request.WebRequest;

import com.review.model.entidade.Usuario;

public interface ISubsistemaAutenticacaoRedeSocial {
	
	public Usuario autenticar(WebRequest request, String redeSocial);
	
}
