package com.dyashin.musicplayerproject.dao;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

import com.dyashin.musicplayerproject.dto.SongDTO;
import com.mysql.cj.jdbc.Driver;

public class SongDAOJDBCImpl implements SongDAO, DBQueries {

	private static String dbUrl;
    private static String dbUsername;
    private static String dbPassword;

    static {
        try {
            InputStream input = SongDAOJDBCImpl.class.getClassLoader().getResourceAsStream("config.properties");
            if (input == null) {
                throw new RuntimeException("Unable to find config.properties");
            }

            Properties props = new Properties();
            props.load(input);

            dbUrl = props.getProperty("db.url");
            dbUsername = props.getProperty("db.username");
            dbPassword = props.getProperty("db.password");

            DriverManager.registerDriver(new Driver());

            System.out.println("Database configuration loaded successfully.");

        } catch (Exception e) {
            e.printStackTrace();
            throw new ExceptionInInitializerError("Failed to load database configuration: " + e.getMessage());
        }
    }
	
	private Connection connection = null;
	private PreparedStatement preparedStatement = null;
	private Statement statement = null;
	private ResultSet resultSet = null;

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
		connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
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

	@Override
	public boolean addSong(SongDTO songDTO) throws SQLException {
		connection = getConnection();
		boolean isInserted = false;
		int result = 0;
		preparedStatement = connection.prepareStatement(QRY_ADD);
		preparedStatement.setInt(1, songDTO.getId());
		preparedStatement.setString(2, songDTO.getName());
		preparedStatement.setInt(3, songDTO.getYear());
		result = preparedStatement.executeUpdate();
		if (result == 1) {
			isInserted = true;
		}
		close();
		return isInserted;
	}

	@Override
	public boolean updateSong(SongDTO songDTO) throws SQLException {
		boolean isUpdate = false;
		int result = 0;
		connection = getConnection();
		preparedStatement = connection.prepareStatement(QRY_UPDATE);
		preparedStatement.setString(1, songDTO.getName());
		preparedStatement.setInt(2, songDTO.getYear());
		preparedStatement.setInt(3, songDTO.getId());
		result = preparedStatement.executeUpdate();
		if (result == 1) {
			isUpdate = true;
		}
		close();
		return isUpdate;
	}

	@Override
	public boolean deleteSong(int id) throws SQLException {
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

	@Override
	public SongDTO getSongById(int id) throws SQLException {
		SongDTO songDTO = null;
		connection = getConnection();
		preparedStatement = connection.prepareStatement(QRY_GET_SONG_BY_ID);
		preparedStatement.setInt(1, id);
		resultSet = preparedStatement.executeQuery();
		if (resultSet.next()) {
			songDTO = new SongDTO();
			songDTO.setId(resultSet.getInt("id"));
			songDTO.setName(resultSet.getString("name"));
			songDTO.setYear(resultSet.getInt("year"));
		}
		close();
		return songDTO;
	}

	@Override
	public ArrayList<SongDTO> getAllSongs() throws SQLException {
		ArrayList<SongDTO> data = new ArrayList<SongDTO>();
		connection = getConnection();
		statement = connection.createStatement();
		resultSet = statement.executeQuery(QRY_GET_ALL_SONGS);
		while (resultSet.next()) {
			SongDTO songDTO = new SongDTO();
			songDTO.setId(resultSet.getInt("id"));
			songDTO.setName(resultSet.getString("name"));
			songDTO.setYear(resultSet.getInt("year"));
			data.add(songDTO);
		}
		close();
		return data;
	}

}
