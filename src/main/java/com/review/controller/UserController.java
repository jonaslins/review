package com.review.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.review.model.User;
import com.review.service.UserService;

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

	@RequestMapping(value = "/search", method = RequestMethod.GET)
	@ResponseBody
	public List<User> getTags(@RequestParam String name) {

		return simulateSearchResult(name);

	}

	private List<User> simulateSearchResult(String name) {

		List<User> result = new ArrayList<User>();
		
		List<User> data = new ArrayList<User>();
		data.add(new User("Jonas", "foo@bar"));
		data.add(new User("José", "fofo@bar"));

		// iterate a list and filter by tagName
		for (User user : data) {
			if (user.getName().toLowerCase().contains(name.toLowerCase())) {
				result.add(user);
			}
		}

		return result;
	}
}
