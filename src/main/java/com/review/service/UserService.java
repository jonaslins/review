package com.review.service;

import com.review.model.User;

public interface UserService {
	
	User getUserByName(String name);

	User getUserById(long id);

	User saveUser(User user);

}
