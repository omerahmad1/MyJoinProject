package com.jointable.model;

import java.util.List;

import com.jointable.entities.Employee;

public class GetEmpRequest {
	private int id;
	private String name;
	private String address;
	private List<Employee> employee;


	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}



	@Override
	public String toString() {
		return "GetEmpRequest [id=" + id + ", name=" + name + ", address=" + address + ", employee=" + employee + "]";
	}

}

