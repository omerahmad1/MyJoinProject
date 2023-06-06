package com.jointable.model;


public class DeleteEmpResponse {
	private String code;
	private String message;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "DeleteEmpResponse [code=" + code + ", message=" + message + "]";
	}
	
	

}
