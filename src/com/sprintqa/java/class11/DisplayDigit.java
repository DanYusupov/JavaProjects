package com.sprintqa.java.class11;

import java.util.Scanner;

public class DisplayDigit {

	public static void main(String[] args) {
       
		
         Scanner sc = new Scanner (System.in);
         int num1 = sc.nextInt();
         int lastDigit ;
       
		//System.out.println(num1 % 10);// 3
         //num1 = num1 / 10; // 15
		
		//System.out.println("Not prime");
        // num1 = num1 / 10; // 1
		
		//System.out.println("Not prime");

		while (num1 !=0) {
			lastDigit = num1 % 10; // 
			System.out.println(num1%10);
			num1 = num1 / 10;

			
		}
         
         
         
	}

}
