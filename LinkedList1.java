package com.collection_test.bll;
import java.util.LinkedList;
import java.util.Arrays;

public class LinkedList1 {

	public static void main(String[] args) {
LinkedList<String> language = new LinkedList<>();
		
		//adding value in linked list
		language.add("C");
		language.add("C++");
		language.add("Java");
		language.add("Kotlin");
		language.add("Python");
		language.add("Perl");
		language.add("Ruby");
		/*
		//Display languages
		System.out.println("*******Languages********");
		for(int i=0; i<language.size(); i++) {
			
			System.out.print(language.get(i)+"  ");
		}
		*/
		
		
		
		/*
		// Remove an element at index 5
		System.out.println("**********************");
		language.remove(5);
		
		System.out.println("After remove element of index 5");
		
		for(int i=0; i<language.size(); i++) {
			
			System.out.print(language.get(i)+"   ");
		}
		*/
		
		
		
		/*
		//Remove "Kotlin" element
		System.out.println("**********************");
		language.remove("Kotlin");
		
		System.out.println("After remove Kotlin");
		
		for(int i=0; i<language.size(); i++) {
			
			System.out.print(language.get(i)+"   ");
		}
		*/
		
		/*
		//Removing the scripting languages 
		System.out.println("**********************");
		LinkedList<String>scripting_lang=new LinkedList<>(Arrays.asList("Python","Ruby","Perl"));
		language.removeAll(scripting_lang);
		System.out.println("After remove scriptinh languages :-");
		
		for(int i=0; i<language.size(); i++) {
			
			System.out.print(language.get(i)+"   ");
		}
		*/
		
		
		
		/*
		//remove All element
		System.out.println("**********************");
		language.removeAll(language);
		
		System.out.println("After removeAll the language");
				
		for(int i=0; i<language.size(); i++) {
					
			System.out.print(language.get(i)+"   ");
		}
		*/
	}

}
