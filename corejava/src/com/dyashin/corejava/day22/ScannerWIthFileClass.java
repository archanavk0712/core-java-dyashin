package com.dyashin.corejava.day22;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerWIthFileClass {

	public static void main(String[] args) {

		Scanner scanner = null;
		File file=new File("abc.txt");
		
		try {
			scanner=new Scanner(file);
			while(scanner.hasNextLine()) {
				String reading=(String) scanner.next();
				System.out.println("reading: "+reading);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			scanner.close();
		}
		
	}

}
