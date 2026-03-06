package com.dyashin.musicplayerproject.dao;

public interface DBQueries {
	String DBURL = "jdbc:mysql://localhost:3306/dyashin_sql?user=root&password=admin@123";
	String QRY_UPDATE = "update songs set name=?, year=? where id=?";
	String QRY_ADD = "insert into songs values(?,?,?)";
	String QRY_DELETE = "delete from  songs where id=?";
	String QRY_GET_SONG_BY_ID = "select * from songs where id=?";
	String QRY_GET_ALL_SONGS = "select * from songs";
}
