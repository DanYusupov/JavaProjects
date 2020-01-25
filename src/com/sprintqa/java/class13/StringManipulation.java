package com.sprintqa.java.class13;

public class StringManipulation {

	public static void main(String[] args) {
         //Primitive / Non primitive
	
	    String str1 ="Hello"; // Declaring a String variable and assigning value
	    String str3 = "Hello";
		String str2 = new String ("Hello"); //Declaring a String object and assigning value via object creation
		String str4 = new String ("Hello");
		
		String actualWebTitle = "Welcome to Ebay";
		String expectedTitle = "Welcome to Ebay";
		
		String strWithUpperCase = "WELCOME TO EBAY";
		String strWithLowerCase = "ebay";
		
		
//		System.out.println(str1==str3);// true because compiler will refer to same object / location memory
//		System.out.println(str2==str4);// false - compiler will refer to different location in memory
//		System.out.println(str2.equals(str1));
		System.out.println(expectedTitle.contains(actualWebTitle));
		
		System.out.println(strWithUpperCase.charAt (strWithUpperCase.length() -1));
		
		String original = "SpringQA";
		String rev = "";
		for (int i = original.length()-1 ; i<=0 ; i--) {
			rev = rev + original.charAt(i);
		}
		System.out.println(rev);
	}

}
