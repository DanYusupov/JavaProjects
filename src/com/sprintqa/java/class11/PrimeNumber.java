package com.sprintqa.java.class11;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
       
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		// num1 = 15
		
		// Prime number - a number is divisible by only and only 1 and itself
		 
		boolean flag = false;
		
		for (int i = 2; i <= num1 - 1; i++) {
			
			if (num1 == 2 || num1 == 1) {
				break;
			}
			
			if (num1 % i == 0) {
				System.out.println("Not prime");
				flag = true;
				break;
			}
		}
		if (flag == false) {
		System.out.println("End of program");
		}
		
	}

}
