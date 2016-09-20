package com.review.model.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.review.model.entity.Usuario;
import com.review.model.repository.UserRepository;

@Component("userService")
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public Usuario getUserByName(String name) {
		return userRepository.findByName(name);
	}
	
	@Override
	public Usuario getUserById(long id) {
		return userRepository.findOne(id);
	}
	
	@Override
	public Usuario saveUser(Usuario user) {
		return userRepository.save(user);
	}

}
