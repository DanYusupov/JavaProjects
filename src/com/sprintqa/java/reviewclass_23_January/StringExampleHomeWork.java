package com.sprintqa.java.reviewclass_23_January;

public class StringExampleHomeWork {

	public static void main(String[] args) {
         
		String str = "This is string program we learning from java concept";
		char c = 'T';
		int count = 0;
		for (int i = 0; i <str.length() -1;i++) {
			if(str.toLowerCase().charAt(i) == c|| str.toUpperCase().charAt(i)==c) {
				count++;
			}
		}
		System.out.println(count);
		// write a program to print frequency of given char
	}

}
