package com.sprintqa.java.class14;

public class StringManipulationExample {

	public static void main(String[] args) {
       String str = " ";
		System.out.println(str.isEmpty());
		
		String str1 = "         Wecome to SprintQA         ";
		String expectedTitle = "Welcome to SprintQA";
		
		System.out.println(str1.trim().equals(expectedTitle));
		
		System.out.println("======IndexOf=====");
		// 01234567890123456789
		String str4 = "Welcome to SprintQA! This is Chirag from SprintQA";
		String str5 = "Welcome to SprintQA! This is Chirag from SprintQA We are going to learn automatiqQA";
        System.out.println(str4.indexOf("QA"));    //17
		System.out.println(str4.lastIndexOf("QA"));   //47
		System.out.println(str5.indexOf("QA",str5.indexOf("QA")+1));
		//              012345678901
//		System.out.println("======SubString=====");
//        String str6 = "Welcome to SprintQA!";
//		String str7 = "Welcome to SprintQA! This is Chirag from SprintQA We are going to learn automatiqQA";
//        System.out.println(str7.substring(str7.indexOf("S")));  // substring will return string at specified position
//		
//		System.out.println("======Format=====");
//        String companyName = "SprintQA!";
//        String trainerName ="Chirag";
//        String title = "Welcome to %s! This is %s from SprintQA %s We are going to learn automatiqQA";
//        System.out.println(String.format(title, companyName,trainerName,companyName));
//        
//        System.out.println("======CompareTo=====");
//        String str8 = "Amazon";
//        String str9 = "SprintQA";
//        String str10 = "Amazon";
//        System.out.println(str8.compareTo(str9)); //Negative
//        System.out.println(str9.compareTo(str8)); //Positive
//        System.out.println(str8.compareTo(str10));//Zero
       
		System.out.println("======Split=====");
		String str11 = "Welcome-to-SpringQA!";
        String str12 = "Welcome to SpringQA!This is Chirag from SprintQA We are going to learn automatiqQA";
        
        String words[] = str12.split(" ");
        System.out.println(words.length);
        
	}

}
