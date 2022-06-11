package com.between.ecommerce.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCTS")
public class Products {

	@Id
	@GeneratedValue
	@Column(name="ID_PRODUCT")
	private Integer idProduct;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="DESCRIPTION")
	private String description;
	
	public Products() {

	}

	public Products(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}

	public Products(Integer idProduct, String name, String description) {
		super();
		this.idProduct = idProduct;
		this.name = name;
		this.description = description;
	}

	public Integer getIdProduct() {
		return idProduct;
	}


	public void setIdProduct(Integer idProduct) {
		this.idProduct = idProduct;
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
