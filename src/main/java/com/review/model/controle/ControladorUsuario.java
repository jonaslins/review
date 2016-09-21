package com.review.model.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.review.autenticador.ISubsistemaAutenticacaoRedeSocial;
import com.review.model.cadastro.CadastroUsuario;
import com.review.model.entidade.Usuario;

@Component
public class ControladorUsuario {
	
	@Autowired
	private ISubsistemaAutenticacaoRedeSocial autenticadorRedeSocial;
	
	@Autowired
	private CadastroUsuario cadastroUsuario;

	public Usuario autenticarRedeSocial(String redeSocial) {
		
		Usuario usuario = autenticadorRedeSocial.autenticar(redeSocial);		
		if(usuario!=null){ //não houve dados retornados da autenticacao
			if(cadastroUsuario.buscar(usuario)==null){ //usuario nao está cadastrado no sitema
				cadastroUsuario.cadastrar(usuario);
			}
		}
		return usuario; 
	}

}
