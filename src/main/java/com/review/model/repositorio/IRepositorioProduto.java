package com.review.model.repositorio;

import java.util.List;

import com.review.model.entidade.Produto;

public interface IRepositorioProduto {
	
	public Produto cadastrar(Produto produto);
	
	public Produto buscar(Produto produto);
	
	public List<Produto> listar();

	public Produto atualizar(Produto produto);

	public void remover(Produto produto);

}
