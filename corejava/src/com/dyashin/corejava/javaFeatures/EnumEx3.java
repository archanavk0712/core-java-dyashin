package com.dyashin.corejava.javaFeatures;

enum Products {
	SOAP(30), SHAMPOO(10), BREAD(40), BISCUIR(45);

	int price;

	Products(int price) {
		this.price = price;
	}

}

public class EnumEx3 {

	public static void main(String[] args) {

		Products[] product = Products.values();
		for (Products products : product) {
			System.out.println(products + " -> " + products.price);
		}
		
		System.out.println("Price of bread is : "+Products.BREAD.price);
	}

}
