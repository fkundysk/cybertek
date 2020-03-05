package Assignment_8;

import java.util.Scanner;

public class Question_14 {

	public static void main(String[] args) {
		
		do {
            Scanner check = new Scanner(System.in);
			
			System.out.print("First (a) true/false : ");
			
			boolean a = check.nextBoolean();
			
			System.out.print("Second (b) true/false : ");
			
			boolean b = check.nextBoolean();
			
			System.out.print("Third (c) true/false : ");
			
			boolean c = check.nextBoolean();
			
			System.out.println("ThreeLocks (" + a + "," + b + "," + c +")" );
						
			System.out.println("Returns : " + "\"" + ThreeLocks(a,b,c) + "\"");
				
		
		}while (AnotherTry());
	
	}
	
	public static boolean ThreeLocks(boolean a, boolean b, boolean c) {
		
		if ((a && b) || (c!=false)){
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
