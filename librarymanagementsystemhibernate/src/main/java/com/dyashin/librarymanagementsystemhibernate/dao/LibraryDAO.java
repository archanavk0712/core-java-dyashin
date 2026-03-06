package com.dyashin.librarymanagementsystemhibernate.dao;

import java.util.List;

import com.dyashin.librarymanagementsystemhibernate.dto.LibraryDTO;

public interface LibraryDAO {
	
	boolean save(LibraryDTO libraryDTO);
	
	List<LibraryDTO> getAll();
	
	boolean update (LibraryDTO libraryDTO);
	
	boolean delete (int id);
	
	LibraryDTO getById(int id);
}	
