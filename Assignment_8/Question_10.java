package Assignment_8;

import java.util.Scanner;

public class Question_10 {

	public static void main(String[] args) {
		
		do {
			Scanner number = new Scanner(System.in);
			
			System.out.print("Please Enter Your Number : ");
			
			int num1 = number.nextInt();
			
			System.out.println("isEven (" + num1 + ") ---> " + isEven(num1));
					
		}while (AnotherNumber());
		
	}

	public static boolean isEven(int num1) {
		
		if (num1%2==0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean AnotherNumber() {
		
		boolean finish=false;
		
		Scanner AnotherTry = new Scanner(System.in);
		
		System.out.print("Do you want try another number ? (Y/N): ");
		
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
