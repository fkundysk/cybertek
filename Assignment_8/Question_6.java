package Assignment_8;

import java.util.Scanner;

public class Question_6 {

	public static void main(String[] args) {
		
		System.out.println("Enter Number : ");
		Scanner Number = new Scanner(System.in);
		
		int Num1 = Number.nextInt();
		
		next3(Num1);

	}
	public static void next3(int num) {
				
		System.out.println("Next 3 Numbers are : ");	
		
		for (int i=num; i<num+3;i++) {
			System.out.print(i+1 + " ");
		}System.out.println(); 
	
	}
	

}
