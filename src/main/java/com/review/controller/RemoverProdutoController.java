package com.review.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.review.model.entidade.Produto;
import com.review.model.entidade.Usuario;
import com.review.model.fachada.Fachada;

@Controller
@RequestMapping("/produto/remover")
public class RemoverProdutoController {
	
	@Autowired
	private Fachada fachada;
	
	@RequestMapping(value = "/{produto}", method = RequestMethod.POST)
	public String removerProduto(@PathVariable("produto") Produto produto, Model model) {
		
		Usuario usuarioLogado = fachada.usuarioLogado;
		
		if(produto.getUsuario().getId() == usuarioLogado.getId()){
			fachada.removerProduto(new Produto(produto.getId()));
			
			return "redirect:/produto/listar";
		}
		
		return "redirect:/produto/erro";
	}
}
