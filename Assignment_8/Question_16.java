package Assignment_8;

import java.util.Scanner;

public class Question_16 {

	public static void main(String[] args) {
		
		do {
			Scanner booking = new Scanner(System.in);
			
			System.out.print("Is it available true/false : ");
			
			boolean avaliable = booking.nextBoolean();
			
			System.out.print("Booking Year : ");
			
			int year = booking.nextInt();
			
			System.out.print("Booking Month : ");
			
			int month = booking.nextInt();
			
			System.out.print("Booking Day : ");
			
			int day = booking.nextInt();
			
						
			System.out.println("Booking request (" + avaliable + "," + day + "/" + month + "/" + year + ")" );
						
			System.out.println("Returns : " + "\"" + SimpleBookRoom(avaliable,day,month,year) + "\"");
		
		}while (AnotherDay());

	}

	public static boolean SimpleBookRoom(boolean avaliable, int day, int month, int year) {
		
		if (avaliable) {
			
			if (year>=2018) {
				
				if ((month==1 && day<7) || (day>7 && month>=8)) {
					
					return true;
				}
			
			}
		} return false;
		
	}

	public static boolean AnotherDay() {
		
		boolean finish=false;
	
		Scanner AnotherTry = new Scanner(System.in);
	
		System.out.print("Do you want try another day ? (Y/N): ");
	
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
