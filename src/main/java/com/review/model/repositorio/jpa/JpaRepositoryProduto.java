package com.review.model.repositorio.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.review.model.entidade.Produto;

@Component("jpaRepositoryProduto")
public interface JpaRepositoryProduto extends JpaRepository<Produto, Long>{
	

	  /**
	   * This method will find an User instance in the database by its name.
	   * Note that this method is not implemented and its working code will be
	   * automagically generated from its signature by Spring Data JPA.
	   */

}
