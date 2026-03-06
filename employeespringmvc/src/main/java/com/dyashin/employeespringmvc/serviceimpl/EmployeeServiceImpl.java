package com.dyashin.employeespringmvc.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dyashin.employeespringmvc.dao.EmployeeDAO;
import com.dyashin.employeespringmvc.dto.EmployeeDTO;
import com.dyashin.employeespringmvc.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
    private EmployeeDAO dao;
	
	@Override
	public boolean addEmployee(EmployeeDTO employee) {
		return dao.addEmployee(employee);
	}

	@Override
	public boolean deleteEmployee(int id) {
		return dao.deleteEmployee(id);
	}

	@Override
	public List<EmployeeDTO> findAll() {
		return dao.findAll();
	}

	@Override
	public boolean updateEmployee(EmployeeDTO employee) {
		return dao.updateEmployee(employee);
	}

	@Override
	public EmployeeDTO findById(int id) {
		return dao.findById(id);
	}
	
	

}
