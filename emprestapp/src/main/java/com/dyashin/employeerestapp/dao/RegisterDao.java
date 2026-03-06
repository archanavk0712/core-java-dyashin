package com.dyashin.employeerestapp.dao;

import com.dyashin.employeerestapp.dto.RegistrationDto;

public interface RegisterDao {
	
	public RegistrationDto loginUser(String email, String pass);

	public boolean registerUser(RegistrationDto user);

}