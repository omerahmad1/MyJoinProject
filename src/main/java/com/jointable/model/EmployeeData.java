package com.jointable.model;

import com.jointable.entities.Department;

public class EmployeeData {
	private String name;
	private String address;
	private int id;
	private Department department;
	

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

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "EmployeeData [name=" + name + ", address=" + address + ", department=" + department + ", id=" + id + "]";
	}

}

