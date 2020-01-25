package com.sprintqa.java.class11;

public class PerfectNumber {

	public static void main(String[] args) {
         
		
		int num1 = 28, sum=0;
		for (int i = 1; i <= num1; i++) {
			if (num1 % i ==0) {
				sum=sum+i;
				
			}
			
		}
		if (sum==num1) {

		}else {
			System.out.println("Not per. num");
		}
		
		
		
	}

}
