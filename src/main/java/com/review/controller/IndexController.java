package com.review.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.review.model.Fachada;
import com.review.model.entity.Usuario;

@Controller
public class IndexController {
	
	@Autowired
	private Fachada fachada;
	
	@Autowired
	private HttpSession session;
	
	private String message = "Hello World";

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		

		Usuario usuario  = fachada.autenticarRedeSocial("facebook");
//		
//		session.setAttribute(name, value);
//		model.put("usuario", usuario);
		/**
		 * View that will be rendered after the setup we made above
		 * In our case /welcome.jsp
		 * See that our request path is "localhost:8080/{appName}/" which will render welcome.jsp 
		 * as the page for this pattern
		*/
		return "index";
	}
	
}
