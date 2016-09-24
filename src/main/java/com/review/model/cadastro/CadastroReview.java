package com.review.model.cadastro;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.review.model.entidade.Review;
import com.review.model.repositorio.RepositorioReviewBDR;

@Service
@Transactional
public class CadastroReview {
	
	@Autowired
	private RepositorioReviewBDR repositorioReviewBDR;

	public Review adicionar(Review review) {
		return repositorioReviewBDR.save(review);
	}

	public Review atualizar(Review review) {
		// TODO Auto-generated method stub
		return repositorioReviewBDR.save(review);
	}

	public void remover(Review review) {
		// TODO Auto-generated method stub
		repositorioReviewBDR.delete(review);
	}

	public Review buscar(Review review) {
		// TODO Auto-generated method stub
		return repositorioReviewBDR.findOne(review.getId());
	}
	
	
}
