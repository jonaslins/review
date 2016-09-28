package com.review.model.repositorio;

import com.review.model.entidade.Review;

public interface IRepositorioReview {
	
	public Review adicionar(Review review);

	public Review atualizar(Review review);

	public void remover(Review review);

	public Review buscar(Review review);

}
