package SelfStudy;

public class FindLargestNumber {
   // Write a program to print largest number from array
	public static void main(String[] args) {
           
		int numbers[] = {10,35,67,89,45,65,40,60,58,43},maxNumber = 0, minNumber = 0;
		//largest number 89
		maxNumber = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i]> maxNumber) {
				maxNumber = numbers[i];
			}
			}
		System.out.println(maxNumber);
		
		
			}
		}
		
		
		// Largest number - 89
	


