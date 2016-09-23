package com.review.autenticador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.WebRequest;

import com.review.model.entidade.Usuario;

@Component("autenticador")
public class AutenticadorImpl implements IAutenticador{
	
	@Autowired
	AutenticadorAdapter autenticadorAdapter;
	
	@Override
	public Usuario autenticar(WebRequest request, String redeSocial) {
		
		
		if(redeSocial==null){
			//Aqui poderia ser o sistema de autenticação default, por exmeplo
			return new Usuario("Default User", "defaultUser@default.com");
		}		
		return autenticadorAdapter.autenticar(request, redeSocial);
	}

}
