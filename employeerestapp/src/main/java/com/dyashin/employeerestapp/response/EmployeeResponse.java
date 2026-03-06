package com.dyashin.employeerestapp.response;

import java.util.List;

import com.dyashin.employeerestapp.dto.EmployeeDto;

import lombok.Data;

@Data
public class EmployeeResponse {
	private int statusCode;
	private boolean error;
	private String msg;
	private EmployeeDto singeRecord;
	private List<EmployeeDto> allRecord;
}
