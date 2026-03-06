package com.dyashin.employeerestapp.service;


import java.util.List;
import java.util.Optional;

import com.dyashin.employeerestapp.dto.EmployeeDto;
import com.dyashin.employeerestapp.request.EmployeeReqDto;


public interface EmployeeService {
	public boolean insertData(EmployeeReqDto reqdto);

	public boolean delete(int id);

	public boolean update(int id, EmployeeReqDto reqdto);

	public List<EmployeeDto> allData();

	public Optional<EmployeeDto> getDataById(int id);
	
	

}