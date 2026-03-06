package com.dyashin.corejava.day8;

public class InheritanceChild extends InheritanceParent
{
	public InheritanceChild() {
		System.out.println("Default constructor of child class");
	}
	 public void doStuffChild() {
		 System.out.println("Inside the child class method doStuff");
	 }
	public static void main(String[] args) 
	{ 
		InheritanceChild child = new InheritanceChild();
		child.doStuffParent();
		child.doStuffChild();
	}
}
