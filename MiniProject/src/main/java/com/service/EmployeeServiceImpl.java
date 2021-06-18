package com.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.EmployeeDao;
import com.model.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService{

	
	@Autowired
    private EmployeeDao employeeDao;
	
	@Override
	@Transactional
	public Employee addEmployee(Employee employee) {
		return 	 employeeDao.addEmployee(employee);
		 
		
	}

	@Override
	public Employee readByName(String employeeName) {
		
		return null;
	}

	

	@Override
	@Transactional
	public Employee readById(int employeeId) {
		
		return employeeDao.readById(employeeId);
	}

	@Override
	public Employee readByExperienceAndDesignation(String employeeDesignation, int employeeExperience) {
		
		return null;
	}

	@Override
	@Transactional
	public Employee update(Employee employee) {
		return employeeDao.update(employee);
	}

	@Override
	@Transactional
	public List<Employee> getAllEmployee() {
		return employeeDao.getAllEmployee();
	}

	@Override
	@Transactional
	public Employee delete(int id) {
		
		return employeeDao.delete(id);
	}

	@Override
	@Transactional
	public List<Employee> readByDesignation(String employeeDesignation) {
		
		return employeeDao.readByDesignation(employeeDesignation);
	}

	
	

	

}
