package com.dyashin.librarymanagementsystemhibernate.controller;

import java.util.List;
import java.util.Scanner;

import com.dyashin.librarymanagementsystemhibernate.dao.LibraryDAO;
import com.dyashin.librarymanagementsystemhibernate.dao.LibraryDAOImpl;
import com.dyashin.librarymanagementsystemhibernate.dto.LibraryDTO;
import com.dyashin.librarymanagementsystemhibernate.validation.LibraryValidation;

public class LibraryController {

	public static void main(String[] args) {

		LibraryDAO libraryDAO = new LibraryDAOImpl();
		int choice;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter " + "1. Insert" + "2. Display all record" + "3. Update record" + "4. Delete"
				+ "5. Read record by ID");
		choice = in.nextInt();
		switch (choice) {
		case 1: {
			String bookName;
			System.out.println("Enter bookName:");
			bookName = in.nextLine();
			LibraryValidation.validateBookName(bookName);
			try {
				LibraryDTO libraryDTO = new LibraryDTO();

				libraryDTO.setBookName(bookName);
				boolean saved = libraryDAO.save(libraryDTO);
				if (saved) {
					System.out.println("Data inserted sucessfully");
				} else {
					System.out.println("Unable to insert data");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		case 2: {
			try {
				LibraryDTO libraryDTO = new LibraryDTO();
				List<LibraryDTO> list = libraryDAO.getAll();
				if (list != null) {
					System.out.println("Data fetched sucessfuly");
					for (LibraryDTO n : list) {
						System.out.println("Id: " + libraryDTO.getId());
						System.out.println("Name: " + libraryDTO.getBookName());
					}
				} else {
					System.out.println("Unable to fetch data");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		case 3: {
			int id;
			String bookName;
			System.out.println("Enter id:");
			id = in.nextInt();
			System.out.println("Enter book name:");
			bookName = in.nextLine();
			LibraryValidation.validateLibrary(id, bookName);
			try {
				LibraryDTO libraryDTO = new LibraryDTO();

				libraryDTO.setId(id);
				libraryDTO.setBookName(bookName);

				boolean updated = libraryDAO.update(libraryDTO);
				if (updated) {
					System.out.println("Updated sucessfully");
				} else {
					System.out.println("Unable to update");
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		case 4: {
			int id;
			System.out.println("Enter id: to delete");
			id = in.nextInt();
			try {
				boolean deleted = libraryDAO.delete(id);
				if (deleted) {
					System.out.println("Data delete sucessfully");
				} else {
					System.out.println("Unable to delete data");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		case 5:
			try {
				int id;
				System.out.println("Enter id: to delete");
				id = in.nextInt();
				LibraryDTO libraryDTO = new LibraryDTO();
				LibraryDTO data = libraryDAO.getById(id);
				if (data != null) {
					System.out.println("Data fetched sucessfuly");
					System.out.println("Id: " + libraryDTO.getId());
					System.out.println("Name: " + libraryDTO.getBookName());
				} else {
					System.out.println("Unable to fetch data");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		default:
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}
	}
}
