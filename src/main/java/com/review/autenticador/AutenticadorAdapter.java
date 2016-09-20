package com.review.autenticador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.facebook.api.User;
import org.springframework.stereotype.Component;

import com.review.model.entity.Usuario;

@Component("autenticadorAdapter")
public class AutenticadorAdapter implements IAutenticador {
	
	
	@Autowired
	private FacebookAutenticator facebookAutenticator;
	
	private Usuario usuarioAutenticado;

	@Override
	public Usuario autenticar(String redeSocial) {
		if(redeSocial.equalsIgnoreCase("facebook")){
			User user = facebookAutenticator.signInWithFacebook();
			Usuario usuario = new Usuario(user.getName(), user.getEmail());
			this.usuarioAutenticado = usuario;
			return usuario;
		}		
		return null;
	}

}
