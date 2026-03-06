package com.dyashin.corejava.practice;

public class Practice {

//	Recursive Factorial
//	public static int fact(int n) {
//		if(n==0) {
//			return 1;
//		}else {
//			return n*fact(n-1);
//		}
//	}
	
//	Recursive Fibonacci
//	public static int fibo(int n) {
//		if (n==0) {
//			return 1;
//		}else if(n==1) {
//			return 1;
//		}else {
//			return fibo(n-1)+fibo(n-2);
//		}
//	}
	
	static void initBlock1() {
	    System.out.println("Block 1");
	}

	static void initBlock2() {
	    System.out.println("Block 2");
	}

	static void initBlock3() {
	    System.out.println("Block 3");
	}

	public static void main(String[] args) {
	    initBlock2();  // ONLY this executes
	
//		Capitalize first letters
//		String a="hi hello";
//		String [] b=a.split(" ");
//		String res="";
//
//		for(String n: b) {
//			char c= n.charAt(0);
//			String sub=n.substring(1);
//			res=res+ Character.toUpperCase(c)+sub+" ";
//		}
//		System.out.println(res);
		
//		Reverse a string
//		String a="aba";
//		String res="";
//		for (int i = a.length()-1; i>=0; i--) {
//			char c=a.charAt(i);
///		}
//		System.out.println(res);
		
//		Reverse the string while maintaining the order
//		String a="Hi Hello";
//		String[] b=a.split(" ");
//		
//		String res="";
//		for(String s:b) {
//			String rev=" ";
//			
//			for (int i = s.length()-1; i >=0; i--) {
//				char ch=s.charAt(i);
//				rev=rev+ch;
//			}
//			res=res+rev+" ";
//		}
//		
//		System.out.println(res);
		
//		Amrstrong number
//		int n=190;
//		int num=n;
//		int res=0;
//		int rem=0;
//		
//		int temp=num;
//		int count=0;
//		while(temp>0) {
//			count++;
//			temp=temp/10;
//		}
//		
//		temp=num;
//		while(temp>0) {
//			rem=temp%10;
//			res=res+(int)Math.pow(rem, count);
//			temp=temp/10;
//		}
//		
//		System.out.println(res);
		
//		System.out.println(Practice.fact(5));
		
//		Factorial
//		int n=5;
//		int fact=1;
//		for (int i = 1; i <= n; i++) {
//			
//			fact=fact*i;
//		}
//		System.out.println(fact);
		
//		Fibonacci series
//		int n=5;
//		int a=0, b=1;
//		int c;
//		for (int i = 0; i < n; i++) {
//			System.out.println(a);
//			c=a+b;
//			a=b;
//			b=c;
//		}
		
//		for (int i = 0; i < 5; i++) {
//			
//			System.out.println(fibo(i)+" ");
//		}
	}
}
