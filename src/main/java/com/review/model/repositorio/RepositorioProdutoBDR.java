package com.review.model.repositorio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.review.model.entidade.Produto;
import com.review.model.repositorio.jpa.JpaRepositoryProduto;

@Component("repositorioProduto")
public class RepositorioProdutoBDR implements IRepositorioProduto {
	
	@Autowired
	private JpaRepositoryProduto jpaRepositoryProduto;
	
	public Produto cadastrar(Produto produto) {	
		return jpaRepositoryProduto.save(produto);
	}
	
	public Produto buscar(Produto produto){
		return jpaRepositoryProduto.findOne(produto.getId());
	}
	
	public List<Produto> listar(){
		return jpaRepositoryProduto.findAll();
	}

	public Produto atualizar(Produto produto) {
		return jpaRepositoryProduto.save(produto);
	}

	public void remover(Produto produto) {
		jpaRepositoryProduto.delete(produto);
	}
	

}