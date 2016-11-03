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
	
	@RequestMapping(value = "/{produtoId}", method = RequestMethod.POST)
	public String removerProduto(@PathVariable("produtoId") int produtoId, Model model) {
		
		Usuario usuarioLogado = fachada.usuarioLogado;
		
		if(usuarioLogado != null){
			Produto produto = fachada.buscarProduto(new Produto(produtoId));
			
			if(produto.getUsuario().getId() == usuarioLogado.getId()){
				fachada.removerProduto(produto);
				
				return "redirect:/produto/listar";
			}
			
			return "produto/erro";
		}
		
		return "produto/erro";
		
	}
}
