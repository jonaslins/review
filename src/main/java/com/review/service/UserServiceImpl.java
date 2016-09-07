package com.review.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.review.model.User;
import com.review.repository.UserRepository;

@Component("userService")
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User getUserByName(String name) {
		return userRepository.findByName(name);
	}
	
	@Override
	public User getUserById(long id) {
		return userRepository.findOne(id);
	}
	
	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}

}
