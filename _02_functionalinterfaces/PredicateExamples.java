package com.learn.Learn_Java8._02_functionalinterfaces;

import java.util.function.Predicate;

public class PredicateExamples {

	public static void main(String[] args) {

		// Basic predicate=================
		//PredicateCheckPositive(10);

		
		
		
		// Combine predicates=================
		 //PredicateCombineExamples(24);
		

		

	}

	/**
	 * program to check if a given number is positive
	 * 
	 * * p.test(num) already boolean eh return chesthadi.
		malla == "true" ah ani adagalsina avsram ledhu 

	 **/
	public static void PredicateCheckPositive(int num) {
		Predicate<Integer> p = x -> x > 0;
		System.out.println("the Number is " + (p.test(num) ? "Positive" : "Not Positive"));
	}
	
	
	
	
	//Program to check if a given number is >20 and if it is even.
	public static void PredicateCombineExamples(int num){
		
		Predicate<Integer> numGreaterThan20AndEven = x->x >20 && x%2 ==0;
		
		System.out.println(numGreaterThan20AndEven.test(num));
		
	}
	
	
	

}
