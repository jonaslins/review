package com.review.autenticador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.facebook.api.User;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.WebRequest;

import com.review.model.entidade.Usuario;

@Component("autenticadorAdapter")
public class AutenticadorFacebookAdapter implements IAutenticador {

	@Autowired
	private AutenticadorFacebook facebookAutenticator;

	@Override
	public Usuario autenticar(WebRequest request, String redeSocial) {
		User user = facebookAutenticator.signInWithFacebook(request);
		Usuario usuario = new Usuario(user.getName(), user.getEmail());
		return usuario;
	}

}
