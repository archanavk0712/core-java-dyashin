package com.dyashin.employeerestapp.controller;
import com.dyashin.employeerestapp.serviceimpl.EmployeeServiceimpl;

import java.sql.SQLException;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.dyashin.employeerestapp.exception.EmployeeException;
import com.dyashin.employeerestapp.response.EmployeeResponse;

@RestControllerAdvice
public class EmployeeControllerException {
	
	@ExceptionHandler(EmployeeException.class)
	public EmployeeResponse handleEmployeeException(EmployeeException employeeException) {
		EmployeeResponse response=new EmployeeResponse();
		response.setStatusCode(404);
		response.setError(false);
		return response;
	}
	
	@ExceptionHandler(SQLException.class)
	public EmployeeResponse handleSQLException(SQLException employeeException) {
		EmployeeResponse response=new EmployeeResponse();
		response.setStatusCode(404);
		response.setError(false);
		return response;
	}
}
