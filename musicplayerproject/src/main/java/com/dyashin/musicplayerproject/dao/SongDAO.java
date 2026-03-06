package com.dyashin.musicplayerproject.dao;
import java.sql.SQLException;
import java.util.List;

import com.dyashin.musicplayerproject.dto.SongDTO;

public interface SongDAO {
	public boolean addSong(SongDTO songDTO) throws SQLException;
	public boolean updateSong(SongDTO songDTO) throws SQLException;
	public boolean deleteSong(int id) throws SQLException;
    public SongDTO getSongById(int id) throws SQLException;
    public List<SongDTO> getAllSongs() throws SQLException;
}  