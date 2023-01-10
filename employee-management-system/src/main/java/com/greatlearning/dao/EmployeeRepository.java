package com.greatlearning.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.entity.Employee;

//this layer talks to the DB
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}