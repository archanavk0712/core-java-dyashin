package com.dyashin.corejava.day22;

import java.io.File;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) throws IOException{

		File f=new File("abc.txt");
		
		if(f.createNewFile()) {
			System.out.println("File created successfully");
		}else {
			System.out.println("File already present");
		}
	}

}
