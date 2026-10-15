package com.learn.Learn_Java8._03_methodreferences;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * 
 * @author nikhilvangala
 *
 *To Invoke method of a Class directly.
 *
 */
public class ArbitraryObjectMethodReferenceExamples {

	public static void main(String[] args) {
		
		String name = "Today is Beautiful";
		
		getUpperCaseString(name);
		//addToAnyList();
		
		
	}

	//we are using String class directly.
	//we can make uppercase of any given String here.
	private static void getUpperCaseString(String sentence) {
		//Here, we are using method of String class, and passing the object at last.
		
		//Function<String, String> upperCase = str-> str.toUpperCase();
		Function<String, String> upperCase = String::toUpperCase;

		sentence=upperCase.apply(sentence);
		System.out.println(sentence);
	}
	

	//here, we don't know the list and are adding to any given list
	//so, we are using List class directly
	private static void addToAnyList() {
		
		//BiConsumer<List<String>, String> listAdder = (x,y) -> x.add(y);
		BiConsumer<List<String>,String> listAdder2 = List::add;
		
		
		List<String> nameList = new ArrayList<>();
		String name1 = "Hari";
		
		listAdder2.accept(nameList, name1);
		System.out.println(nameList);
		
	}

}
