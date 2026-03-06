package com.dyashin.practice.dao;

public interface DBQueries {
	String DBURL = "jdbc:mysql://localhost:3306/dyashin_sql?user=root&password=admin@123";
	String QRY_UPDATE = "update employee set name=?, email=?, phone=?,age=?, salary=?, dob=?,"
							+ " gender=?, joining_date=?, dept_no=?, designation=?, experience=? where id=?";
	String QRY_SAVE = "insert into employee(name,email,phone,age,salary,dob,gender,"
							+ "joining_date,dept_no,designation,experience,id) values(?,?,?,?,?,?,?,?,?,?,?,?)";
	String QRY_DELETE = "delete from  employee where id=?";
	String QRY_GET_EMP_BY_ID = "select * from employee where id=?";
	String QRY_GET_ALL_EMP = "select * from employee";
}
