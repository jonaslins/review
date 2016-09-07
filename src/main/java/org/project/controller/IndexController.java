package org.project.controller;

import java.util.Date;
import java.util.Map;

import org.project.model.User;
import org.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@Autowired
	private UserService userService;
	
	private String message = "Hello World";

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		
		User user = userService.getUserByName("Jonas");
		
		model.put("time", new Date());
		model.put("message", this.message);		
		model.put("user", user);
		
		/**
		 * View that will be rendered after the setup we made above
		 * In our case /welcome.jsp
		 * See that our request path is "localhost:8080/{appName}/" which will render welcome.jsp 
		 * as the page for this pattern
		*/
		return "welcome";
	}

	@RequestMapping("/foo")
	public void foo(Map<String, Object> model) {
		
		model.put("foo", "This is a test sample");
		
	}

}
