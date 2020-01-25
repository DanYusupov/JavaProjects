package SelfStudy;

public class Class2 {

	public static void main(String[] args) {
          
	//Write a program to convert given 5000 seconds into hours, minutes and seconds. Use division and modulus operators. 
		
	int numOfSec = 5000;
	int hours = numOfSec / 3600;
	int minutes = (numOfSec % 3600) / 60;
	int seconds = numOfSec % 60;
	
	System.out.print("number of hours,min, and sec in");
	System.out.print(hours + "." + minutes + "." + seconds);
		
	}

}
