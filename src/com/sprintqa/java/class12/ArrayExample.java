package com.sprintqa.java.class12;

public class ArrayExample {

	public static void main(String[] args) {
		int salary[] = { 2000, 5000, 1000, 500, 400, 700, 600, 600, 1200, 900 };// Declaration and Initialization
		
		
		int payroll = 0;
        for(int i = 0; i < salary.length ;i++) {
        payroll = payroll+ salary[i];
       }
        System.out.println(payroll);
        
       
	}

}
