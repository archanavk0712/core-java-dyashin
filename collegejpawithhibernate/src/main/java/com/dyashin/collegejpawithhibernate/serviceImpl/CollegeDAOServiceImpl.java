package com.dyashin.collegejpawithhibernate.serviceImpl;

import java.util.List;
import java.util.Optional;

import com.dyashin.collegejpawithhibernate.dao.CollegeDAO;
import com.dyashin.collegejpawithhibernate.daoImpl.CollegeDAOJpaWithHibernateImpl;
import com.dyashin.collegejpawithhibernate.dto.CollegeDTO;
import com.dyashin.collegejpawithhibernate.service.CollegeDAOService;

public class CollegeDAOServiceImpl implements CollegeDAOService {

	private CollegeDAO dao = new CollegeDAOJpaWithHibernateImpl();

	@Override
	public boolean save(CollegeDTO college) {
		return dao.save(college);
	}

	@Override
	public boolean modify(CollegeDTO college, int id) {
		return dao.saveOrUpdate(college, id);
	}

	@Override
	public boolean deleteById(int id) {
		return dao.deleteById(id);
	}

	@Override
	public Optional<CollegeDTO> getById(int id) {
		return dao.getById(id);
	}

	@Override
	public List<CollegeDTO> getByName(String name) {
		return dao.getByName(name);
	}

	@Override
	public List<CollegeDTO> getByLocation(String location) {
		return dao.getByLocation(location);
	}

	@Override
	public List<CollegeDTO> getByUniversity(String university) {
		return dao.getByUniversity(university);
	}

	@Override
	public long countOfClg() {
		return dao.countOfClg();
	}

	@Override
	public double minFee() {
		return dao.minFee();
	}

	@Override
	public double maxFee() {
		return dao.maxFee();
	}

	@Override
	public double avgFee() {
		return dao.avgFee();
	}

	@Override
	public List<CollegeDTO> getAll() {
		return dao.getAll();
	}

	@Override
	public boolean saveOrUpdate(CollegeDTO collegeDTO, int id) {
		return dao.saveOrUpdate(collegeDTO, id);
	}
}