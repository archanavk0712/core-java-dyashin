package com.dyashin.corejava.day14;

class BabyException extends Exception{
	
	private static final long serialVersionUID = 1L;

	public BabyException(String str) {
		super(str);
	}
}
public class UserDefinedCheckedException {

	public static void main(String[] args) {

		int age=1;
		try {
			if(age<=3) {
				throw new BabyException("You are a baby for school");
			}
			else {
				System.out.println("You are eligible for school");
			}
		}catch(BabyException b) {
			System.out.println("Invalid input");
		}
	}

}
