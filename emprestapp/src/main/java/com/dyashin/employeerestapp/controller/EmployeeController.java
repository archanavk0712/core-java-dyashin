package com.dyashin.employeerestapp.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dyashin.employeerestapp.dto.EmployeeDto;
import com.dyashin.employeerestapp.request.EmployeeReqDto;
import com.dyashin.employeerestapp.service.EmployeeService;

@Controller
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
    @PostMapping("/add")
    @ResponseBody
	public boolean insertEmp(@RequestBody EmployeeReqDto employeeReqDto) {
		boolean insert=service.insertData(employeeReqDto);
		return insert;
	}
	
    
    @PostMapping("/update")
    @ResponseBody
    public boolean updateEmp(@RequestParam("id") int id,@RequestBody EmployeeReqDto employeeReqDto) {
    	return service.update(id, employeeReqDto);
    }
    
    @GetMapping("/delete")
    @ResponseBody
    public boolean deleteEmp(@RequestParam("id") int id) {
    	return service.delete(id);
    }
    
    @GetMapping("/all")
    @ResponseBody
    public List<EmployeeDto> getAll(){
    	return service.allData();
    }
    
	@GetMapping("/id")
	@ResponseBody
	public EmployeeDto getEmployeeById(@RequestParam("id") int id) {
		Optional<EmployeeDto> dto = service.getDataById(id);
		return dto.get();
	}
}
