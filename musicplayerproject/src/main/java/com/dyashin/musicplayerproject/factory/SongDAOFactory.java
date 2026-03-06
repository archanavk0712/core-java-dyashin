package com.dyashin.musicplayerproject.factory;

import com.dyashin.musicplayerproject.dao.SongDAO;
import com.dyashin.musicplayerproject.dao.SongDAOHibernateImpl;
import com.dyashin.musicplayerproject.dao.SongDAOJDBCImpl;
public class SongDAOFactory {
	private SongDAOFactory() {}
	
	public static SongDAO getDAOInstance(String type) {
		if(type.equalsIgnoreCase("JDBC")) {
			return new SongDAOJDBCImpl();
		}else if(type.equalsIgnoreCase("Hibernate")) {
			return new SongDAOHibernateImpl();
		}
		return null;
	}
}
