package com.review.autenticador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.review.model.entity.Usuario;

@Component("autenticadorRedeSocial")
public class FachadaAutenticacaoRedeSocial implements ISubsistemaAutenticacaoRedeSocial{
	
	@Autowired
	private IAutenticador autenticador;
	
	@Override
	public Usuario autenticar(String redeSocial) {
		return autenticador.autenticar(redeSocial);
	}

}
