package com.between.ecommerce.model;

public class ErrorApi {
	
	private Integer code;
	private String title;
	private String detail;
	
	public ErrorApi() {
	}

	public ErrorApi(Integer code, String title, String detail) {
		super();
		this.code = code;
		this.title = title;
		this.detail = detail;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

}
