package com.sprintqa.java.class9;

public class SeriesProgramHomeWork {

	public static void main(String[] args) {
           
		//1 + 10 + 2 + 9 + 3 + 8 + 4 + 7 + 5 + 6
		
		//int sum = 0;
		//for (int i = 1; i <= 10; i++) {
			//sum = sum + i;
		//}
		//System.out.print(sum);
		Scanner sc = new Scanner (System.in);
		int starSqueareSize = sc.nextInt();
		
		for (int i = 1; i <= starSqueareSize; i++) {//outer for loop
			//System.out.print("Value of I = " + i + " :");
			
			for (int j = 1; j <= starSqueareSize; j++) {//inner for loop
				System.out.print(i + " ");
				
				
			}//end of inner for loop
			System.out.println();
		}// end of outer for loop
	}

}
