package com.dyashin.designpattern.commans;

import com.dyashin.designpattern.dao.EmployeeDAOHibernate;
import com.dyashin.designpattern.dao.EmployeeDAOJDBC;

public class EmployeeDisplayDataMain {

//    private static final EmployeeDAOHibernate employeeDaoHibernate = new EmployeeDAOHibernate();
    private static final EmployeeDAOJDBC employeeDaoJDBC = new EmployeeDAOJDBC();
//
    public static void main(String[] args) {
       
//         EmployeeDAOHibernate employeeDAOHibernate = employeeDaoHibernate;
        EmployeeDAOJDBC employeeDAOJDBC = employeeDaoJDBC;

       
//         employeeDAOHibernate.saveEmp("Archana", 60000.0);
//         employeeDAOHibernate.updateEmp(2, "Updated_Archana", 7500.0);
//         employeeDAOHibernate.deleteEmp(1);
//         employeeDAOHibernate.getAllEmployeeData();
//         employeeDAOHibernate.getParticularId(2);
//        employeeDAOHibernate.saveOrUpdateEmployee(3, "Archana Updated", 85000.0);
         
         employeeDAOJDBC.saveEmp("Archana", 60000.0);
//       employeeDAOJDBC.updateEmp(2, "Updated_Archana", 7500 .0);
//       employeeDAOJDBC.deleteEmp(1);
//       employeeDAOJDBC.getAllEmployeeData();
//       employeeDAOJDBC.getParticularId(2);
//      employeeDAOJDBC.saveOrUpdateEmployee(3, "Archana Updated", 85000.0);

        System.out.println("\nOperation Completed!");
    }
}
