package com.dyashin.java8features.lambda;

@FunctionalInterface
interface Contract {
	public void rule();
}

class ContractImpl implements Contract {

	@Override
	public void rule() {
		System.out.println("Hi");
	}

}

public class AnonymouseInnerClasses {
	public static void main(String[] args) {
//		Contract cc=new ContractImpl();
//		cc.rule();

		Contract cc = () -> System.out.println("Hi");

		cc.rule();
	}
}
