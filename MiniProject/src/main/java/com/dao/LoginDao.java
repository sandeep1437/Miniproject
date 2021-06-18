package com.dao;

import com.model.LoginDetails;

public interface LoginDao {
	public abstract LoginDetails addUser(LoginDetails loginDetails);
	public abstract LoginDetails readUserByUserNameAndPassword(String UserName, String Password);
}
