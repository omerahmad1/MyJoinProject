package com.jointable.model;

import java.util.List;

public class GetAllEmpResponse {
	private List<EmployeeData> data;
	private String code;
	private String message;

	public List<EmployeeData> getData() {
		return data;
	}

	public void setData(List<EmployeeData> data) {
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
		return "GetAllEmpResponse [data=" + data + ", code=" + code + ", message=" + message + ", toString()="
				+ super.toString() + "]";
	}

}

