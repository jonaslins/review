package com.review.model.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.review.autenticador.ISubsistemaAutenticacaoRedeSocial;
import com.review.model.entity.Usuario;

@Component
public class ControladorUsuario {
	
	@Autowired
	private ISubsistemaAutenticacaoRedeSocial autenticadorRedeSocial;

	public Usuario autenticarRedeSocial(String redeSocial) {
		return autenticadorRedeSocial.autenticar(redeSocial);
	}

}
