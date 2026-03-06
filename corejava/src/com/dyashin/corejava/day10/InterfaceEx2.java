package com.dyashin.corejava.day10;

interface One{
	public void stuff();
}

interface Two extends One{
	public void doStuff();
}

class TwoInterfaceImpl implements Two{

	@Override
	public void stuff() {
		
	}

	@Override
	public void doStuff() {
		
	}
}
public class InterfaceEx2 {

}
