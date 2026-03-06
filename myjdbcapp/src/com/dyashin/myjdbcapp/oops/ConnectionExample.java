package com.dyashin.myjdbcapp.oops;

interface Statement {

	void executeQuery();
}

class ClassX implements Statement {

	@Override
	public void executeQuery() {

		System.out.println("ClassX Implementation");
	}

}

class ClassY implements Statement {

	@Override
	public void executeQuery() {

		System.out.println("ClassY Implementation");
	}

}


class ClassZ implements Statement {

	@Override
	public void executeQuery() {

		System.out.println("ClassZ Implementation");
	}

}


public class ConnectionExample {

	public static void main(String[] args) {


	}

}
