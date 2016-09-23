package com.review.controller;

import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.UserProfile;
import org.springframework.social.connect.web.ProviderSignInUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.context.request.WebRequest;

import com.review.model.entidade.Usuario;
import com.review.model.fachada.Fachada;
import com.review.util.UserDetailsImpl;

@Controller
public class AuthenticationController {
	
	@Autowired
	private Fachada fachada;
	
	@Autowired
	private HttpSession session;
	
	@Autowired
	private ProviderSignInUtils providerSignInUtils;
	
	
	@RequestMapping("/signup")
	public String login(Map<String, Object> model,  WebRequest request) {
		//OLD without security authentication
//		Usuario usuario  = fachada.autenticarRedeSocial("facebook");                 
//		if(usuario!=null){
//			//Usuario cancelou ou nao autenticou/aceitou
//		}
//		System.out.println(usuario.getEmail());
		
		Connection<?> connection = providerSignInUtils.getConnectionFromSession(request);
        UserProfile profile = connection.fetchUserProfile();
        
        Usuario usuario = new Usuario(profile.getName(), profile.getEmail());
        UserDetailsImpl userDetails = new UserDetailsImpl(usuario);
        
        Authentication authentication = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
        SecurityContextHolder.getContext().setAuthentication(authentication);
        
        providerSignInUtils.doPostSignUp(usuario.getEmail(), request);
        
		return "redirect:/";
	}
	
	@RequestMapping(value = "/signin", params = "logout")
	public String logout(Map<String, Object> model, HttpServletRequest request) throws ServletException {
		return "redirect:/";
	}

}
