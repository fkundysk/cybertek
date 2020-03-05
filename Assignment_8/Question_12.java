package Assignment_8;

import java.util.Scanner;

public class Question_12 {

	public static void main(String[] args) {
	
		do {
			Scanner check = new Scanner(System.in);
			
			System.out.print("First true/false : ");
			
			boolean check1 = check.nextBoolean();
			
			System.out.print("Second true/false : ");
			
			boolean check2 = check.nextBoolean();
			
			System.out.println("hamletQuote (" + check1 + "," + check2 + ")" );
						
			System.out.println("returns : " + "\"" + hamletQuote(check1,check2) + "\"");
				
		}while(AnotherTry());
		

	}
	public static boolean hamletQuote(boolean check1, boolean check2) {
		
		if (check1 || check2){
			return true;
		}
		return false;
	}
	
	public static boolean AnotherTry() {
		
		boolean finish=false;
	
		Scanner AnotherTry = new Scanner(System.in);
	
		System.out.print("Do you want try another try ? (Y/N): ");
	
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
