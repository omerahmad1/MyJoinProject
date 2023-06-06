package com.jointable.Service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jointable.entities.Department;
import com.jointable.entities.Employee;
import com.jointable.model.DeleteEmpResponse;
import com.jointable.model.EmployeeData;
import com.jointable.model.EmployeeIdData;
import com.jointable.model.EmployeeNameData;
import com.jointable.model.GetAllEmpResponse;
import com.jointable.model.GetByNameResponse;
import com.jointable.model.GetEmpRequest;
import com.jointable.model.GetEmpResponse;
import com.jointable.model.SaveEmpRequest;
import com.jointable.model.SaveEmpResponse;
import com.jointable.model.UpdateEmpRequest;
import com.jointable.model.UpdateEmpResponse;
import com.jointable.repository.EmployeeRepo;

@Service
public class DeptEmpService {

	@Autowired
	EmployeeRepo employeeRepo;

	public SaveEmpResponse saveEmp(SaveEmpRequest request, SaveEmpResponse response) {
		Department department = new Department();
		Employee employee;
		List<Employee> emp1 = new ArrayList<>();
		for (Employee emp2 : request.getEmployees()) {
			employee = new Employee();

			employee.setName(emp2.getName());
			employee.setAddress(emp2.getAddress());
			employee.setDepartment(emp2.getDepartment());
			employee.setDepartment(department);
			emp1.add(employee);
		}
		department.setDName(request.getdName());
		department.setDescription(request.getDescription());
		department.setEmployee(request.getEmployees());
		employeeRepo.saveAll(emp1);

		response.setCode("200");
		response.setMessage("Success");
		return response;

	}

	public DeleteEmpResponse deleteEmp(int id, DeleteEmpResponse response) {
		employeeRepo.deleteById(id);
		response.setCode("200");
		response.setMessage("Success");
		return response;
	}

	public GetAllEmpResponse getAllEmp(GetAllEmpResponse response) {
		EmployeeData data = null;
		List<EmployeeData> employeeDatas = new ArrayList<>();

		List<Employee> employees = employeeRepo.findAll();
		for (Employee employee : employees) {
			data = new EmployeeData();
			data.setAddress(employee.getAddress());
			data.setName(employee.getName());
			data.setId(employee.getId());
			employeeDatas.add(data);
		}

		response.setData(employeeDatas);
		response.setCode("200");
		response.setMessage("Success");
		return response;
	}

	public GetEmpResponse getById(int id, GetEmpRequest request, GetEmpResponse response) {
		EmployeeIdData data = new EmployeeIdData();
		Employee employee = employeeRepo.findById(id);
		data.setId(employee.getId());
		data.setAdress(employee.getAddress());
		data.setName(employee.getName());
		response.setData(data);
		response.setCode("200");
		response.setMessage("Success");
		return response;
	}

	public UpdateEmpResponse udateEmp(int id, UpdateEmpRequest request, UpdateEmpResponse response) {

		Employee employee;
		employee = employeeRepo.findById(request.getId());
		employee.setId(request.getId());
		employee.setName(request.getName());
		employee.setAddress(request.getAddress());
		employee.setDepartment(request.getDepartment());
		employeeRepo.save(employee);
		response.setCode("200");
		response.setMessage("Success");
		return response;

	}

	public GetByNameResponse getByName1(String name, GetByNameResponse response) {
		EmployeeNameData data;
		List<EmployeeNameData> data1 = new ArrayList<>();
		List<Employee> employee = employeeRepo.getByName(name);
		for (Employee employee1 : employee) {
			data = new EmployeeNameData();
			data.setId(employee1.getId());
			data.setName(employee1.getName());
			data.setAddress(employee1.getAddress());
			data1.add(data);
		}
		response.setData(data1);
		response.setCode("200");
		response.setMessage("Success");
		return response;
	}

}
