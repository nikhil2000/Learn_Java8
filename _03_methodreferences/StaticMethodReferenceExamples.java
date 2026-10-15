package com.learn.Learn_Java8._03_methodreferences;

import java.util.Arrays;
import java.util.List;

	/**
	*If we are referring to a Static method of a class,
	*Then it is Static Method Reference
	*
	*/
public class StaticMethodReferenceExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//getCeilingOfNumber();
		getIntegerFromString();

	}

	public static void getCeilingOfNumber() {

		// here, ceil is a Static method in java.lang.Math class.
		List<Double> arr = Arrays.asList(1.5, 2.4, 3.6);
		arr.stream().map(Math::ceil).forEach(System.out::println);

	}

	public static void getIntegerFromString() {

		// here, parseInt is a Static method in java.lang.Integer class.
		List<String> arr = Arrays.asList("15", "24", "36");
		arr.stream()
		.map(Integer::parseInt)
		.map(x-> x-2)
		.forEach(System.out::println);

	}

}
