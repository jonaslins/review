package com.review.model.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Review {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="review_id")
	private long id;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="usuario_id")
	private Usuario usuario;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="produto_id")
	private Produto produto;
	
	@Column
	private double nota;
	
	@Column
	private String conteudo;
	
	public Review(){
	}

	public Review(Usuario usuario, Produto produto) {
		super();
		this.usuario = usuario;
		this.produto = produto;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}

}
