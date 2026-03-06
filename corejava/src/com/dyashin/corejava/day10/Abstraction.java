package com.dyashin.corejava.day10;

interface Remote{
	public void turnOn();
	public void turnOff();
}

class ACRemote implements Remote{

	@Override
	public void turnOn() {
		System.out.println("Switch on the Ac");
	}

	@Override
	public void turnOff() {
		System.out.println("Switch off the Ac");
	}
	
}
public class Abstraction {
	public static void main(String[] args) {
		Remote remote=new ACRemote();
		remote.turnOn();
		remote.turnOff();
	}
}
