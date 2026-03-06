package com.dyashin.java8features.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class ConsumeImpl implements Consumer<Integer> {

	@Override
	public void accept(Integer t) {
		System.out.println(t);
	}

}

public class ForEachLoop {

	public static void main(String[] args) {
		List<Integer> val = Arrays.asList(10, 5, 2, 46, 65);

//		System.out.println(val);
//		
//		for (Integer integer : val) {
//			System.out.println(integer);
//		}
//		
//		val.forEach(elem -> System.out.println(elem));

//		Consumer<Integer> cc = t -> System.out.println(t);
//		cc.accept(23);
		
//		val.forEach(cc);
		
		val.forEach(t -> System.out.println(t));
	}
}
