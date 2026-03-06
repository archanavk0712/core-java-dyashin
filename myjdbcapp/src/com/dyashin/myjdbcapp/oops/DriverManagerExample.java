package com.dyashin.myjdbcapp.oops;

interface Connection {

	Statement createStatement();
}

class ClassA implements Connection {

	@Override
	public Statement createStatement() {

		System.out.println("ClassA Implementation");
		return new ClassX();
	}

}

class ClassB implements Connection {

	@Override
	public Statement createStatement() {

		System.out.println("ClassB Implementation");
		return new ClassY();
	}

}

class ClassC implements Connection {

	@Override
	public Statement createStatement() {

		System.out.println("ClassC Implementation");
		return new ClassZ();
	}

}

class DriverManager {
	
	private DriverManager() {

		System.out.println("Private default constructor");
	}
	
	public static Connection getConnection(String str) {

		Connection test=null;
		if(str.equals("A")) {
			test=new ClassA();
		}else if(str.equals("B")){
			test= new ClassB();
		}else {
			test= new ClassC();
		}
		return test;
	}
}

public class DriverManagerExample {

	public static void main(String[] args) {

		String dburl="B";
		Connection conn= DriverManager.getConnection(dburl);
		Statement stmt=conn.createStatement();
		stmt.executeQuery();
	}

}
