package com.review.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.review.model.entidade.Usuario;
import com.review.model.fachada.Fachada;

@Controller
@SessionAttributes("sessionUser")
public class AuthenticationController {
	
	@Autowired
	private Fachada fachada;
	
	@Autowired
	private HttpSession session;
	
	
	@RequestMapping("/login")
	public String login(Map<String, Object> model) {
		Usuario usuario  = fachada.autenticarRedeSocial("facebook");                 
		if(usuario!=null){
			//Usuario cancelou ou nao autenticou/aceitou
		}		
		session.setAttribute("sessionUser", usuario);
		model.put("usuario", usuario);
		return "redirect:/";
	}
	
	@RequestMapping("/logout")
	public String logout(Map<String, Object> model) {
		//TODO
		session.invalidate();
		return "redirect:/";
	}

}
