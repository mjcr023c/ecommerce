package com.between.ecommerce.model;

import com.between.ecommerce.enums.TypeMsg;
import com.between.ecommerce.util.Constants;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class GenericResponse {

	private Integer status;
	private String message;
	private TypeMsg typeMsg;
	private Object data;
	private ErrorApi error;

	public GenericResponse() {
		super();
		this.status = Constants.OK_200;
		this.message = Constants.OK;
		this.data = null;
		this.error = null;
	}

	public void setError(Integer status, String message, Integer code, String title, String detail) {
		this.error = new ErrorApi(code, title, detail);
		this.status = status;
		this.message = message;
		this.typeMsg = TypeMsg.ERROR;

	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public ErrorApi getError() {
		return error;
	}

	public void setError(ErrorApi error) {
		this.error = error;
	}

	public void setTypeMsg(TypeMsg typeMsg) {
		this.typeMsg = typeMsg;
	}

	public TypeMsg getTypeMsg() {
		return typeMsg;
	}

	@Override
	public String toString() {
		return "GenericResponse [status=" + status + ", message=" + message + ", typeMsg=" + typeMsg + "]";
	}

}
