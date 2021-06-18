package com.dao;

import java.util.List;

import com.model.Employee;

public interface EmployeeDao {
	public abstract Employee addEmployee(Employee employee);
	public abstract Employee readByName(String employeeName);
	public abstract List<Employee> readByDesignation(String employeeDesignation);
	public abstract Employee readById(int employeeId);
	public abstract Employee update(Employee employee);
	public abstract Employee readByExperienceAndDesignation(String employeeDesignation, int employeeExperience);
	public abstract List<Employee> getAllEmployee();
	public abstract Employee delete(int id);
}
