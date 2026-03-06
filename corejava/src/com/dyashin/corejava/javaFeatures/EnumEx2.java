package com.dyashin.corejava.javaFeatures;

enum Actors {

	IRON_MAN, BLACK_WIDOW, THANOS;

	private Actors() {
		System.out.println("Acting");
	}
}

public class EnumEx2 {

	public static void main(String[] args) {
		
		System.out.println(Actors.IRON_MAN);
	}
}
