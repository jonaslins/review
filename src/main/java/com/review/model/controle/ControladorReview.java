package com.review.model.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.review.model.cadastro.CadastroProduto;
import com.review.model.cadastro.CadastroReview;
import com.review.model.cadastro.CadastroUsuario;
import com.review.model.entidade.Review;

@Component
public class ControladorReview {

	@Autowired
	private CadastroReview cadastroReview;
	@Autowired
	private CadastroProduto cadastroProduto;
	@Autowired
	private CadastroUsuario cadastroUsuario;
	
	public Review adicionar(Review review) {
		return cadastroReview.adicionar(review);
	}

	public Review atualizar(Review review) {
		return cadastroReview.atualizar(review);
	}

	public void remover(Review review) {
		// TODO Auto-generated method stub
		cadastroReview.remover(review);
	}

	public Review buscar(Review review) {
		// TODO Auto-generated method stub
		return cadastroReview.buscar(review);
	}

}
