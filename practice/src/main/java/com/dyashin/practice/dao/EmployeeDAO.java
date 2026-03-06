package com.dyashin.practice.dao;

import java.sql.SQLException;
import java.util.List;

import com.dyashin.practice.dto.EmployeeDTO;

public interface EmployeeDAO {
	public boolean updateEmp(EmployeeDTO employeeDTO) throws SQLException;

	public boolean saveEmp(EmployeeDTO employeeDTO) throws SQLException;

	public boolean saveOrUpdateEmp(EmployeeDTO employeeDTO, boolean isUpdate) throws SQLException;

	public boolean deleteEmp(int id) throws SQLException;

	public EmployeeDTO getEmpById(int id) throws SQLException;

	public List<EmployeeDTO> getAllEmp() throws SQLException;
}
