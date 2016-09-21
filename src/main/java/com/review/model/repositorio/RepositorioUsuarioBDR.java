package com.review.model.repositorio;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.review.model.entidade.Usuario;

@Transactional
public interface RepositorioUsuarioBDR extends JpaRepository<Usuario, Long> {

  /**
   * This method will find an User instance in the database by its name.
   * Note that this method is not implemented and its working code will be
   * automagically generated from its signature by Spring Data JPA.
   */
	public Usuario findByEmail(String name);

}