package com.test.CRUD.entities;

import javax.persistence.*;

@Entity
public class Product {
	@Id @GeneratedValue
	private Integer id;
	private String nom;
	private String marque;
	private String madein;
	private Double prix;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(String nom, String marque, String madein, Double prix) {
		super();
		this.nom = nom;
		this.marque = marque;
		this.madein = madein;
		this.prix = prix;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getMadein() {
		return madein;
	}

	public void setMadein(String madein) {
		this.madein = madein;
	}

	public Double getPrix() {
		return prix;
	}

	public void setPrix(Double prix) {
		this.prix = prix;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
		
	
}
