package com.learn.Learn_Java8._02_functionalinterfaces;

import java.util.function.Consumer;

//It Returns nothing.
public class ConsumerExamples {
	
	/**
	We can use a Consumer to PrintSomething.
	To Store a value to DB etc
	
	**/
	public static void main(String[] args) {
		
		
		printAnythingGiven("Hello Everyone");
	}

	private static void printAnythingGiven(String name) {
		// TODO Auto-generated method stub
		
		Consumer<String> c1= x-> System.out.println("i said "+x);
		
		c1.accept(name);
	}
	
	
	

}
