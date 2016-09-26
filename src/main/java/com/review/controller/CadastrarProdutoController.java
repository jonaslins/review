package com.review.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.review.model.entidade.Produto;
import com.review.model.fachada.Fachada;

@Controller
@RequestMapping("/produto/cadastrar")
public class CadastrarProdutoController {
	
	@Autowired
	private Fachada fachada;
	
	@RequestMapping(method=RequestMethod.POST)
	public String cadastrarProduto(Model model, @ModelAttribute("produto") Produto produto) {
		
		Produto produtoCadastrado = fachada.cadastrarProduto(produto);
		
		if(produtoCadastrado!=null){
			int id = (int) produtoCadastrado.getId(); 
			return "redirect:/produto/visualizar/"+id; 
		}

		return "redirect:/produto/cadastrar";
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView index(){
		return new ModelAndView("produto/cadastrar", "produto",  new Produto());
	}
	
}
