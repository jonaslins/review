package com.review.autenticador;

import com.review.model.entidade.Usuario;

public interface ISubsistemaAutenticacaoRedeSocial {
	
	public Usuario autenticar(String redeSocial);
	
}
