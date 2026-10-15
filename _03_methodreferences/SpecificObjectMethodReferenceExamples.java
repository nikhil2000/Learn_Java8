package com.learn.Learn_Java8._03_methodreferences;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * 
 * @author nikhilvangala
 *
 * To Invoke method for a specific Object.
 *
 */
public class SpecificObjectMethodReferenceExamples {

	public static void main(String[] args) {

		//appendToStringBuffer();
		addToList();
	
	}
	
	
	
	
	private static void appendToStringBuffer() {
		//Here sb is the object, on which we are using string Class's method append.
		
				StringBuffer sb = new StringBuffer();
				//Consumer<String> con = x -> sb.append(x);
				Consumer<String> con = sb::append;
				
				con.accept("This");
				con.accept(" is");
				con.accept(" beautiful");
				
				System.out.println(sb);
		
	}



	//here, we know the list and are adding to that specific list.
	private static void addToList() {
		
		List<String> numberList = new ArrayList<>();
		
		//Consumer<String> listAdder = x-> numberList.add(x);
		Consumer<String> listAdder2 = numberList::add;
		
		listAdder2.accept("Today");
		listAdder2.accept("yesterday");
		listAdder2.accept("Tomorrow");
		System.out.println(numberList);
		
	}

}
