package com.learn.Learn_Java8._02_functionalinterfaces;

import java.util.function.Function;

public class FunctionExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Basic Functions
		
		
		//Medium hard Functions
		
		

		//Combine Functions
		FunctionStringUppercaseAndRemoveLastChar("Hello World");

	}
	
	
	
	
	
	/**
	program to convert given string to uppecase 
	and remove the last character.
	
	To Combine two Functions,
	Write two functions and then in 3rd Function, combine both.
	
	**/
	public static void FunctionStringUppercaseAndRemoveLastChar(String xyz) {
		Function <String,String> toUpperCase = z-> z.toUpperCase();
		Function <String,String> removeLastChar = y -> y.substring(0, y.length()-1);
		Function<String,String> CombinedFunction = toUpperCase.andThen(removeLastChar);
		
		System.out.println(CombinedFunction.apply(xyz));
		
	}

}
