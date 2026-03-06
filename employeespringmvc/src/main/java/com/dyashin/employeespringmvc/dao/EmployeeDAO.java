package com.dyashin.employeespringmvc.dao;

import java.util.List;

import com.dyashin.employeespringmvc.dto.EmployeeDTO;

public interface EmployeeDAO {

	public boolean addEmployee(EmployeeDTO employee);
	public boolean deleteEmployee(int id);
	public List<EmployeeDTO> findAll();
	public boolean updateEmployee(EmployeeDTO employee);
	public EmployeeDTO findById(int id);
}
