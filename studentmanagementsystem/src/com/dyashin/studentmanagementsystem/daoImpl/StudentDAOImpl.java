package com.dyashin.studentmanagementsystem.daoImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.dyashin.studentmanagementsystem.dao.StudentDAO;
import com.dyashin.studentmanagementsystem.dto.StudentDTO;

public class StudentDAOImpl implements StudentDAO {

	public StudentDAOImpl() {
		student.put(1, new StudentDTO(1, "Rahul", "10th", 80));
		student.put(2, new StudentDTO(2, "Sneha", "9th", 90));
		student.put(3, new StudentDTO(3, "Arjun", "8th", 40));
		student.put(4, new StudentDTO(4, "Meera", "10th", 90));
	}

	Map<Integer, StudentDTO> student = new TreeMap<Integer, StudentDTO>();

	@Override
	public void add(StudentDTO studentDTO) {
		student.put(studentDTO.getId(), studentDTO);
	}

	@Override
	public void update(StudentDTO studentDTO) {
		student.put(studentDTO.getId(), studentDTO);
	}

	@Override
	public void delete(int id) {
		if (!student.containsKey(id)) {
			System.out.println("No student found with id: " + id);
		}
		student.remove(id);
	}

	@Override
	public StudentDTO getById(int id) {
		return student.get(id);
	}

	@Override
	public List<StudentDTO> getAll() {
		return new ArrayList<>(student.values());
	}

	@Override
	public List<StudentDTO> percentageMarks(int minPerc, int maxPerc) {
		List<StudentDTO> list = new ArrayList<StudentDTO>();
		for (StudentDTO studentDTO : student.values()) {
			if (studentDTO.getPercentage() >= minPerc && studentDTO.getPercentage() <= maxPerc) {
				list.add(studentDTO);
			}
		}
		return list;
	}

}