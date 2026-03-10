package com.dyashin.corejava.javaFeatures;

sealed class A permits B,C{
	
}
//sealed class B extends A permits D{
//	
//}
non-sealed class B extends A{
	
}
final class C extends A{
	
}
//non-sealed class D extends B{
//	
//}
public class SealedClasses {

	public static void main(String[] args) {
		
	}
}
