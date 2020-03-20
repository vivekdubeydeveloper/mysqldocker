package com.vivek.mysqld.dao;

import org.springframework.data.repository.CrudRepository;

import com.vivek.mysqld.model.Employee;

public interface EmployeeDAO extends CrudRepository<Employee, Integer> {

}
