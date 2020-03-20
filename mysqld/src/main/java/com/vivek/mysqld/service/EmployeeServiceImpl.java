package com.vivek.mysqld.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vivek.mysqld.dao.EmployeeDAO;
import com.vivek.mysqld.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeDAO employeeDAO;

	@Override
	public List<Employee> getEmployees() {
		List<Employee> employess=new ArrayList<>();
		employeeDAO.findAll().forEach(ele->employess.add(ele));
		return employess;
	}

}
