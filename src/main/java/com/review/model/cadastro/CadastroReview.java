package com.review.model.cadastro;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.review.model.entidade.Review;
import com.review.model.repositorio.IRepositorioReview;

@Service
@Transactional
public class CadastroReview {
	
	@Autowired
	private IRepositorioReview repositorioReview;

	public Review adicionar(Review review) {
		return repositorioReview.adicionar(review);
	}

	public Review atualizar(Review review) {
		// TODO Auto-generated method stub
		return repositorioReview.atualizar(review);
	}

	public void remover(Review review) {
		// TODO Auto-generated method stub
		repositorioReview.remover(review);
	}

	public Review buscar(Review review) {
		// TODO Auto-generated method stub
		return repositorioReview.buscar(review);
	}
	
	
}
