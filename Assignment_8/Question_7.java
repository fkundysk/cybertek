package Assignment_8;

import java.util.Scanner;

public class Question_7 {

	public static void main(String[] args) {
		
		do {
			
			Scanner number = new Scanner(System.in);
			
			System.out.println("Please Enter min. two (2) and max. five (5) digit number : ");
			
			int Num1 = number.nextInt();
			
			System.out.println("Input : " + Num1);
			
			System.out.println("Output : " + isPolindrome(Num1));
			
		}while (AnotherNumber());
		
	}
	public static boolean isPolindrome(int x) {
		
		boolean result=false;
		
		if (x>10_000 && x<100_000) {
			result = calculate5(x);
			
		} else  if (x>1000 && x<10_000) {
			result = calculate4(x);
			
		}else  if (x>100 && x<1000) {
			result =calculate3(x);
			
		}else if (x>10 && x<100) {
			result = calculate2(x);
			
		} else {
			System.out.println("Invalid Input");
		} return result;
	}
			
	public static boolean calculate5(int x) {
		
		boolean result=false;
		int fifth = x/10000;
		int fourth = (x/1000)%10;
		int third = (x/100)%10;
		int second = ((x/10)%10);
		int first = x%10;
		if (first == fifth && second == fourth)
				{
			result=true;
		} return result;	
		
	}
	public static boolean calculate4(int x) {
		
		boolean result=false;
		
		int fourth = x/1000;
		int third = (x/100)%10;
		int second = ((x/10)%10);
		int first = x%10;
		if (first == fourth && second == third)
				{
			result=true;
		} return result;	
	}
		
	public static boolean calculate3(int x) {
		boolean result=false;
		if (x/100 == x%10 ) {
			result=true;
		} return result;
		
	}
	public static boolean calculate2(int x) {
		
		boolean result=false;
		
		int second = ((x/10)%10);
		int first = x%10;
		
		if (first == second) {
			result=true;
		} return result;
		
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
