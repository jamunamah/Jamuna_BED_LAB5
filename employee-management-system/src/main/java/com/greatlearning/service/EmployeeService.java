package com.greatlearning.service;

import java.util.List;

import com.greatlearning.entity.Employee;

public interface EmployeeService {

	List<Employee> getAll();

	Employee save(Employee employee);

	Employee findById(int theId);

	void deleteById(int theId);

}
