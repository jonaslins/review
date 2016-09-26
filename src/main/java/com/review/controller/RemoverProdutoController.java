package com.review.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.review.model.entidade.Produto;
import com.review.model.fachada.Fachada;

@Controller
@RequestMapping("/produto/remover")
public class RemoverProdutoController {
	
	@Autowired
	private Fachada fachada;
	
	@RequestMapping(value = "/{produtoId}", method = RequestMethod.POST)
	public String removerProduto(@PathVariable("produtoId") long produtoId, Model model) {
		
		fachada.removerProduto(new Produto(produtoId));

		return "redirect:/produto/listar";
	}
	
}
