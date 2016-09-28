package com.review.model.cadastro;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.review.model.entidade.Produto;
import com.review.model.repositorio.IRepositorioProduto;

@Service
@Transactional
public class CadastroProduto {

	@Autowired
	private IRepositorioProduto repositorioProduto;
	
	public Produto cadastrar(Produto produto) {	
		return repositorioProduto.cadastrar(produto);
	}
	
	public Produto buscar(Produto produto){
		return repositorioProduto.buscar(produto);
	}
	
	public List<Produto> listar(){
		return repositorioProduto.listar();
	}

	public Produto atualizar(Produto produto) {
		return repositorioProduto.atualizar(produto);
	}

	public void remover(Produto produto) {
		repositorioProduto.remover(produto);
	}
	
}
