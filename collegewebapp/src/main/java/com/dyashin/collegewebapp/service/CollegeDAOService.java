package com.dyashin.collegewebapp.service;

import java.util.List;
import java.util.Optional;

import com.dyashin.collegewebapp.dto.CollegeDTO;
import com.dyashin.collegewebapp.exception.CollegeException;


public interface CollegeDAOService {

	List<CollegeDTO> getAll() throws CollegeException;

	Optional<CollegeDTO> getById(int id) throws CollegeException;

	boolean save(CollegeDTO collegeDTO) throws CollegeException;

	boolean modify(CollegeDTO collegeDTO, int id) throws CollegeException;

	boolean deleteById(int id) throws CollegeException;

	boolean saveOrUpdate(CollegeDTO collegeDTO, int id) throws CollegeException;

	long countOfClg() throws CollegeException;

	double minFee() throws CollegeException;

	double maxFee() throws CollegeException;

	double avgFee() throws CollegeException;

	List<CollegeDTO> getByName(String name) throws CollegeException;

	List<CollegeDTO> getByLocation(String location) throws CollegeException;

	List<CollegeDTO> getByUniversity(String university) throws CollegeException;
}
