package com.sprintqa.java.class11;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
        
		int studentMarks[];
		studentMarks = new int [10];
		Scanner sc = new Scanner(System.in);
	    //studentMarks[0] = 40;
		//studentMarks[1] = 50;
		//studentMarks[2] = 42;
		
		for (int i = 0; i<10;i++) {
			System.out.println("Enter num at position" + i +" -");
              studentMarks[i] = sc.nextInt();
		}do {
		
		System.out.println("Enter roll number -");
         int rollNumber = sc.nextInt();
         
         System.out.println(studentMarks[rollNumber - 1]);
         
 		System.out.println("do you want to continue ");
          choice = sc.nextInt
         
         
         
		}while (choice)
	
	}

}
