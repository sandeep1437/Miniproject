package com.dao;
import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.LoginDetails;
@Repository
public class LoginDaoImpl implements LoginDao {

	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public LoginDetails addUser(LoginDetails loginDetails) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(loginDetails);
		return null;
	}

	@SuppressWarnings({ "unlikely-arg-type", "unchecked" })
	@Override
	@Transactional
	public LoginDetails readUserByUserNameAndPassword(String UserName, String Password) {
		Session session = this.sessionFactory.getCurrentSession();
		Query query = session.createQuery("select password from login where userName=:userName");
		query.setParameter("userName", UserName);
		List<LoginDetails> list = query.getResultList();
		if(list.contains(Password)) {
			return new LoginDetails();
		}
		return null;
	}

}
