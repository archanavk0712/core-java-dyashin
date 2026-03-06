package com.dyashin.corejava.day3;

public class ConditionalStatements 
{
	public static void main(String[] args) 
	{
	int x=5, y=3;
	if(x<3)
	{
		System.out.println("if condition");
	}
	else if(y==3)
	{
		System.out.println("else if condition");
	}
	else
	{
		System.out.println("else condition");
	}

	
	String a="Green";
	if (a=="Red")
	{
		System.out.println("Please wait the signal is red");
	}
	else if(a=="Yellow")
	{
		System.out.println("Get ready the signal is yellow");
	}
	else
	{
		System.out.println("You can move the signal is Green");
	}
	
	
	int marks=50;
	switch(marks/10)
	{
	case 9 : 
		System.out.println("Grade A");
		break;
	case 8 : 
		System.out.println("Grade B");
		break;
	case 7 : 
		System.out.println("Grade C");
		break;
	case 6 : 
		if(marks>=65)
		System.out.println("Grade D");
		else
			System.out.println("Failed");
		break;
	case 5 : 
		System.out.println("Fail");
		break;
	default:	
		System.out.println("Fail");
		break;
	}
	
	
	String week="Tuesday";
	switch(week)
	{
		case "Monday":
			System.out.println("Monday is 1st day of the week");
		break;
		case "Tuesday":
			System.out.println("Monday is 2nd day of the week");
		break;
		case "Wednesday":
			System.out.println("Monday is 3rd day of the week");
		break;
		case "Thursday":
			System.out.println("Monday is 4th day of the week");
		break;
		case "Friday":
			System.out.println("Monday is 5th day of the week");
		break;
		case "Saturday":
			System.out.println("Monday is 6th day of the week");
		break;
		case "Sunday":
			System.out.println("Monday is 7th day of the week");
		break;
		default:
			System.out.println("Invalid Input");
		break;
	}
}
}
