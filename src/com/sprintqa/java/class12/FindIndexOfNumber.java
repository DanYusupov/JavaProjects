package com.sprintqa.java.class12;

public class FindIndexOfNumber {
  // Write a program to print position of given number
	public static void main(String[] args) {
          
		int numbers[] = {10,35,67,89,45,65,40,60,58,43};
		int targetNumber = 43;
		
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == targetNumber) {
			System.out.println(i);
			break;
			}
		}
		}
		// 89 is stored at position 6
	}


