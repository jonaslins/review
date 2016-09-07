package com.review.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.review.model.User;

@Transactional
public interface UserRepository extends CrudRepository<User, Long> {

	  /**
	   * This method will find an User instance in the database by its name.
	   * Note that this method is not implemented and its working code will be
	   * automagically generated from its signature by Spring Data JPA.
	   */
	  public User findByName(String name);
}