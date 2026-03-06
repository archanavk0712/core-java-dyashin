package com.dyashin.musicplayerproject.controller;

import com.dyashin.musicplayerproject.dao.SongDAO;
import com.dyashin.musicplayerproject.dto.SongDTO;
import com.dyashin.musicplayerproject.factory.SongDAOFactory;
import static com.dyashin.musicplayerproject.dao.DBInteractionType.TYPE;

import java.sql.SQLException;
import java.util.List;

public class SongDisplayData {
	public static void main(String[] args) {
	
		SongDAO songDao=SongDAOFactory.getDAOInstance(TYPE);
		
		//update
		try {
			SongDTO songDTO=new SongDTO();
			songDTO.setId(167);
			songDTO.setName("Despacito");
			songDTO.setYear(2019);
			System.out.println(songDao.updateSong(songDTO));
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		//add
		try {
			SongDTO songDTO=new SongDTO();
			songDTO.setId(1);
			songDTO.setName("Shape of you");
			songDTO.setYear(2020);
			System.out.println(songDao.addSong(songDTO));
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		//delete
		try {
			System.out.println(songDao.deleteSong(14));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//getSongById
		try {
			SongDTO songDTO=songDao.getSongById(1);
			if(songDTO!=null) {
				System.out.println(songDTO);
			}else {
				System.err.println("Song not found");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		//getAllSongs
		try {
			List<SongDTO> song =songDao.getAllSongs();
			for(SongDTO songDTO:song) {
				System.out.print("Id: \t"+songDTO.getId());
				System.out.print("\t Name: "+songDTO.getName());
				System.out.print("\t Year : "+songDTO.getYear());
				System.out.println();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
