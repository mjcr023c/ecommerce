package com.between.ecommerce.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BRANDS")
public class Brands {

	@Id
	@GeneratedValue
	@Column(name="ID_BRAND")
	private Integer idBrand;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="DESCRIPTION")
	private String description;
	

	public Brands() {

	}

	public Brands(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}

	public Brands(Integer idBrand, String name, String description) {
		super();
		this.idBrand = idBrand;
		this.name = name;
		this.description = description;
	}

	public Integer getIdBrand() {
		return idBrand;
	}


	public void setIdBrand(Integer idBrand) {
		this.idBrand = idBrand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
