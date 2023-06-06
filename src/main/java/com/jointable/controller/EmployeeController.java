package com.jointable.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jointable.Service.DeptEmpService;
import com.jointable.model.DeleteEmpResponse;
import com.jointable.model.GetAllEmpResponse;
import com.jointable.model.GetByNameResponse;
import com.jointable.model.GetEmpRequest;
import com.jointable.model.GetEmpResponse;
import com.jointable.model.SaveEmpRequest;
import com.jointable.model.SaveEmpResponse;
import com.jointable.model.UpdateEmpRequest;
import com.jointable.model.UpdateEmpResponse;

@RestController
@RequestMapping(value = "/api")
public class EmployeeController {
	@Autowired
	DeptEmpService employeeService;

	@PostMapping("/saveemp")
	public SaveEmpResponse saveEmp(@RequestBody(required = false) SaveEmpRequest request) {
		SaveEmpResponse response = new SaveEmpResponse();
		employeeService.saveEmp(request, response);
		return response;
	}

	@GetMapping("getallemp")
	public GetAllEmpResponse getAllEmp() {
		GetAllEmpResponse response = new GetAllEmpResponse();
		response = employeeService.getAllEmp(response);
		return response;
	}

	@GetMapping("/getbyid/{id}")
	public GetEmpResponse getById(@PathVariable("id") int id, @RequestBody(required = false) GetEmpRequest request) {
		GetEmpResponse response = new GetEmpResponse();
		employeeService.getById(id, request, response);
		return response;
	}

	@DeleteMapping("/deleteemp/{id}")
	public DeleteEmpResponse deleteEmp(@PathVariable("id") int id) {
		DeleteEmpResponse response = new DeleteEmpResponse();
		response = employeeService.deleteEmp(id, response);
		return response;
	}

	@PutMapping("/updateemp/{id}")
	public UpdateEmpResponse updateEmp(@RequestBody(required = false) UpdateEmpRequest request,
			@PathVariable("id") int id) {
		request.setId(id);
		UpdateEmpResponse response = new UpdateEmpResponse();
		response = employeeService.udateEmp(id, request, response);
		return response;
	}

	@GetMapping("/getbyname/{name}")
	public GetByNameResponse getByName(@PathVariable("name") String name) {
		GetByNameResponse response = new GetByNameResponse();
		response = employeeService.getByName1(name, response);
		return response;
	}

}
