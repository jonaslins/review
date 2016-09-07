package org.project.util;

import org.project.model.User;
import org.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
