package com.dyashin.corejava.day22;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryWithResource {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(new File("abc.txt"))) {
			while (scanner.hasNextLine()) {
				String reading = (String) scanner.next();
				System.out.println("reading: " + reading);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}