package com.review.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.review.model.entidade.Produto;
import com.review.model.fachada.Fachada;

@Controller
@RequestMapping("/produto/listar")
public class ListarProdutosController {
	
	@Autowired
	private Fachada fachada;
	
	@RequestMapping(method=RequestMethod.GET)
	public String listarProdutos(Model model) {
		
		List<Produto> produtos = fachada.listarProdutos();
		
		if(produtos.size() == 0){
			return "redirect:/"; 
		}

		model.addAttribute("produtos", produtos);
		return "produto/listar";
	}	
}
