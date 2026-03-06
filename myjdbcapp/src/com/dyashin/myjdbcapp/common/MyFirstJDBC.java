package com.dyashin.myjdbcapp.common;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class MyFirstJDBC {

	public static void main(String[] args) throws ClassNotFoundException {

		Connection conn = null;
		ResultSet rs = null;
		Statement stmt = null;

		// 1.Load the Driver
		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

			//2. get the db connection via driver
			String dburl = "jdbc:mysql://localhost:3306/dyashin_sql?user=root&password=admin@123";
			System.out.println("dburl>>" + dburl);
			conn = DriverManager.getConnection(dburl);

			//3. issue the sql queries via conn
			String query = "select * from employee_info";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);

			//4. process the result returned by sql
			while (rs.next()) {
				String employeeID = rs.getString("EMP_Id");
				String employeeFName = rs.getString("F_NAME");
				String employeeLName = rs.getString("L_NAME");
				String employeeMName = rs.getString("M_NAME");
				String employeeEmail = rs.getString("EMAIL");
				String employeePhone = rs.getString("PHONE");
				int employeeAge = rs.getInt("AGE");
				double employeeSalary = rs.getDouble("SALARY");
				Date employeeDOB = rs.getDate("DOB");
				String employeeGender = rs.getString("GENDER");
				Date employeeJoiningDate = rs.getDate("JOINING_DATE");
				int employeeDeptNo = rs.getInt("DEPT_NO");
				String employeeDesignation = rs.getString("DESIGNATION");
				int employeeExperience = rs.getInt("EXPERIENCE");
				
				System.out.println("Employee ID ===> " + employeeID);
				System.out.println("Employee FirstName ===> " + employeeFName);
				System.out.println("Employee LastName ===> " + employeeLName);
				System.out.println("Employee MiddleName ===> " + employeeMName);
				System.out.println("Employee Email===> " + employeeEmail);
				System.out.println("Employee PhoneNumber===> " + employeePhone);
				System.out.println("Employee Age===> " + employeeAge);
				System.out.println("Employee Salary===> " + employeeSalary);
				System.out.println("Employee DateOfBirth===> " + employeeDOB);
				System.out.println("Employee Gender===> " + employeeGender);
				System.out.println("Employee JoiningDate===> " + employeeJoiningDate);
				System.out.println("Employee DeptNumber===> " + employeeDeptNo);
				System.out.println("Employee Designation===> " + employeeDesignation);
				System.out.println("Employee Experience===> " + employeeExperience);

				
		}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
