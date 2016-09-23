package com.review.model.cadastro;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.review.model.entidade.Produto;
import com.review.model.repositorio.RepositorioProdutoBDR;

@Service
@Transactional
public class CadastroProduto {

	@Autowired
	private RepositorioProdutoBDR repositorioProdutoBDR;
	
	public Produto cadastrar(Produto produto) {	
		return repositorioProdutoBDR.save(produto);
	}
	
	public Produto buscar(Produto produto){
		return repositorioProdutoBDR.findOne(produto.getId());
	}
	
	public List<Produto> listar(){
		return repositorioProdutoBDR.findAll();
	}
	
}
