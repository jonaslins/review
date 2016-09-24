package com.review.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.review.model.entidade.Produto;
import com.review.model.fachada.Fachada;

@Controller
@RequestMapping("/produto/visualizar")
public class VisualizarProdutoController {
	
	@Autowired
	private Fachada fachada;
	
	@RequestMapping(value = "/{produtoId}")
	public String visualizarProduto(@PathVariable("produtoId") long produtoId, Model model) {
		
		Produto produto = fachada.buscarProduto(new Produto(produtoId));
		if(produto!=null){
			model.addAttribute("produto", produto);
			
			return "/produto/visualizar"; 
		}

		
		return "/produto/cadastrar";
	}
	
}
