package com.dyashin.corejava.day9;

public final  class FinalKeyword {
	final int a=2;
	final int b=3;
	public void add(final int x, final int y ) {
//		x=10;   cannot update an final varibale
	}
	
//class Word extends FinalKeyword {           A final class cannot be extended/inherited
//	
//}
	
	public static void main(String[] args) {
		FinalKeyword a=new FinalKeyword();
		a.add(2, 3);
	}

}
