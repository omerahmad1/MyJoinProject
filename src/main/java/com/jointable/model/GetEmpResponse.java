package com.jointable.model;

public class GetEmpResponse {
	
	private EmployeeIdData data;
	private String code;
	private String message;

	public EmployeeIdData getData() {
		return data;
	}

	public void setData(EmployeeIdData data) {
		this.data = data;
	}

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
		return "GetEmpResponse [data=" + data + ", code=" + code + ", message=" + message + "]";
	}

}
