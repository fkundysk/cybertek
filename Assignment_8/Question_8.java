package Assignment_8;

import java.util.Scanner;

public class Question_8 {

	public static void main(String[] args) {
		
		do {	
			
			Scanner number = new Scanner(System.in);
			
			System.out.print("Please Enter Which Place of Fibonacci Series Want to See : ");
			
			int place = number.nextInt();
			
			System.out.println("Input : " + place);
			
			System.out.println("Output : " + fib(place));
			
			
		} while (AnotherNumber());	
	}
		
	public static int fib(int count) {
						
		int pre1 = 0, pre2 = 1;
			
		if (count==1) {
			pre2=0;
			
		} else {
			for (int i =1; i <= count-2; ++i){
			    											
			   int sumOfPrevTwo = pre1 + pre2;
			   pre1 = pre2;
			   pre2 = sumOfPrevTwo;
			} 
			   
			}return pre2;

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


