package Assignment_8;

import java.util.Scanner;

public class Question_1 {

	public static void main(String[] args) {
		
		Scanner number = new Scanner(System.in);
		
		System.out.println("Enter First Number : ");
		
		int num1 = number.nextInt();
		
		System.out.println("Enter Second Number : ");
		
		int num2 = number.nextInt();
		
		System.out.println("Result : " + (num1 + num2) );
		
		number.close();

	}
	
}
