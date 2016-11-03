package com.review.model.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.WebRequest;

import com.review.autenticador.ISubsistemaAutenticacaoRedeSocial;
import com.review.model.cadastro.CadastroUsuario;
import com.review.model.entidade.Produto;
import com.review.model.entidade.Usuario;

@Component
public class ControladorUsuario {
	
	@Autowired
	private ISubsistemaAutenticacaoRedeSocial autenticadorRedeSocial;
	
	@Autowired
	private CadastroUsuario cadastroUsuario;

	public Usuario autenticarRedeSocial(WebRequest request, String redeSocial) {
		
		Usuario usuario = autenticadorRedeSocial.autenticar(request, redeSocial);		
		if(usuario!=null){ //não houve dados retornados da autenticacao
			if(cadastroUsuario.buscar(usuario)==null){ //usuario nao está cadastrado no sitema
				cadastroUsuario.cadastrar(usuario);
			}
		}
		return usuario; 
	}
	
	public Usuario cadastrar(Usuario usuario) {
		return cadastroUsuario.cadastrar(usuario);		
	}

}
