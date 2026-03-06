package com.dyashin.corejava.practice;

import java.util.TreeSet;

public class Employee {
	public int emp_id;
	public String emp_name;
	public double emp_salary;
	
	public Employee(int emp_id, String emp_name, double emp_salary) {
		this.emp_id=emp_id;
		this.emp_name=emp_name;
		this.emp_salary=emp_salary;
	}
	
	@Override
	public String toString() {
		return "Employee [emp_id= "+emp_id+" , emp_name ="+emp_name+" , emp_salary= "+emp_salary+" ]";
		
	}
	
	public static void main(String[] args) {
		
		TreeSet<Employee> ts =new TreeSet<Employee>(new EmployeeComparator());
		
		ts.add(new Employee(12, "abc", 4590));
		ts.add(new Employee(54, "pqr", 5434));
		ts.add(new Employee(67, "lmn", 2566));
		ts.add(new Employee(22, "xyz", 7543));
		ts.add(new Employee(57, "uvw", 2455));
		
		for(Employee e: ts) {
		System.out.println(e);
		}
	}
}