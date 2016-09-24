package com.review.model.entidade;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="produto_id")
	private long id;
	
	@Column
	private String nome;
	
	@Column
	private String descricao;
	
	@OneToMany(targetEntity=Review.class, mappedBy="produto", fetch=FetchType.LAZY)
	private List<Review> reviewList;
	
	public Produto() {
		// TODO Auto-generated constructor stub
	}
	
	public Produto(long id){
		super();
		this.id = id;
	}

	public Produto(String nome, String descricao) {
		super();
		this.nome = nome;
		this.descricao = descricao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public List<Review> getReviewList() {
		return reviewList;
	}
	
	public void setReviewList(List<Review> reviewList) {
		this.reviewList = reviewList;
	}
	
}
