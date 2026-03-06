package com.dyashin.corejava.practiceStreams;

import java.util.ArrayList;
import java.util.List;

public class EmployeeStream {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<Employee>();

		Employee e1 = new Employee("Archana", 101, 3, 30000);
		Employee e2 = new Employee("Abhinaya", 102, 4, 50000);
		Employee e3 = new Employee("Bhoomika", 103, 5, 40000);
		Employee e4 = new Employee("Sindhu", 104, 2, 60000);
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);

//	employees.stream()
//		.map(emp -> emp.getName()  )
//		.forEach(System.out::println);

		employees
			.stream()
			.filter(emp -> emp.getSalary() >= 50000)
			.map(emp -> emp.getName())
			.forEach(System.out::println);
	}
}
