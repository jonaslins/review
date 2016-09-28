package com.review.model.repositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.review.model.entidade.Review;
import com.review.model.repositorio.jpa.JpaRepositoryReview;

@Component("repositorioReview")
public class RepositorioReviewBDR implements IRepositorioReview {
	
	@Autowired
	private JpaRepositoryReview jpaRepositoryReview;

	public Review adicionar(Review review) {
		return jpaRepositoryReview.save(review);
	}

	public Review atualizar(Review review) {
		// TODO Auto-generated method stub
		return jpaRepositoryReview.save(review);
	}

	public void remover(Review review) {
		// TODO Auto-generated method stub
		jpaRepositoryReview.delete(review);
	}

	public Review buscar(Review review) {
		// TODO Auto-generated method stub
		return jpaRepositoryReview.findOne(review.getId());
	}
	

}