package Assignment_8;

import java.util.Scanner;

public class Question_11 {

	public static void main(String[] args) {
		
		do {
			Scanner price = new Scanner(System.in);
			
			System.out.print("Please enter buy price : ");
			
			int buyPrice = price.nextInt();
			
			System.out.print("Please enter sell price : ");
			
			int sellPrice = price.nextInt();
						
			System.out.println("returns : " + "\"" + c_profits (buyPrice, sellPrice) + "\"");
			
			
		} while (AnotherNumber());
	}
		public static String c_profits (int buyPrice, int sellPrice) {
			
			String result = "no loss";
		
			if (buyPrice>sellPrice) {
				result="loss";
				
			}else if (buyPrice<sellPrice) {
				result="profit";
				
			} return result;		
		}
	
		public static boolean AnotherNumber() {
		
			boolean finish=false;
		
			Scanner AnotherTry = new Scanner(System.in);
		
			System.out.print("Do you want try another check ? (Y/N): ");
		
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
