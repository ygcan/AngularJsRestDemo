package com.yasemin.angularjsrestapidemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yasemin.angularjsrestapidemo.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
	Employee findByName(String name);
}