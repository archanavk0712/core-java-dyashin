package com.dyashin.corejava.day14;

class TooYoungException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public TooYoungException(String str) {
		super(str);
	}
}
class TooOldException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public TooOldException(String str) {
		super(str);
	}
}
public class UserDefinedUncheckedException {

	public static void main(String[] args) {

		int age=14;
		if(age<18) {
			throw new TooYoungException("You are not eligible for marriage");
		}
		else if(age>60) {
			throw new TooOldException("You are not eligible for marriage");
		}
		else {
			System.out.println("You are eligible for marriage");
		}
	}

}
