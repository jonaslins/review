package com.review.autenticador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.review.model.entity.Usuario;

@Component("autenticador")
public class AutenticadorImpl implements IAutenticador{
	
	@Autowired
	AutenticadorAdapter autenticadorAdapter;
	
	@Override
	public Usuario autenticar(String redeSocial) {
		if(redeSocial==null){
			//Aqui poderia ser o sistema de autenticação default, por exmeplo
			return new Usuario("Default User", "defaultUser@default.com");
		}		
		return autenticadorAdapter.autenticar(redeSocial);
	}

}
