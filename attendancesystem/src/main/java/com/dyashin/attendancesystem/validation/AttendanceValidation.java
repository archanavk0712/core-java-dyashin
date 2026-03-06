package com.dyashin.attendancesystem.validation;

import com.dyashin.attendancesystem.exception.AttendanceException;

public class AttendanceValidation {
	
	public static void validateChoice(int choice) throws AttendanceException {
		if (choice <= 0) {
			throw new AttendanceException("Error: Choice must be positive only");
		}
	}
	
	public static void validateId(int num) throws AttendanceException {
		if (num <= 0) {
			throw new AttendanceException("Error: Id must be positive only");
		}
	}

	public static void validateName(String name) throws AttendanceException {
		if (!name.matches("^[A-Za-z ]+$")) {
			throw new AttendanceException("Error: Must contain only letters and spaces");
		}
	}

	public static void validateClose(String close) throws AttendanceException {
		if (!(close.equalsIgnoreCase("y") || close.equalsIgnoreCase("n"))) {
			throw new AttendanceException("Error: Type y or n only");
		}
	}

}
