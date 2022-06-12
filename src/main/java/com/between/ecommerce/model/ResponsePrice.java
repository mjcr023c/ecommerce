package com.between.ecommerce.model;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ResponsePrice {

	private Integer idProduct;
	private Integer idBrand;
	private Integer priceList;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd-HH.mm.ss")
	private LocalDateTime startDate;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd-HH.mm.ss")
	private LocalDateTime endDate;
	private float price;
	private String curr;

	public ResponsePrice() {
	}

	public ResponsePrice(Integer idBrand, Integer idProduct, Integer priceList, LocalDateTime startDate,
			LocalDateTime endDate, float price, String curr) {
		super();
		this.idBrand = idBrand;
		this.idProduct = idProduct;
		this.priceList = priceList;
		this.startDate = startDate;
		this.endDate = endDate;
		this.price = price;
		this.curr = curr;
	}

	public Integer getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(Integer idProduct) {
		this.idProduct = idProduct;
	}

	public Integer getIdBrand() {
		return idBrand;
	}

	public void setIdBrand(Integer idBrand) {
		this.idBrand = idBrand;
	}

	public Integer getPriceList() {
		return priceList;
	}

	public void setPriceList(Integer priceList) {
		this.priceList = priceList;
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

	@Override
	public String toString() {
		return "ResponsePrice [idProduct=" + idProduct + ", idBrand=" + idBrand + ", priceList=" + priceList
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", price=" + price + ", curr=" + curr + "]";
	}

	@Override
	public boolean equals(Object o) {

		// If the object is compared with itself then return true
		if (o == this) {
			return true;
		}

		/*
		 * Check if o is an instance of Complex or not "null instanceof [type]" also
		 * returns false
		 */
		if (!(o instanceof ResponsePrice)) {
			return false;
		}

		// typecast o to Complex so that we can compare data members
		ResponsePrice c = (ResponsePrice) o;

		// Compare the data members and return accordingly
		return Integer.compare(idBrand, c.idBrand) == 0 && Integer.compare(idProduct, c.idProduct) == 0
				&& Integer.compare(priceList, c.priceList) == 0 && startDate.isEqual(c.startDate)
				&& endDate.isEqual(c.endDate) && price == c.price && curr.equalsIgnoreCase(c.curr);

	}
}
