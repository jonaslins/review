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

	public Produto buscar(Produto produto) {
		return cadastroProduto.buscar(produto);
	}

	public List<Produto> listar() {
		return cadastroProduto.listar();
	}

	public Produto atualizar(Produto produto) {
		return cadastroProduto.atualizar(produto);
	}

	public void remover(Produto produto) {
		cadastroProduto.remover(produto);
	}

}
