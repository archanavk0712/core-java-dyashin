package com.dyashin.studentmanagementsystem.controller;

import java.util.List;

import com.dyashin.studentmanagementsystem.dao.StudentDAO;
import com.dyashin.studentmanagementsystem.daoImpl.StudentDAOImpl;
import com.dyashin.studentmanagementsystem.dto.StudentDTO;
import com.dyashin.studentmanagementsystem.util.StudentUtil;

public class StudentController {

	public static void main(String[] args) {

		StudentDAO studentDAO = new StudentDAOImpl();

		// add
		int id = StudentUtil.getInt("Enter student ID:");
		String name = StudentUtil.getString("Enter Student Name:");
		String standard = StudentUtil.getString("Enter Student standard:");
		int percentage = StudentUtil.getInt("Enter Student percentage:");

		StudentDTO student = new StudentDTO(id, name, standard, percentage);
		studentDAO.add(student);
		System.out.println("Student Added Successfully");

		// update
		
		int updateId = StudentUtil.getInt("Enter student ID to update:");
		String newName = StudentUtil.getString("Enter Student Name to update:");
		String newStandard = StudentUtil.getString("Enter Student standard to update:");
		int newPercentage = StudentUtil.getInt("Enter Student percentage to update:");
		
		StudentDTO updatedStudent = new StudentDTO(updateId, newName, newStandard, newPercentage);
		studentDAO.update(updatedStudent);
		System.out.println("Student Updated Successfully");

		// getById
		int viewId = StudentUtil.getInt("Enter student ID to view:");

		StudentDTO found = studentDAO.getById(viewId);
		System.out.println("Student Found: "+found);

		// getAll
		List<StudentDTO> students = studentDAO.getAll();
		System.out.println("All Students:");
		for(StudentDTO s: students) {
			System.out.println(s);
		}

		// delete
		int deleteId = StudentUtil.getInt("Enter student ID to delete:");

		studentDAO.delete(deleteId);
		System.out.println("Student Deleted Successfully\n");

		System.out.println("Students After Deletion:");
		List<StudentDTO> s = studentDAO.getAll();

		for (int i = 0; i < s.size(); i++) {
		    System.out.println(students.get(i));
		}

		// percentage>80 , <90
		int minPerc= StudentUtil.getInt("Enter the min percentage");
		int maxPerc= StudentUtil.getInt("Enter the max percentage");
		
		System.out.println("Student whose percentage are greater than "+minPerc+" and less than "+maxPerc+" are" );
		
		List<StudentDTO> si=studentDAO.percentageMarks(minPerc, maxPerc);
		for(StudentDTO stu: si) {
			System.out.println(stu);
		}
	}
}

