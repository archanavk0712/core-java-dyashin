package com.dyashin.practice.commans;

import java.sql.SQLException;
import java.util.ArrayList;


import java.sql.Date;


import com.dyashin.practice.dao.EmployeeDAO;
import com.dyashin.practice.dao.EmployeeDAOHibernate;
import com.dyashin.practice.dao.EmployeeDAOJDBC;
import com.dyashin.practice.dto.EmployeeDTO;
import com.dyashin.practice.factory.EmployeeDAOFactory;
import static com.dyashin.practice.dao.DBInteractionType.TYPE;
public class EmployeeDisplayData {

	public static void main(String[] args) throws SQLException {

		
		EmployeeDAO employeeDao=EmployeeDAOFactory.getDAOInstance(TYPE);
		
		//update
		try {
			EmployeeDTO empDTO=new EmployeeDTO();
			empDTO.setId(167);
			empDTO.setName("Archana");
			System.out.println(employeeDao.updateEmp(empDTO));
		} catch (SQLException e) {
			e.printStackTrace();
		} 
//		
//		EmployeeDAOJDBC employeeDAOJDBC = new EmployeeDAOJDBC();

		// update
//		EmployeeDTO employeeDTO=new EmployeeDTO();
//		employeeDTO.setId(1);
//		employeeDTO.setName("Bhuvi");
//		employeeDTO.setEmail("bhuvi@gmail.com");
//		employeeDTO.setPhone(7894561236L);
//		employeeDTO.setAge(54);
//		employeeDTO.setSalary(4654.86);
//		employeeDTO.setDob(Date.valueOf("2012-05-02"));
//		employeeDTO.setGender("male");
//		employeeDTO.setJoining_date(Date.valueOf("2025-05-02"));
//		employeeDTO.setDept_no(20);
//		employeeDTO.setDesignation("manager");
//		employeeDTO.setExperience(4);
//		System.out.println(employeeDAOJDBC.updateEmp(employeeDTO));

		// save
//		EmployeeDTO employeeDTO=new EmployeeDTO();
//		employeeDTO.setId(10);
//		employeeDTO.setName("Bhuvi");
//		employeeDTO.setEmail("bhuvi@gmail.com");
//		employeeDTO.setPhone(7894561236L);
//		employeeDTO.setAge(54);
//		employeeDTO.setSalary(4654.86);
//		employeeDTO.setDob(Date.valueOf("2012-05-02"));
//		employeeDTO.setGender("male");
//		employeeDTO.setJoining_date(Date.valueOf("2025-05-02"));
//		employeeDTO.setDept_no(20);
//		employeeDTO.setDesignation("manager");
//		employeeDTO.setExperience(4);
//		System.out.println(employeeDAOJDBC.saveEmp(employeeDTO)); 

		// saveOrUpdate
//		EmployeeDTO employeeDTO=new EmployeeDTO();
//		employeeDTO.setId(14);
//		employeeDTO.setName("Bhuvi");
//		employeeDTO.setEmail("bhuvi@gmail.com");
//		employeeDTO.setPhone(7894561236L);
//		employeeDTO.setAge(54);
//		employeeDTO.setSalary(4654.86);
//		employeeDTO.setDob(Date.valueOf("2012-05-02"));
//		employeeDTO.setGender("male");
//		employeeDTO.setJoining_date(Date.valueOf("2025-05-02"));
//		employeeDTO.setDept_no(20);
//		employeeDTO.setDesignation("manager");
//		employeeDTO.setExperience(4);
//		System.out.println(employeeDAOJDBC.saveOrUpdateEmp(employeeDTO,true)); 

		// delete
//		System.out.println(employeeDAOJDBC.deleteEmp(2));

		// getEmpById
//		EmployeeDTO employeeDTO=employeeDAOJDBC.getEmpById(10);
//		System.out.println("Id: "+employeeDTO.getId());
//		System.out.println("Name: "+employeeDTO.getName());
//		System.out.println("Email : "+employeeDTO.getEmail());
//		System.out.println("Phone : "+employeeDTO.getPhone());
//		System.out.println("Age : "+employeeDTO.getAge());
//		System.out.println("Salary: "+employeeDTO.getSalary());
//		System.out.println("DOB : "+employeeDTO.getDob());
//		System.out.println("Gender : "+employeeDTO.getGender());
//		System.out.println("Joining_day : "+employeeDTO.getJoining_date());
//		System.out.println("Dept_no : "+employeeDTO.getDept_no());
//		System.out.println("Desigantion : "+employeeDTO.getDesignation());
//		System.out.println("Experience : "+employeeDTO.getExperience());

		// getAllEmp
//		ArrayList<EmployeeDTO> employee=employeeDAOJDBC.getAllEmp();
//		for(EmployeeDTO employeeDTO:employee) {
//		System.out.print("Id: \t"+employeeDTO.getId());
//		System.out.print("\t Name: "+employeeDTO.getName());
//		System.out.print("\t Email : "+employeeDTO.getEmail());
//		System.out.print("\t Phone : "+employeeDTO.getPhone());
//		System.out.print("\t Age : "+employeeDTO.getAge());
//		System.out.print("\t Salary: "+employeeDTO.getSalary());
//		System.out.print("\t DOB : "+employeeDTO.getDob());
//		System.out.print("\t Gender : "+employeeDTO.getGender());
//		System.out.print("\t Joining_day : "+employeeDTO.getJoining_date());
//		System.out.print("\t Dept_no : "+employeeDTO.getDept_no());
//		System.out.print("\t Desigantion : "+employeeDTO.getDesignation());
//		System.out.print("\t Experience : "+employeeDTO.getExperience());
//		System.out.println();
//		}
		
		
		EmployeeDAOHibernate employeeDAOHibernate = new EmployeeDAOHibernate();

		// update
		EmployeeDTO employeeDTO=new EmployeeDTO();
		employeeDTO.setId(34);
		employeeDTO.setName("Bhuvi");
		employeeDTO.setEmail("bhuvi@gmail.com");
		employeeDTO.setPhone(7894561236L);
		employeeDTO.setAge(54);
		employeeDTO.setSalary(4654.86);
		employeeDTO.setDob(Date.valueOf("2012-05-02"));
		employeeDTO.setGender("male");
		employeeDTO.setJoining_date(Date.valueOf("2025-05-02"));
		employeeDTO.setDept_no(20);
		employeeDTO.setDesignation("manager");
		employeeDTO.setExperience(4);
		System.out.println(employeeDAOHibernate.updateEmp(employeeDTO));

		// save
//		EmployeeDTO employeeDTO=new EmployeeDTO();
//		employeeDTO.setId(10);
//		employeeDTO.setName("Bhuvi");
//		employeeDTO.setEmail("bhuvi@gmail.com");
//		employeeDTO.setPhone(7894561236L);
//		employeeDTO.setAge(54);
//		employeeDTO.setSalary(4654.86);
//		employeeDTO.setDob(Date.valueOf("2012-05-02"));
//		employeeDTO.setGender("male");
//		employeeDTO.setJoining_date(Date.valueOf("2025-05-02"));
//		employeeDTO.setDept_no(20);
//		employeeDTO.setDesignation("manager");
//		employeeDTO.setExperience(4);
//		System.out.println(employeeDAOHibernate.saveEmp(employeeDTO)); 

		// saveOrUpdate
//		EmployeeDTO employeeDTO=new EmployeeDTO();
//		employeeDTO.setId(14);
//		employeeDTO.setName("Bhuvi");
//		employeeDTO.setEmail("bhuvi@gmail.com");
//		employeeDTO.setPhone(7894561236L);
//		employeeDTO.setAge(54);
//		employeeDTO.setSalary(4654.86);
//		employeeDTO.setDob(Date.valueOf("2012-05-02"));
//		employeeDTO.setGender("male");
//		employeeDTO.setJoining_date(Date.valueOf("2025-05-02"));
//		employeeDTO.setDept_no(20);
//		employeeDTO.setDesignation("manager");
//		employeeDTO.setExperience(4);
//		System.out.println(employeeDAOHibernate.saveOrUpdateEmp(employeeDTO,true)); 

		// delete
//		System.out.println(employeeDAOJDBC.deleteEmp(2));

		// getEmpById
//		EmployeeDTO employeeDTO=employeeDAOJDBC.getEmpById(10);
//		System.out.println("Id: "+employeeDTO.getId());
//		System.out.println("Name: "+employeeDTO.getName());
//		System.out.println("Email : "+employeeDTO.getEmail());
//		System.out.println("Phone : "+employeeDTO.getPhone());
//		System.out.println("Age : "+employeeDTO.getAge());
//		System.out.println("Salary: "+employeeDTO.getSalary());
//		System.out.println("DOB : "+employeeDTO.getDob());
//		System.out.println("Gender : "+employeeDTO.getGender());
//		System.out.println("Joining_day : "+employeeDTO.getJoining_date());
//		System.out.println("Dept_no : "+employeeDTO.getDept_no());
//		System.out.println("Desigantion : "+employeeDTO.getDesignation());
//		System.out.println("Experience : "+employeeDTO.getExperience());

		// getAllEmp
//		List<EmployeeDTO> employee=employeeDAOHibernate.getAllEmp();
//		for(EmployeeDTO employeeDTO:employee) {
//		System.out.print("Id: \t"+employeeDTO.getId());
//		System.out.print("\t Name: "+employeeDTO.getName());
//		System.out.print("\t Email : "+employeeDTO.getEmail());
//		System.out.print("\t Phone : "+employeeDTO.getPhone());
//		System.out.print("\t Age : "+employeeDTO.getAge());
//		System.out.print("\t Salary: "+employeeDTO.getSalary());
//		System.out.print("\t DOB : "+employeeDTO.getDob());
//		System.out.print("\t Gender : "+employeeDTO.getGender());
//		System.out.print("\t Joining_day : "+employeeDTO.getJoining_date());
//		System.out.print("\t Dept_no : "+employeeDTO.getDept_no());
//		System.out.print("\t Desigantion : "+employeeDTO.getDesignation());
//		System.out.print("\t Experience : "+employeeDTO.getExperience());
//		System.out.println();
//		} 
	}
}
