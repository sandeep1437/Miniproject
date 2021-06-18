package com.service;

import com.model.LoginDetails;

public interface LoginService {

	public abstract LoginDetails addUser(LoginDetails loginDetails);
	public abstract LoginDetails readUserByUserNameAndPassword(String UserName, String Password);
}
