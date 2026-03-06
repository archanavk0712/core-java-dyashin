package com.dyashin.employeespringmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dyashin.employeespringmvc.dto.EmployeeDTO;
import com.dyashin.employeespringmvc.service.EmployeeService;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/employees")
    public String listEmployees(Model model) {
        List<EmployeeDTO> employees = service.findAll();
        model.addAttribute("employees", employees);
        return "employeelist";  
    }

    @GetMapping("/employees/add")
    public String showAddForm(Model model) {
        model.addAttribute("employee", new EmployeeDTO());
        return "employeeform";  
    }

    @PostMapping("/employees/add")
    public String addEmployee(@ModelAttribute("employee") EmployeeDTO employee, Model model) {
        boolean saved = service.addEmployee(employee);
        if (saved) {
            List<EmployeeDTO> employees = service.findAll();  
            model.addAttribute("employees", employees);
            return "employeelist"; 
        } else {
            model.addAttribute("error", "Failed to save employee");
            return "employeeform";  
        }
    }

    @GetMapping("/employees/edit/{id}")
    public String showEditForm(@PathVariable("id") int id, Model model) { 
        EmployeeDTO employee = service.findById(id);
        if (employee == null) {
            List<EmployeeDTO> employees = service.findAll();
            model.addAttribute("employees", employees);
            model.addAttribute("error", "Employee not found");
            return "employeelist";  
        }
        model.addAttribute("employee", employee);
        return "employeeform";   
    }

    @PostMapping("/employees/update") 
    public String updateEmployee(@ModelAttribute("employee") EmployeeDTO employee, Model model) {
        boolean updated = service.updateEmployee(employee);
        if (!updated) {
            model.addAttribute("error", "Failed to update employee");
            return "employeeform";
        }
        List<EmployeeDTO> employees = service.findAll(); 
        model.addAttribute("employees", employees);
        return "employeelist"; 
    }

    @GetMapping("/employees/delete/{id}")
    public String deleteEmployee(@PathVariable("id") int id, Model model) {  
        service.deleteEmployee(id);
        List<EmployeeDTO> employees = service.findAll(); 
        model.addAttribute("employees", employees);
        return "employeelist";  
    }

    @GetMapping("/employees/{id}")
    public String viewEmployee(@PathVariable("id") int id, Model model) { 
        EmployeeDTO employee = service.findById(id);
        if (employee == null) {
            List<EmployeeDTO> employees = service.findAll();
            model.addAttribute("employees", employees);
            model.addAttribute("error", "Employee not found");
            return "employeelist";  
        }
        model.addAttribute("employee", employee);
        return "employeedetails";  
    }
    
    @GetMapping("/employees/search")
    public String searchEmployee(@RequestParam(value = "id", required = false) Integer id, Model model) {
        if (id == null || id <= 0) {
            model.addAttribute("error", "Please enter a valid Employee ID");
            return "employeesearch";
        }
        
        EmployeeDTO employee = service.findById(id);
        if (employee == null) {
            model.addAttribute("error", "Employee not found with ID: " + id);
            return "employeesearch";
        }
        model.addAttribute("employee", employee);
        return "employeedetails";
    }
}

