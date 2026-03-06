package com.dyashin.practice.factory;

import com.dyashin.practice.dao.EmployeeDAO;
import com.dyashin.practice.dao.EmployeeDAOHibernate;
import com.dyashin.practice.dao.EmployeeDAOJDBC;

public class EmployeeDAOFactory {

	private EmployeeDAOFactory() {

	}

	public static EmployeeDAO getDAOInstance(String type) {
		if (type.equalsIgnoreCase("JDBC")) {
			return new EmployeeDAOJDBC();
		} else if (type.equalsIgnoreCase("Hibernate")) {
			return new EmployeeDAOHibernate();
		} else {
			return null;
		}
	}
}
