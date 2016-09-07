package org.project.service;

import org.project.model.User;

public interface UserService {
	
	User getUserByName(String name);

	User getUserById(long id);

	User saveUser(User user);

}
