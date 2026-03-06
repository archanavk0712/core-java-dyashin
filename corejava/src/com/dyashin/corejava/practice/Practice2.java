package com.dyashin.corejava.practice;

interface A{
	void ab();
}
interface B{
	void ab();
}
class C implements A,B{

	@Override
	public void ab() {
		System.out.println("Implemented method");
//		A.super.ab();
	}

}
public class Practice2 {

	public static void main(String[] args) {
		C c=new C();
		c.ab();
	}
}
