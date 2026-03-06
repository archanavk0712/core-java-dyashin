package com.dyashin.corejava.practice;

import java.util.Comparator;

class EmployeeComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
//		return Integer.compare(o2.emp_id, o1.emp_id);
//		if(o1.emp_id > o2.emp_id) {
//			return -1;
//		}else if(o1.emp_id < o2.emp_id) {
//			return +1;
//		}else {
//			return 0;
//		}
		
		if(o1.emp_salary > o2.emp_salary) {
			return -1;
		}else if(o1.emp_salary < o2.emp_salary) {
			return +1;
		}else {
			return 0;
		}
	}
}
