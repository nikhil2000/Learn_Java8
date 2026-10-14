package com.learn.Learn_Java8._02_functionalinterfaces;

import java.util.Random;
import java.util.function.Supplier;

//Supplies when we ask, dont takes any arguments.
public class SupplierExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(GiveaRandomNumber())	;
	}

	private static int GiveaRandomNumber() {
		// TODO Auto-generated method stub
		Random randomInt = new Random();
		
		int random = randomInt.nextInt(100)+1;
		Supplier<Integer> randomNumberGenerator = () -> {return random;};
		return randomNumberGenerator.get();
	}
	
	
	

}
