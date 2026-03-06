package com.dyashin.corejava.javaFeatures;

import java.util.List;

public class VarJavaFeature {

	public static void main(String[] args) {
		
		var name="Archana";
		var list= List.of("a","b");
		var no=1;
		System.out.println(name);
		for(no=1; no<=5; no++) {
			System.out.print(no+" ");
		}
	}
}
