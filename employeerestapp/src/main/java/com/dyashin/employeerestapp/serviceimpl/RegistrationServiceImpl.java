package com.dyashin.employeerestapp.serviceimpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dyashin.employeerestapp.daoimpl.RegisterDaoImpl;
import com.dyashin.employeerestapp.dto.RegistrationDto;
import com.dyashin.employeerestapp.request.RegistrationReqDto;
import com.dyashin.employeerestapp.service.RegistrationService;


@Service
public class RegistrationServiceImpl implements RegistrationService{
	
	@Autowired
	RegisterDaoImpl dao;
	
	@Override
	public RegistrationDto loginUser(String email, String pass) {
		RegistrationDto dto= dao.loginUser(email, pass);
		return dto;
	}

	@Override
	public boolean registerUser(RegistrationReqDto user) {
		RegistrationDto regdto = new RegistrationDto();
		regdto.setName(user.getName());
		regdto.setEmail(user.getEmail());
		regdto.setMobile_no(user.getMobile_no());
		regdto.setPass(user.getPass());
		
		return dao.registerUser(regdto);
	}

}