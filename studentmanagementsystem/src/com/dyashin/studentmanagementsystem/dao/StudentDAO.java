package com.dyashin.studentmanagementsystem.dao;

import java.util.List;

import com.dyashin.studentmanagementsystem.dto.StudentDTO;

public interface StudentDAO {

	void add(StudentDTO studentDTO);
	
	void update(StudentDTO studentDTO);
	
	void delete(int id);
	
	StudentDTO getById(int id);
	
	List<StudentDTO> getAll();
	
	List<StudentDTO> percentageMarks(int minPerc, int maxPerc);
	
}
