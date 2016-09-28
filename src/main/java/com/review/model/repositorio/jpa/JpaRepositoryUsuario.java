package com.review.model.repositorio.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.review.model.entidade.Usuario;

@Component("jpaRepositoryUsuario")
public interface JpaRepositoryUsuario extends JpaRepository<Usuario, Long> {

	  /**
	   * This method will find an User instance in the database by its name.
	   * Note that this method is not implemented and its working code will be
	   * automagically generated from its signature by Spring Data JPA.
	   */
		public Usuario findByEmail(String name);

}