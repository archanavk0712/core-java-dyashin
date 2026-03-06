package com.dyashin.corejava.day22;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

	public static void main(String[] args) {

		int i;
		try {

			FileReader fr = new FileReader("abc.txt");

			while ((i = fr.read()) != -1) {
				System.out.print((char) i); 
			}

			fr.close();
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}