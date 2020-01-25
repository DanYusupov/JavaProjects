package com.sprintqa.java.reviewclass_23_January;

public class LogicProgramExample {

	public static void main(String[] args) {
       
		int num1 = 13,i,y=0;
	//	boolean flag = false;
		for (i = 2;i <=num1-1;i++) {
			if (num1 % i ==0) {
				y=1;
				//flag = true;
			System.out.print("not prime number");
			break;
		}
		}
		if (y==0) {
			System.out.print("prime number");
		}
		//if (flag == false) {
		//	System.out.print("prime number");

		}
		
	}


