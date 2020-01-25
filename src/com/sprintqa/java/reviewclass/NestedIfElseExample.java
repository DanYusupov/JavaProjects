package com.sprintqa.java.reviewclass;

public class NestedIfElseExample {

	public static void main(String[] args) {
        int dbUsername = 300;
        int dbPassword = 1234;
		
		int inputUsername = 300;
		int inputPassword = 1234;
        
        
		if(dbUsername == inputUsername ) {
        if(dbPassword == inputPassword) {
        	System.out.println("Login is Succesfull ");

        }else {
        	System.out.println(" Incorrect password ");

        	}
        	
        } else {       
        	System.out.println("Entered user is not found");

        	
        	
        }
		
	}

}
