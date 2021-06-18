package com.dao;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Employee;
@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public Employee addEmployee(Employee employee) {
		Session session = sessionFactory.getCurrentSession();

		session.save(employee);

		return employee;
		
	}

	@Override
	public Employee readByName(String employeeName) {
		
		return null;
	}

	@Override
	public List<Employee> readByDesignation(String employeeDesignation) {
		Session session = this.sessionFactory.getCurrentSession();
		Query query = session.createQuery("from emp where designation=:design",Employee.class);
		query.setParameter("design", employeeDesignation);
		List<Employee> list = query.getResultList();
		return list;
	}

	@Override
	public Employee readById(int employeeId) {
		Session session = this.sessionFactory.getCurrentSession();
		Employee employee = session.load(Employee.class, employeeId);
		
		return employee;
	}

	@Override
	public Employee readByExperienceAndDesignation(String employeeDesignation, int employeeExperience) {
		
		return null;
	}

	/*@Override
	public Employee update(Employee employee) {
		Session session = this.sessionFactory.getCurrentSession();
		Employee employee = session.load(Employee.class, empId);
		session.update(employee);
		Query query = session.createQuery("")
		return null;
	}*/

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getAllEmployee() {
		Session session = this.sessionFactory.getCurrentSession();
		Query query = session.createQuery("from emp",Employee.class);
		List<Employee> list = query.getResultList();
		return list;
	}

	@Override
	public Employee delete(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Employee employee = session.load(Employee.class, id);
		session.delete(employee);
		return null;
	}

	@Override
	public Employee update(Employee employee) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(employee);
		return employee;
	}

	

	
}
