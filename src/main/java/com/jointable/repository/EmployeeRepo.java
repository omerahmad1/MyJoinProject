package com.jointable.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jointable.entities.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

	Employee findById(int id);

//	@Query("From Employee where department.name = :name")
	List<Employee> getByName(String name);

//@Query("select new com.JionProject.model.JoinResponse( e.name , e.address, d.dName) From Employee e Join e.address d")
//List<Employee> getJoin();

}