package com.dyashin.corejava.practiceStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArraysToStream {

	public static void main(String[] args) {

		int[] primitiveArray = { 1, 2, 3, 4 };

		Integer[] objectArray = { 5, 6, 7, 8 };

		System.out.println("---------primitive to string---------");

		IntStream primitiveStream = Arrays.stream(primitiveArray);
		primitiveStream.forEach(System.out::println);

		System.out.println("--------object to string----------");

		Stream<Integer> objectStream = Stream.of(objectArray);
		objectStream.forEach(System.out::println);

		System.out.println("--------list to string----------");

		List<Integer> list = Arrays.asList(9, 10, 11, 12);
		list.stream().forEach(System.out::println);
	}
}
