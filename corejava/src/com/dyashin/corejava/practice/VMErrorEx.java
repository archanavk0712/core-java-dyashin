package com.dyashin.corejava.practice;

public class VMErrorEx {

	public static void abc() {
		VMErrorEx.abc();
	}
	public static void main(String[] args) {
		VMErrorEx.abc();
	}
	
}
