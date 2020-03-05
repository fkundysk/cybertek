package Assignment_8;

import java.util.Scanner;

public class Question_9 {

	public static void main(String[] args) {
		
		do {
			Scanner number = new Scanner(System.in);
			
			System.out.print("Please enter x values : ");
			
			int x = number.nextInt();
			
			System.out.print("Please enter max values : ");
			
			int max = number.nextInt();
			
			System.out.println("Input : max (" + x + "," + max + ")" );
			
			System.out.println("Returs(output) : " + max (x,max));

			
		}while(AnotherNumber());
	}
	public static int max(int x, int max) {
		
		if (x>max) {
			return max; 
		} else {
			return x;
		}
	}
	public static boolean AnotherNumber() {
		
		boolean finish=false;
		
		Scanner AnotherTry = new Scanner(System.in);
		
		System.out.print("Do you want try another numbers ? (Y/N): ");
		
		String answer = AnotherTry.next();
		
		switch (answer) {
		
		case "N": case "n":
			finish=false;
			System.out.println("Good Bye");
			break;
			
		case "Y": case "y":
			finish=true;
			break;
		default:
			System.out.println("Invalid Input");
			System.out.println("Good Bye");
			finish=false;
			break;
		}
		return finish;
		
	}

}
