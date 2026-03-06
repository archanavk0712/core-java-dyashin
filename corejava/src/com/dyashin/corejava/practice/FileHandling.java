package com.dyashin.corejava.practice;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) {
		File f = new File("file.txt");
		FileWriter fw = null;
		FileReader fr=null;
		try {
//			if(f.createNewFile()) {
//				System.out.println("File created successfully");
//			}else {
//				System.out.println("File not created");
//			}
			fw = new FileWriter("file.txt");
			fw.write("Hi");
			
			fr=new FileReader("file.txt");
			System.out.println(fr.read());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
