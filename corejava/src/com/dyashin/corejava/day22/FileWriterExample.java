package com.dyashin.corejava.day22;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args)  {
		
		FileWriter fw=null;
		try {
			fw = new FileWriter("xyz.txt");
			
			//2.Write data to the file
			fw.write("Hello");
			fw.write("Hi");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			
			//3. Close the writer to save data
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	System.out.println("Data written successfully");		
	}
}
