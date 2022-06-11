package com.between.ecommerce.model;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

public class RequestBodyPrices {
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd-HH.mm.ss")
	LocalDateTime nowDateTime;
	Integer productId;
	Integer brandId;

	public RequestBodyPrices() {
	}

	public RequestBodyPrices(LocalDateTime nowDateTime, Integer productId, Integer brandId) {
		super();
		this.nowDateTime = nowDateTime;
		this.productId = productId;
		this.brandId = brandId;
	}

	public LocalDateTime getNowDateTime() {
		return nowDateTime;
	}

	public void setNowDateTime(LocalDateTime nowDateTime) {
		this.nowDateTime = nowDateTime;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getBrandId() {
		return brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	@Override
	public String toString() {
		return "RequestBodyPrices [nowDateTime=" + nowDateTime + ", productId=" + productId + ", brandId=" + brandId
				+ "]";
	}

}
