package com.jointable.model;

import java.util.List;

import com.jointable.entities.Department;
import com.jointable.entities.Employee;

public class SaveEmpRequest {
	private int id;
	private String name;
	private String address;
	private String dName;
	private String description;
	private Department department;
	private List<Employee> employees;
	
	
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescrition(String description) {
		this.description = description;
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
		return "SaveEmpRequest [id=" + id + ", name=" + name + ", address=" + address + ", dName=" + dName
				+ ", description=" + description + ", department=" + department + ", employees=" + employees + "]";
	}
	

}