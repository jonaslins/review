package com.review.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.review.model.entidade.Produto;
import com.review.model.fachada.Fachada;

@Component
public class Bootstrap {

	@Autowired
	private Fachada fachada;

	public void setup() {
		
		fachada.cadastrarProduto(new Produto("Câmera Cannon H172", "A camera fotográfica mais tecnológica do mundo"));
		fachada.cadastrarProduto(new Produto("Moto G", "Moto G1 - O Melhor"));

//		Usuario user = userService.getUserByName("Jonas");
//
//		if (user == null) {
//			user = new Usuario("Jonas", "foo@bar");
//			userService.saveUser(user);
//		}

	}

}
