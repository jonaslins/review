package com.review.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.review.model.User;
import com.review.service.UserService;

@Component
public class Bootstrap {

	@Autowired
	private UserService userService;

	public void setup() {

		User user = userService.getUserByName("Jonas");

		if (user == null) {
			user = new User("Jonas", "foo@bar");
			userService.saveUser(user);
		}

	}

}
