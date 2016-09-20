package com.review.autenticador;

import com.review.model.entity.Usuario;

public interface ISubsistemaAutenticacaoRedeSocial {
	
	public Usuario autenticar(String redeSocial);
	
}
