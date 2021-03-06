package com.review.controller;

import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;

import com.review.model.entidade.Usuario;
import com.review.model.fachada.Fachada;

@Controller
public class AutenticadorController {
	
	@Autowired
	private Fachada fachada;

	@RequestMapping("/signup")
	public String login(Map<String, Object> model,  WebRequest request) {
//		OLD without security authentication
//		if (connectionRepository.findPrimaryConnection(Facebook.class) == null) {
//            return "redirect:/connect/facebook";
//        }
		
		Usuario currentUser = fachada.autenticarRedeSocial(request, "facebook");                 

		fachada.usuarioLogado = currentUser;
		
		return "redirect:/";
	}
	
	@RequestMapping(value = "/signin", params = "logout")
	public String logout(Model model, HttpServletRequest request) throws ServletException {
		fachada.usuarioLogado = null;
		return "redirect:/";
	}

}
