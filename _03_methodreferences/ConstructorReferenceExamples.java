package com.learn.Learn_Java8._03_methodreferences;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 * If we are referring to a Constructor a class,
* means, calling new() ,Then it is Constructor Method Reference
* It Returns a Supplier.
*
**/
public class ConstructorReferenceExamples {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//createNewArrayList();
		createNewStringBuffer();
	}

	//we are using new keyword and invoking the constructor of arraylist.
	private static void createNewArrayList() {
		
		//Supplier s =  () -> new ArrayList<String>();
		Supplier<List<String>> s = ArrayList<String>::new;
		List<String> list = s.get();
		
		list.add("Hello");
		list.add("one");
		list.add("two");
		list.add("Three");
		System.out.println(list);
		
		
	}
	
	
	//we are using new keyword and invoking the constructor of StringBuilder.
		private static void createNewStringBuffer() {
			
			//Supplier s =  () -> new ArrayList<String>();
			Supplier<StringBuilder> supp = StringBuilder::new;
			StringBuilder something = supp.get();
			
			something.append("Once");
			something.append(" upon");
			something.append(" a");
			something.append(" time");
			System.out.println(something.toString());
			
			
		}

}
