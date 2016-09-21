package com.review.model.controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.review.model.cadastro.CadastroProduto;
import com.review.model.entidade.Produto;

@Component
public class ControladorProduto {
	
	@Autowired
	private CadastroProduto cadastroProduto;

	public Produto cadastrar(Produto produto) {
		return cadastroProduto.cadastrar(produto);		
	}

	public Produto visualizar(Produto produto) {
		return null;
	}

	public List<Produto> listar() {
		// TODO Auto-generated method stub
		return null;
	}

}
