package com.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.model.LoginDetails;
import com.service.LoginService;
@Component
public class LoginValidator implements Validator {
	
	@Autowired
	private LoginService loginService;

	@Override
	public boolean supports(Class<?> clazz) {
		
		return false;
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors,"userName", "message");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors,"password", "message");
	}

	public void loginValidate(LoginDetails loginDetails, Errors errors)
	{
		LoginDetails loginDetails1 = loginService.readUserByUserNameAndPassword(loginDetails.getUserName(),loginDetails.getPassword() );
		if(loginDetails1 == null)
		{
			errors.rejectValue("userName","message1");
			errors.rejectValue("password","message1");
		}
	}
}
