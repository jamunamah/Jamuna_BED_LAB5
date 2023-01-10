package com.greatlearning.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.dao.EmployeeRepository;
import com.greatlearning.entity.Employee;
import com.greatlearning.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getAll() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee save(Employee employee) {
		return employeeRepository.saveAndFlush(employee);
	}

	@Override
	public Employee findById(int theId) {
		Optional<Employee> result = employeeRepository.findById(theId);

		Employee theEmployee = null;

		if (result.isPresent()) {
			theEmployee = result.get();
		} else
			try {
				throw new RuntimeException("Did not find employee id - " + theId);
			} catch (Exception e) {
			}
		return theEmployee;
	}

	@Override
	public void deleteById(int theId) {
		employeeRepository.deleteById(theId);
	}
}
