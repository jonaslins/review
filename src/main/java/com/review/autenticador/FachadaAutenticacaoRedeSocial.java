package com.review.autenticador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.WebRequest;

import com.review.model.entidade.Usuario;

@Component("autenticadorRedeSocial")
public class FachadaAutenticacaoRedeSocial implements ISubsistemaAutenticacaoRedeSocial{
	
	@Autowired
	private IAutenticador autenticador;
	
	@Override
	public Usuario autenticar(WebRequest request, String redeSocial) {
		return autenticador.autenticar(request, redeSocial);
	}

}
