package com.dyashin.collegewebapp.dao;

import java.util.List;
import java.util.Optional;

import com.dyashin.collegewebapp.dto.CollegeDTO;


public interface CollegeDAO {

	List<CollegeDTO> getAll();

	Optional<CollegeDTO> getById(int id);

	boolean save(CollegeDTO collegeDTO);

	boolean modify(CollegeDTO collegeDTO, int id);

	boolean deleteById(int id);

	boolean saveOrUpdate(CollegeDTO collegeDTO, int id);

	long countOfClg();

	double minFee();

	double maxFee();

	double avgFee();

	List<CollegeDTO> getByName(String name);

	List<CollegeDTO> getByLocation(String location);

	List<CollegeDTO> getByUniversity(String university);

}
