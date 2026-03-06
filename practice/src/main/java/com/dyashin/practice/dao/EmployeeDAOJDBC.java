package com.dyashin.practice.dao;

import static com.dyashin.practice.dao.DBQueries.DBURL;
import static com.dyashin.practice.dao.DBQueries.QRY_DELETE;
import static com.dyashin.practice.dao.DBQueries.QRY_GET_ALL_EMP;
import static com.dyashin.practice.dao.DBQueries.QRY_GET_EMP_BY_ID;
import static com.dyashin.practice.dao.DBQueries.QRY_SAVE;
import static com.dyashin.practice.dao.DBQueries.QRY_UPDATE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.dyashin.practice.dto.EmployeeDTO;
import com.mysql.cj.jdbc.Driver;

public class EmployeeDAOJDBC implements EmployeeDAO {
	private Connection connection = null;
	private PreparedStatement preparedStatement = null;
	private Statement statement = null;
	private ResultSet resultSet = null;
	private EmployeeDTO employeeDTO = new EmployeeDTO();

	/**
	 * Used to establish the connection between the JAVA application and RDBMS
	 * application
	 * 
	 * @return
	 * @throws SQLException
	 */
	private Connection getConnection() throws SQLException {
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		connection = DriverManager.getConnection(DBURL);
		return connection;
	}

	/**
	 * Used to close all the resources
	 * 
	 * @return
	 * @throws SQLException
	 */
	private void close() throws SQLException {
		if (resultSet != null) {
			resultSet.close();
		}
		if (statement != null) {
			statement.close();
		}
		if (preparedStatement != null) {
			preparedStatement.close();
		}
		if (connection != null) {
			connection.close();
		}
	}

	/**
	 * Updates the data in the database
	 * 
	 * @return
	 * @throws SQLException
	 */
	// Update
	public boolean updateEmp(EmployeeDTO employeeDTO) throws SQLException {
		boolean isUpdate = false;
		int result = 0;
		connection = getConnection();
		preparedStatement = connection.prepareStatement(QRY_UPDATE);
		preparedStatement.setString(1, employeeDTO.getName());
		preparedStatement.setString(2, employeeDTO.getEmail());
		preparedStatement.setLong(3, employeeDTO.getPhone());
		preparedStatement.setInt(4, employeeDTO.getAge());
		preparedStatement.setDouble(5, employeeDTO.getSalary());
		preparedStatement.setDate(6, employeeDTO.getDob());
		preparedStatement.setString(7, employeeDTO.getGender());
		preparedStatement.setDate(8, employeeDTO.getJoining_date());
		preparedStatement.setInt(9, employeeDTO.getDept_no());
		preparedStatement.setString(10, employeeDTO.getDesignation());
		preparedStatement.setInt(11, employeeDTO.getExperience());
		preparedStatement.setInt(12, employeeDTO.getId());
		result = preparedStatement.executeUpdate();
		if (result == 1) {
			isUpdate = true;
		}
		close();
		return isUpdate;
	}

	/**
	 * Save the data in the database
	 * 
	 * @return
	 * @throws SQLException
	 */
	// save
	public boolean saveEmp(EmployeeDTO employeeDTO) throws SQLException {
		connection = getConnection();
		boolean isInserted = false;
		int result = 0;
		preparedStatement = connection.prepareStatement(QRY_SAVE);
		preparedStatement.setString(1, employeeDTO.getName());
		preparedStatement.setString(2, employeeDTO.getEmail());
		preparedStatement.setLong(3, employeeDTO.getPhone());
		preparedStatement.setInt(4, employeeDTO.getAge());
		preparedStatement.setDouble(5, employeeDTO.getSalary());
		preparedStatement.setDate(6, employeeDTO.getDob());
		preparedStatement.setString(7, employeeDTO.getGender());
		preparedStatement.setDate(8, employeeDTO.getJoining_date());
		preparedStatement.setInt(9, employeeDTO.getDept_no());
		preparedStatement.setString(10, employeeDTO.getDesignation());
		preparedStatement.setInt(11, employeeDTO.getExperience());
		preparedStatement.setInt(12, employeeDTO.getId());
		result = preparedStatement.executeUpdate();
		if (result == 1) {
			isInserted = true;
		}
		close();
		return isInserted;
	}

	/**
	 * Used to Update or Save the employee details
	 * 
	 * @return
	 * @throws SQLException
	 */
	// save or update
	public boolean saveOrUpdateEmp(EmployeeDTO employeeDTO, boolean isUpdate) throws SQLException {
		if (isUpdate == true) {
			return updateEmp(employeeDTO);
		} else {
			return saveEmp(employeeDTO);
		}
	}

	/**
	 * Used to delete an Employee detail for the given employee id
	 * 
	 * @return
	 * @throws SQLException
	 */
	// delete
	public boolean deleteEmp(int id) throws SQLException {
		connection = getConnection();
		boolean isDeleted = false;
		int result = 0;
		preparedStatement = connection.prepareStatement(QRY_DELETE);
		preparedStatement.setInt(1, id);
		result = preparedStatement.executeUpdate();
		if (result == 1) {
			isDeleted = true;
		}
		close();
		return isDeleted;
	}

	/**
	 * Used to get the Employee details for the given employee id
	 * 
	 * @return
	 * @throws SQLException
	 */
	// getEmpById
	public EmployeeDTO getEmpById(int id) throws SQLException {
		connection = getConnection();
		preparedStatement = connection.prepareStatement(QRY_GET_EMP_BY_ID);
		preparedStatement.setInt(1, id);
		resultSet = preparedStatement.executeQuery();
		if (resultSet.next()) {
			employeeDTO.setId(resultSet.getInt("id"));
			employeeDTO.setName(resultSet.getString("name"));
			employeeDTO.setEmail(resultSet.getString("email"));
			employeeDTO.setPhone(resultSet.getLong("phone"));
			employeeDTO.setAge(resultSet.getInt("age"));
			employeeDTO.setSalary(resultSet.getDouble("salary"));
			employeeDTO.setDob(resultSet.getDate("dob"));
			employeeDTO.setGender(resultSet.getString("gender"));
			employeeDTO.setJoining_date(resultSet.getDate("joining_date"));
			employeeDTO.setDept_no(resultSet.getInt("dept_no"));
			employeeDTO.setDesignation(resultSet.getString("designation"));
			employeeDTO.setExperience(resultSet.getInt("experience"));
		}
		close();
		return employeeDTO;
	}

	/**
	 * Used to get all the Employee details
	 * 
	 * @return
	 * @throws SQLException
	 */
	// getAllEmp
	public ArrayList<EmployeeDTO> getAllEmp() throws SQLException {
		ArrayList<EmployeeDTO> data = new ArrayList<EmployeeDTO>();
		connection = getConnection();
		statement = connection.createStatement();
		resultSet = statement.executeQuery(QRY_GET_ALL_EMP);
		while (resultSet.next()) {
			employeeDTO.setId(resultSet.getInt("id"));
			employeeDTO.setName(resultSet.getString("name"));
			employeeDTO.setEmail(resultSet.getString("email"));
			employeeDTO.setPhone(resultSet.getLong("phone"));
			employeeDTO.setAge(resultSet.getInt("age"));
			employeeDTO.setSalary(resultSet.getDouble("salary"));
			employeeDTO.setDob(resultSet.getDate("dob"));
			employeeDTO.setGender(resultSet.getString("gender"));
			employeeDTO.setJoining_date(resultSet.getDate("joining_date"));
			employeeDTO.setDept_no(resultSet.getInt("dept_no"));
			employeeDTO.setDesignation(resultSet.getString("designation"));
			employeeDTO.setExperience(resultSet.getInt("experience"));
			data.add(employeeDTO);
		}
		close();
		return data;
	}
}
