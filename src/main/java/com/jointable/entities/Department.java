package com.jointable.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "department")
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column (name = "d_name")
	private String dName;
	@Column(name = "description")
	private String description;
	@OneToMany(mappedBy = "department",orphanRemoval = true)
	private List<Employee> employee;
	public int getid() {
		return id;
	}
	public void setdept_id(int id) {
		this.id = id;
	}
	public String getDName() {
		return dName;
	}
	public void setDName(String dName) {
		this.dName = dName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", dName=" + dName + ", description=" + description + ", employee=" + employee
				+ "]";
	}
	

}
