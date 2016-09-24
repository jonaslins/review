package com.review.model.fachada;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.WebRequest;

import com.review.model.controle.ControladorProduto;
import com.review.model.controle.ControladorReview;
import com.review.model.controle.ControladorUsuario;
import com.review.model.entidade.Produto;
import com.review.model.entidade.Review;
import com.review.model.entidade.Usuario;

@Component
@Scope(scopeName = "singleton")
public class Fachada {
	
	@Autowired
	private ControladorUsuario controladorUsuario;
	
	@Autowired
	private ControladorProduto controladorProduto;
	
	@Autowired
	private ControladorReview controladorReview;
	
	public Produto cadastrarProduto(Produto produto){
		return controladorProduto.cadastrar(produto);
	}
	
	public Produto buscarProduto(Produto produto){
		return controladorProduto.buscar(produto);
	}
	
	public List<Produto> listarProdutos(){
		return controladorProduto.listar();
	}
	
	public Produto atualizarProduto(Produto produto){
		return controladorProduto.atualizar(produto);
	}
	
	public void removerProduto(Produto produto){
		controladorProduto.remover(produto);
	}
	
	public Review adicionarReview(Review review){
		return controladorReview.adicionar(review);
	}
	
	public Review atualizarReview(Review review){
		return controladorReview.atualizar(review);
	}
	
	public void removerReview(Review review){
		controladorReview.remover(review);
	}
	
	public Review buscarReview(Review review){
		return controladorReview.buscar(review);
	}
	
	public Usuario autenticarRedeSocial(WebRequest request, String redeSocial){
		return controladorUsuario.autenticarRedeSocial(request, redeSocial);
	}
	
}
