package com.dyashin.corejava.day14;


public class MultipleCatchBlock {

	public static void main(String[] args) {		
		try {
			String str=null;   
			System.out.println(str.length());
			  
			int[] num= {2,5,2,6};
			System.out.println(num[6]);
			int result=10/0;
			System.out.println(result);
		} 
		
//		catch (NullPointerException e) {
//			System.out.println("NullPointerException Handling");
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("ArrayIndexOutOfBoundsException Handling");
//		}catch(ArithmeticException e) {
//			System.out.println("ArithmeticException Handling");
//		}catch(Exception e) {
//			System.out.println("Exception Handling");
//		}
		
		catch(NullPointerException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println();
		}
		
		
		
		finally {
			System.exit(0);
			System.out.println("Finally block");
		}
		
	}
}
