package Assignment_8;

import java.util.Scanner; 

public class Question_5 {

	public static void main(String[] args) {
		
		
		do {	
			sign(GetNumber());
							
		}while (AnotherNumber());
		
	}
	public static void sign(int GetNumber) {
		
		if (GetNumber>0) {
			System.out.println("Sign (" + GetNumber + ") => 1" );
			
		} else if (GetNumber<0) {
			System.out.println("Sign (" + GetNumber + ") => -1" );
			
		} else {
			System.out.println("Sign (" + GetNumber + ") => 0" );
		} 
		
	}

	public static int GetNumber() {
		
		System.out.print("Please enter the number : ");
		
		Scanner number = new Scanner(System.in);
		 
		int num1 = number.nextInt();
		
		return num1;
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
			finish=false;
			break;
		}
		return finish;
		
	}
}


