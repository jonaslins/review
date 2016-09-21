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
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="usuario_id")
	private long id;	

	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private String email;
	
	@OneToMany(targetEntity=Review.class, mappedBy="usuario", fetch=FetchType.LAZY)
	private List<Review> reviewList;

	public Usuario() {
	}

	public Usuario(long id) {
		this.id = id;
	}

	public Usuario(String name, String email) {
		this.nome = name;
		this.email = email;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return nome;
	}

	public void setNome(String name) {
		this.nome = name;
	}
	
}
