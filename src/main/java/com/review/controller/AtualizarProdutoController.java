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
import com.review.model.entidade.Usuario;
import com.review.model.fachada.Fachada;

@Controller
@RequestMapping("/produto/atualizar/")
public class AtualizarProdutoController {

	@Autowired
	private Fachada fachada;
	
	
	@RequestMapping(method=RequestMethod.POST)
	public String atualizarProduto(Model model, @ModelAttribute("produto") Produto produto) {
		
		Usuario usuarioLogado = fachada.usuarioLogado;
		
		if(usuarioLogado != null){
			if(produto.getUsuario().getId() == usuarioLogado.getId()){
				Produto produtoAtualizado = fachada.atualizarProduto(produto);
				if(produtoAtualizado!=null){
		 
					int id = (int) produtoAtualizado.getId(); 
					return "redirect:/produto/visualizar/"+id;
				}
				
				return "redirect:/produto/atualizar/"+produto.getId();
			}else{
				return "produto/erro";
			}
		}else{
			return "produto/erro";
		}
		
	}
	
	
	@RequestMapping(value = "/{produtoId}")
	public String visualizarProduto(@PathVariable("produtoId") long produtoId, Model model) {
		
		Produto produto = fachada.buscarProduto(new Produto(produtoId));
		
		if(produto!=null){
			model.addAttribute("produto", produto);
			
			return "/produto/atualizar"; 
		}
		
		return "/produto/cadastrar";
	}
	
}
