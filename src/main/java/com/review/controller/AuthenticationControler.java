package com.review.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.review.model.Fachada;
import com.review.model.entity.Usuario;

@Controller
public class AuthenticationControler {
	
	@Autowired
	private Fachada fachada;
	
	@Autowired
	private HttpSession session;
	
	
	@RequestMapping("/login")
	public String login(Map<String, Object> model) {
		Usuario usuario  = fachada.autenticarRedeSocial("facebook");                 
		if(usuario!=null){
			System.out.println("yey");
		}		
		session.setAttribute("sessionUser", usuario);
		model.put("usuario", usuario);
		return "redirect:/";
	}
	
	@RequestMapping("/logout")
	public String logout(Map<String, Object> model) {
		return "redirect:/";
	}

}
