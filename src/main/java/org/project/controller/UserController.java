package org.project.controller;

import java.util.Map;

import org.project.model.User;
import org.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user") //Root request mapping -> localhost:8080/{appName}/user
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/{id}") // localhost:8080/{appName}/user/1
	public String show(@PathVariable Long id, Map<String, Object> model) {
		
		User user = userService.getUserById(id);
		
		model.put("user", user);
		
		//View that will be rendered after the setup we made above
		return "user/show";
		
	}
}
