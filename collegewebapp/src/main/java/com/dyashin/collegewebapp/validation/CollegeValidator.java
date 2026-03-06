package com.dyashin.collegewebapp.validation;

import com.dyashin.collegewebapp.exception.CollegeException;

public class CollegeValidator {

	private CollegeValidator() {

	}

	public static void validateString(String value, String field) throws CollegeException {
		if (value == null || value.trim().isEmpty()) {
			throw new CollegeException(field + " cannot be empty");
		}

		if (!value.matches("^[A-Za-z ]+$")) {
			throw new CollegeException(field + " must contain only letters and spaces");
		}
	}

	public static void validateId(int id) throws CollegeException {
		if(id<=0) {
			throw new CollegeException("Id must be positive");
		}
		
	}
	
	public static void validateSaveId(int id) throws CollegeException {
		if(id<0) {
			throw new CollegeException("Id must be positive");
		}
		
	}
	
	public static void validateClose(String exit) throws CollegeException {
		if(!(exit.equalsIgnoreCase("yes")|| exit.equalsIgnoreCase("no"))){
			throw new CollegeException("Type Yes or No only");
		}
	}

	public static void validateFees(double fee) throws CollegeException {
		if(fee<=0) {
			throw new CollegeException("Fee must be positive");
		}
		
	}

}
