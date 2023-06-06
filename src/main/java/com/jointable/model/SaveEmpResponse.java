package com.jointable.model;

public class SaveEmpResponse {
	private String code ;
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
		return "SaveEmpResponse [code=" + code + ", message=" + message + "]";
	}
}