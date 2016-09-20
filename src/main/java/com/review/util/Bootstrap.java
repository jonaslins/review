package com.review.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.review.model.Fachada;
import com.review.model.entity.Produto;
import com.review.model.entity.Usuario;
import com.review.model.service.UserService;

@Component
public class Bootstrap {

	@Autowired
	private Fachada fachada;

	public void setup() {
		
		fachada.criarProduto(new Produto("Câmera Cannon H172", "A camera fotográfica mais tecnológica do mundo"));
		fachada.criarProduto(new Produto("Moto G", "Moto G1 - O Melhor"));

//		Usuario user = userService.getUserByName("Jonas");
//
//		if (user == null) {
//			user = new Usuario("Jonas", "foo@bar");
//			userService.saveUser(user);
//		}

	}

}
