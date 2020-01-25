package com.sprintqa.java.reviewclass_23_January;

public class ArrayExampleHomeWork {

	public static void main(String[] args) {
		int numbers [] = {14,56,37,0,23,9,2,80,67},min=0,temp = 0,indexOfMin=0;
		           // 0 1 2 3 4 5 6 7 8
		for(int i = 0; i < numbers.length-1;i++) {
		 min = numbers [0];
        for (int j=i;j< numbers.length ;j++) {
        	if (numbers [j]<min) {
        		min = numbers[j];
        		indexOfMin =j;
        	}
        }
        // swapping of two number - numbers[indexOfMin], numbers[i]
        temp = numbers[indexOfMin];
        numbers[indexOfMin] = numbers[i];
        numbers[i]=temp;
        
		}
		System.out.println(min);
		
	}

}
