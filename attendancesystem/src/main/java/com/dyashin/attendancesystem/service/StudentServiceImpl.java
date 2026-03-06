package com.dyashin.attendancesystem.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.dyashin.attendancesystem.dto.StudentDTO;
import com.dyashin.attendancesystem.entity.Student;
import com.dyashin.attendancesystem.repository.AttendanceRepo;
import com.dyashin.attendancesystem.repository.StudentRepo;

public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepo studentRepo;

	@Autowired
	AttendanceRepo attendanceRepo;

	@Override
	public void addStudent(StudentDTO studentDTO) {
		Student student = new Student();
		student.setStudentName(studentDTO.getStudentName());
		studentRepo.save(student);
	}

}
