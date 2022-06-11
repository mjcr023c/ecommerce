package com.between.ecommerce.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "PRICES")
public class Prices {
	
	/**
	 * PRICE_LIST: Identificador de la tarifa de precios aplicable.
	 */
	@Id
	@GeneratedValue
	@Column(name="PRICE_LIST")
	private Integer priceList;
	
	/**
	 * BRAND_ID: foreign key de la cadena del grupo (1 = ZARA).
	 */
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "BRAND_ID", referencedColumnName="ID_BRAND", nullable = false)
	private Brands brand;
	
	
	/**
	 * START_DATE: rango de fechas en el que aplica el precio tarifa indicado.
	 */
	@Column(name="START_DATE")
	@JsonFormat(pattern="yyyy-MM-dd-HH.mm.ss")
	private LocalDateTime startDate;
	
	/**
	 * END_DATE: rango de fechas en el que aplica el precio tarifa indicado.
	 */
	@Column(name="END_DATE")
	@JsonFormat(pattern="yyyy-MM-dd-HH.mm.ss")
	private LocalDateTime endDate;
	
	/**
	 * PRODUCT_ID: Identificador código de producto.
	 */
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "PRODUCT_ID", referencedColumnName="ID_PRODUCT", nullable = false)
	private Products product;
	
	/**
	 * PRIORITY: Desambiguador de aplicación de precios. Si dos tarifas coinciden en un rago de fechas se aplica la de mayor prioridad (mayor valor numérico).
	 */
	@Column(name="PRIORITY")
	private int priority;
	
	/**
	 * PRICE: precio final de venta.
	 */	
	@Column(name="PRICE")
	private float price;

	/**
	 * CURR: iso de la moneda. 
	 */
	@Column(name="CURR")
	private String curr;

	public Prices() {

	}

	public Prices(Integer priceList, Brands brand, LocalDateTime startDate, LocalDateTime endDate, Products product,
			int priority, float price, String curr) {
		super();
		this.priceList = priceList;
		this.brand = brand;
		this.startDate = startDate;
		this.endDate = endDate;
		this.product = product;
		this.priority = priority;
		this.price = price;
		this.curr = curr;
	}



	public Integer getPriceList() {
		return priceList;
	}

	public void setPriceList(Integer priceList) {
		this.priceList = priceList;
	}

	public Brands getBrand() {
		return brand;
	}

	public void setBrand(Brands brand) {
		this.brand = brand;
	}

	public LocalDateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}

	public LocalDateTime getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDateTime endDate) {
		this.endDate = endDate;
	}

	public Products getProduct() {
		return product;
	}

	public void setProduct(Products product) {
		this.product = product;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getCurr() {
		return curr;
	}

	public void setCurr(String curr) {
		this.curr = curr;
	}

}
