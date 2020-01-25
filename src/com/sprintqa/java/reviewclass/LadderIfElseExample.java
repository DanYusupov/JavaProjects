package com.sprintqa.java.reviewclass;

public class LadderIfElseExample {

	public static void main(String[] args) {
         
		int purchaseAmount = 9000;
		
		if(purchaseAmount <= 1000) {
	    	System.out.print("5%");
		}else if (purchaseAmount <= 10000) {
	    	System.out.print("10%");

		}else if (purchaseAmount <= 50000) {
	    	System.out.print("20%");
		}else {
		    System.out.print("25%");

			
		}
		
		
		
		
		
	}

}
