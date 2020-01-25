package com.sprintqa.java.class12;

public class OddEvenNumberArray {
// count total number of odd number and total number of even number inside the array
	public static void main(String[] args) {
		int numbers[] = {12,65,78,1,6,45,71,65,34,89}, oddCount = 0,evenCount=0;// Declaration and Initialization
        
		int num1 = 12+78+6+34;
		int num2 = 65+1+45+71+65+89;
	
		
		for (int i = 0;i < numbers.length; i++) {
			if (numbers[i] %2 ==0) {
			evenCount++;
		}else {
			oddCount++;
		}
		}
		System.out.println("Even");
		System.out.println("Odd");
	}

}
