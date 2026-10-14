package com.learn.Learn_Java8._01_lambdas;

import java.util.function.Function;
import java.util.function.Predicate;

public class Java8_Lambda_1 {

	public static void main(String[] args) {
		
		PredicateCheckPositive(0);
		//FunctionStringUppercase("Hello");
		
	}
	

	
	/**
	program to convert given string to uppecase 
	and remove the last character.
	
	To Combine two Functions,
	Write two functions and then in 3rd Function, combine both.
	
	**/
	public static void FunctionStringUppercase(String xyz) {
		Function <String,String> toUpperCase = z-> z.toUpperCase();
		Function <String,String> f2 = y -> y.substring(0, y.length()-1);
		Function<String,String> f1 = toUpperCase.andThen(f2);
		
		System.out.println(f1.apply(xyz));
		
	}
	
	
	
}
