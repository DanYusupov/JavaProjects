package com.sprintqa.java.reviewclass_23_January;

import java.util.Arrays;

public class ArrayExample1 {

	public static void main(String[] args) {
        
		int numbers []= {14,56,37,0,23,9,2,80,67};
		
		for (int i:numbers) 
		{
			System.out.print(i + " ");
		}
		Arrays.sort(numbers);
		System.out.println();
	
		for(int i:numbers)
		{
		
	     System.out.print(i + " ");
	}

}
}