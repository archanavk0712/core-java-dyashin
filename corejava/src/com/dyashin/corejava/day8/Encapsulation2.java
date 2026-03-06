package com.dyashin.corejava.day8;

public class Encapsulation2 
{
	private int balance;
	
	public Encapsulation2(int initialBalance) {
		if(initialBalance>0)
		{
			balance=initialBalance;
		}
		else 
		{
			balance = 0;
		}
	}
	public int getBalance() {
		return balance;
	}

	public void deposit( int deposit) 
	{
		if (deposit>0) {
		System.out.println("The balance after depositing "+deposit+" is: "+(balance+deposit));
		}
		else {
			System.out.println("Invalid deposit amount");
		}
	}
	 public void withdrawal(int withdraw) 
	 {
		 if(withdraw>0 && balance>0) {
			 System.out.println("The balance withdrawing "+withdraw+" is: "+(balance-withdraw)); 
		 }
		 else {
			 System.out.println("Insufficient balance or invalid amount");
		 }
	 }
	public static void main(String[] args) 
	{
		
	}
}
