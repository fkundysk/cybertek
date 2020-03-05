package Assignment_8;

import java.util.Scanner;

public class Question_4 {

	public static void main(String[] args) {
		
		System.out.print("Enter Height of Rectangle : ");
		
		Scanner number1 = new Scanner(System.in);
		
		int height = number1.nextInt();
		
		System.out.print("Enter Lenght of Rectangle : ");
		
		Scanner number2 = new Scanner(System.in);
		
		int lenght = number2.nextInt();
		
		if (height<=2 || lenght<=2) {
			
			System.out.println("Your values should be bigger than 2 for nice rectangle");
		} else {
		
		PrintHollowRect(height,lenght);
		
		}			
	}

	public static void PrintHollowRect(int height, int lenght) {
		
		System.out.println(height + " X " + lenght + " (height X lenght)" + " Hollow Rectangle :");
	
		for (int i=1; i<=height; i++) {
			System.out.print("*");
									
			for (int j=1; j<lenght-1; j++) {
				
				if (i==1 || i==height) {
				System.out.print("*");
				
			}	else {
				System.out.print(" ");
			}
				
		}System.out.println("*");
	  }
	}
}			
				
		
		
		
		
		
		



