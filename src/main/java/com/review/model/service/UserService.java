package com.review.model.service;

import com.review.model.entity.Usuario;

public interface UserService {
	
	Usuario getUserByName(String name);

	Usuario getUserById(long id);

	Usuario saveUser(Usuario user);

}
