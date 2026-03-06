package com.dyashin.corejava.day14;

public class NestedTryCatch {

	public static void main(String[] args) {		
		try {
			String str=null;   
			System.out.println(str.length());
			
			try {
				int[] num= {2,5,2,6};
				System.out.println(num[6]);
				try {
					int result=10/0;
					System.out.println(result);
				} catch (ArithmeticException e) {
					System.out.println("ArithmeticException");
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("ArrayIndexOutOfBoundsException");
			}
			}catch (NullPointerException e) {
				System.out.println("NullPointerException");
			}
		}
}
	


