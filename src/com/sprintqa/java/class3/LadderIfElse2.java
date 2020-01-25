package com.sprintqa.java.class3;

import java.util.Scanner;

     public class LadderIfElse2 {

	public static void main(String[] args) {
         int num1 = 10, num2 = 20;
      
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Please enter operation to perform");
      System.out.println("1 for add");
      System.out.println("2 fot sub");
      System.out.println("3 for mul");
      System.out.println("4 for div");
      
      int userInput = sc.nextInt();
      
    	  if (userInput == 1) {
            System.out.println("add the results =" + (num1 + num2));
      } else if  (userInput == 2){
          System.out.println("add the results =" + (num1 - num2));
      }  else if (userInput == 3){   
    	  System.out.println("add the results =" + (num1 * num2));
      }  else if (userInput == 4){   
    	  System.out.println("add the results =" + (num1 / num2));
    	  }
		
		
      } 

}

