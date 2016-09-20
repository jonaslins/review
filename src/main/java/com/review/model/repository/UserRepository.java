package com.review.model.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.review.model.entity.Usuario;

@Transactional
public interface UserRepository extends CrudRepository<Usuario, Long> {

	  /**
	   * This method will find an User instance in the database by its name.
	   * Note that this method is not implemented and its working code will be
	   * automagically generated from its signature by Spring Data JPA.
	   */
	  public Usuario findByName(String name);
}