package com.dyashin.employeerestapp.service;

import com.dyashin.employeerestapp.dto.RegistrationDto;
import com.dyashin.employeerestapp.request.RegistrationReqDto;

public interface RegistrationService {
	
	public RegistrationDto loginUser(String email, String pass);

	public boolean registerUser(RegistrationReqDto user);

}