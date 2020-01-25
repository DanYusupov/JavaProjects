package com.sprintqa.java.class3;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
           
        int num = sc.nextInt();
        System.out.println("Enter Number...");
        
        System.out.println("The number you have entered is" + num);
	}

}