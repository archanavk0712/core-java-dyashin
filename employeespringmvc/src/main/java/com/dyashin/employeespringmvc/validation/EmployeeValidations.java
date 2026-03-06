package com.dyashin.employeespringmvc.validation;

import com.dyashin.employeespringmvc.dto.EmployeeDTO;
import com.dyashin.employeespringmvc.exception.EmployeeException;

public class EmployeeValidations {
	public static void validateFirstName(String firstName) {
        if (firstName == null || firstName.trim().isEmpty()) {
            throw new EmployeeException("First name cannot be empty");
        }
        if (firstName.matches("\\d+")) {
            throw new EmployeeException("First name cannot be numeric");
        }
        if (firstName.length() < 2 || firstName.length() > 50) {
            throw new EmployeeException("First name must be 2-50 characters");
        }
        if (!firstName.matches("^[a-zA-Z\\s]+$")) {
            throw new EmployeeException("First name allows only letters and spaces");
        }
    }
    
    public static void validateLastName(String lastName) {
        if (lastName == null || lastName.trim().isEmpty()) {
            throw new EmployeeException("Last name cannot be empty");
        }
        if (lastName.matches("\\d+")) {
            throw new EmployeeException("Last name cannot be numeric");
        }
        if (lastName.length() < 2 || lastName.length() > 50) {
            throw new EmployeeException("Last name must be 2-50 characters");
        }
        if (!lastName.matches("^[a-zA-Z\\s]+$")) {
            throw new EmployeeException("Last name allows only letters and spaces");
        }
    }
    
    public static void validateMiddleName(String middleName) {
        if (middleName != null && !middleName.trim().isEmpty()) {
            if (middleName.length() > 50) {
                throw new EmployeeException("Middle name max 50 characters");
            }
            if (!middleName.matches("^[a-zA-Z\\s]*$")) {
                throw new EmployeeException("Middle name allows only letters and spaces");
            }
        }
    }
    
    public static void validateEmail(String email) {
        if (email == null || email.trim().isEmpty()) {
            throw new EmployeeException("Email cannot be empty");
        }
        if (!email.matches("^[A-Za-z0-9+_.-]+@([A-Za-z0-9.-]+\\.[A-Za-z]{2,})$")) {
            throw new EmployeeException("Invalid email format");
        }
        if (email.length() > 100) {
            throw new EmployeeException("Email max 100 characters");
        }
    }
    
    public static void validatePhoneNo(String phoneNo) {
    	
        if (phoneNo == null || phoneNo.trim().isEmpty()) {
            throw new EmployeeException("Phone number cannot be empty");
        }
        if (!phoneNo.matches("^\\d{10}$")) {
            throw new EmployeeException("Phone number must be exactly 10 digits");
        }
        if (phoneNo.equals("0000000000")) {
            throw new EmployeeException("Phone number cannot be all zeros");
        }
    }
    
    public static void validateAge(int age) {
        if (age < 18 || age > 65) {
            throw new EmployeeException("Age must be between 18 and 65");
        }
    }
    
    public static void validateGender(String gender) {
        if (gender == null || gender.trim().isEmpty()) {
            throw new EmployeeException("Gender cannot be empty");
        }
        if (!gender.matches("^(Male|Female|Other)$")) {
            throw new EmployeeException("Gender must be Male, Female, or Other");
        }
    }
    
    public static void validateSalary(double salary) {
        if (salary < 0 || salary > 10000000) {
            throw new EmployeeException("Salary must be between 0 and 10 million");
        }
    }
    
    public static void validateDepartmentNo(int deptNo) {
        if (deptNo < 1) {
            throw new EmployeeException("Department number must be positive");
        }
    }
    
    public static void validateExperience(double experience) {
        if (experience < 0 || experience > 50) {
            throw new EmployeeException("Experience must be between 0 and 50 years");
        }
    }
    
    public static void validateDesignation(String designation) {
        if (designation == null || designation.trim().isEmpty()) {
            throw new EmployeeException("Designation cannot be empty");
        }
        if (designation.length() < 2 || designation.length() > 100) {
            throw new EmployeeException("Designation must be 2-100 characters");
        }
    }
    
    public static void validateEmployee(EmployeeDTO employee) {
        validateFirstName(employee.getFirstName());
        validateMiddleName(employee.getMiddleName());
        validateLastName(employee.getLastName());
        validateEmail(employee.getEmail());
        validatePhoneNo(employee.getPhoneNo());
        validateAge(employee.getAge());
        validateGender(employee.getGender());
        validateSalary(employee.getSalary());
        validateDepartmentNo(employee.getDepartmentNo());
        validateExperience(employee.getExperience());
        validateDesignation(employee.getDesignation());
    }

}
