package com.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.LoginDao;
import com.model.LoginDetails;
@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginDao loginDao;
	
	@Override
	@Transactional
	public LoginDetails addUser(LoginDetails loginDetails) {
		
		return loginDao.addUser(loginDetails);
	}

	@Override
	@Transactional
	public LoginDetails readUserByUserNameAndPassword(String UserName, String Password) {
		LoginDetails loginDetails = loginDao.readUserByUserNameAndPassword(UserName, Password);
		
		return loginDetails;
	}

}
