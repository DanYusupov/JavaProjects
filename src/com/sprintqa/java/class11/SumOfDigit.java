package com.sprintqa.java.class11;

public class SumOfDigit {

	public static void main(String[] args) {
      
		
		// 3 + 7 + 2
		
		int num1 = 372, sum = 0, lastDigit;
		
		while (num1 !=0) { lastDigit = num1 % 10;
		num1 = num1 / 10;
		sum = sum + lastDigit;
			
		}
		System.out.println(sum);
	}

}
