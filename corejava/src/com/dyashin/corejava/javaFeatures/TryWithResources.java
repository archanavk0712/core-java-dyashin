package com.dyashin.corejava.javaFeatures;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

class Demo implements AutoCloseable{

	@Override
	public void close() throws Exception {
	}
	
}
public class TryWithResources {

	public static void main(String[] args) throws Exception {
		
		File f= new File("abc.txt");
		FileReader fr= new FileReader(f);
		try(BufferedReader br= new BufferedReader(fr);
				Demo d = new Demo()){
			br.read();
		}
	}
}
