package com.dyashin.employeerestapp.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dyashin.employeerestapp.dto.EmployeeDto;
import com.dyashin.employeerestapp.request.EmployeeReqDto;
import com.dyashin.employeerestapp.response.EmployeeResponse;
import com.dyashin.employeerestapp.service.EmployeeService;

//@Controller
@RestController
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	EmployeeResponse response = new EmployeeResponse();

	@GetMapping(path = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
//  @ResponseBody
	public EmployeeResponse getAll() {
		List<EmployeeDto> list=service.allData();
		if (list!=null) {
			response.setStatusCode(200);
			response.setError(false);
			response.setMsg("All record found");
			response.setSingeRecord(null);
			response.setAllRecord(list);
		} else {
			response.setStatusCode(404);
			response.setError(true);
			response.setMsg("No record found");
			response.setSingeRecord(null);
			response.setAllRecord(null);
		}
		return response;
	}

	@GetMapping("/id")
//	@ResponseBody
	public EmployeeResponse getEmployeeById(@RequestParam("id") int id) {
		Optional<EmployeeDto> dto = service.getDataById(id);
		if (dto.isPresent()) {
			response.setStatusCode(200);
			response.setError(false);
			response.setMsg("record found");
			response.setSingeRecord(dto.get());
		} else {
			response.setStatusCode(404);
			response.setError(true);
			response.setMsg("record not found");
			response.setSingeRecord(null);
		}
		return response;
	}

	@PostMapping(path = "/add", consumes = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
//  @ResponseBody
	public EmployeeResponse insertEmp(@RequestBody EmployeeReqDto employeeReqDto) {
		if (service.insertData(employeeReqDto)) {
			response.setStatusCode(200);
			response.setError(false);
			response.setMsg("Record inserted");
			response.setSingeRecord(null);
			response.setAllRecord(null);
		} else {
			response.setStatusCode(404);
			response.setError(true);
			response.setMsg("Record not inserted");
			response.setSingeRecord(null);
			response.setAllRecord(null);
		}
		return response;
	}

	@PutMapping("/update")
//    @ResponseBody
	public EmployeeResponse updateEmp(@RequestParam("id") int id, @RequestBody EmployeeReqDto employeeReqDto) {
		if (service.update(id, employeeReqDto)) {
			response.setStatusCode(200);
			response.setError(false);
			response.setMsg("Record updated successfully");
			response.setSingeRecord(null);
			response.setAllRecord(null);
		} else {
			response.setStatusCode(404);
			response.setError(true);
			response.setMsg("Failed to update data");
			response.setSingeRecord(null);
			response.setAllRecord(null);
		}
		return response;
	}

	@DeleteMapping("/delete")
//    @ResponseBody
	public EmployeeResponse deleteEmp(@RequestParam("id") int id) {
		if (service.delete(id)) {
			response.setStatusCode(200);
			response.setError(false);
			response.setMsg("Deleted successfully");
			response.setSingeRecord(null);
			response.setAllRecord(null);
		} else {
			response.setStatusCode(404);
			response.setError(true);
			response.setMsg("Failed to delete data");
			response.setSingeRecord(null);
			response.setAllRecord(null);
		}
		return response;
	}
}
