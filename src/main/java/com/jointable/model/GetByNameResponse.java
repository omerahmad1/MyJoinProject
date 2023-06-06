package com.jointable.model;

import java.util.List;

public class GetByNameResponse {
	private List<EmployeeNameData> data;
	private String code;
	private String message ;
	
	public List<EmployeeNameData> getData() {
		return data;
	}
	public void setData(List<EmployeeNameData> data1) {
		this.data = data1;
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
		return "GetByNameResponse [data=" + data + ", code=" + code + ", message=" + message + "]";
	} 
	

}