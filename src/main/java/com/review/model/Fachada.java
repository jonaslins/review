package com.review.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.review.model.controller.ControladorProduto;
import com.review.model.controller.ControladorReview;
import com.review.model.controller.ControladorUsuario;
import com.review.model.entity.Produto;
import com.review.model.entity.Review;
import com.review.model.entity.Usuario;

@Component
@Scope(scopeName = "singleton")
public class Fachada {
	
	@Autowired
	private ControladorUsuario controladorUsuario;
	
	@Autowired
	private ControladorProduto controladorProduto;
	
	@Autowired
	private ControladorReview controladorReview;
	
	public Produto criarProduto(Produto produto){
		return controladorProduto.criarProduto(produto);
	}
	
	public Produto visualizarProduto(Produto produto){
		return controladorProduto.visualizarProduto(produto);
	}
	
	public List<Produto> listarProdutos(){
		return controladorProduto.listarProdutos();
	}
	
	public Review adicionarReview(Review review){
		return controladorReview.adicionarReview(review);
	}
	
	public Usuario autenticarRedeSocial(String redeSocial){
		return controladorUsuario.autenticarRedeSocial(redeSocial);
	}
	
}
