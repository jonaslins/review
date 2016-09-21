package com.review.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.review.model.cadastro.CadastroUsuario;
import com.review.model.entidade.Usuario;

@Controller
@RequestMapping("/user") //Root request mapping -> localhost:8080/{appName}/user
public class UserController {

	@Autowired
	private CadastroUsuario userService;
	
	@Autowired
	private HttpSession session;

	@RequestMapping("/{id}") // localhost:8080/{appName}/user/1
	public String show() {
		
		System.out.println(session.getAttribute("user"));

		return "iodnasionda";

	}

}
