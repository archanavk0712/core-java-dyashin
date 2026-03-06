package com.dyashin.librarymanagementsystemhibernate.validation;

import com.dyashin.librarymanagementsystemhibernate.exception.LibraryException;

public class LibraryValidation {
	public static void validateId(int id) {
		if (id <= 0) {
			throw new LibraryException("Id must be positive");
		}
	}

	public static void validateBookName(String BookName) {
		if (BookName == null) {
			throw new LibraryException("BookName cannot be empty");
		}
	}

	public static void validateLibrary(int id, String BookName) {
		if (id <= 0) {
			throw new LibraryException("Id must be positive");
		}
		if (BookName == null) {
			throw new LibraryException("BookName cannot be empty");
		}
	}
}
