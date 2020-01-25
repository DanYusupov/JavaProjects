package com.sprintqa.java.class3;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter number (1-7) ");
		int num = sc.nextInt();
		
        
        if (num == 1) {
        	System.out.println("monday");
        }else if (num == 2) {
        	System.out.println("thuesday");
        }else if (num == 3){
        	System.out.println("wednesday");
        }else if (num == 4){
        	System.out.println("thursday");
        }else if (num == 5) {
        	System.out.println("friday");
        }else if (num == 6) {
        	System.out.println("saturday");
        }else if (num == 7) {
        	System.out.println("sunday");
        }else {
        	System.out.println("Please try again");
        }
        
	}

}
