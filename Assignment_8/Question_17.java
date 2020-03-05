package Assignment_8;

import java.util.Scanner;

public class Question_17 {

	public static void main(String[] args) {
		
		do {
			Scanner CrazyDrink = new Scanner(System.in);
			
			System.out.print("Available at store true/false : ");
			
			boolean avaliable = CrazyDrink.nextBoolean();
			
			System.out.print("Got it as a gift true/false : ");
			
			boolean gift = CrazyDrink.nextBoolean();
			
			System.out.print("ingredient1 : ");
			
			int ingredient1 = CrazyDrink.nextInt();
			
			System.out.print("ingredient2 : ");
			
			int ingredient2 = CrazyDrink.nextInt();
			
			System.out.print("ingredient3 : ");
			
			int ingredient3 = CrazyDrink.nextInt();
						
			System.out.println("getThunderBlazz (" + avaliable + "," + gift + ","+ ingredient1 + "," + ingredient2 + "," + ingredient3 + ")" );
						
			System.out.println("Returns : " + "\"" + getThunderBlazz(avaliable,gift,ingredient1,ingredient2,ingredient3) + "\"");
		
		}while (AnotherTry());

	}

	public static boolean getThunderBlazz(boolean avaliable, boolean gift, int ingredient1, int ingredient2,
			int ingredient3) {
		
		if ((avaliable || gift) || ((ingredient1==1 || ingredient1==3) && (ingredient2==2 || ingredient2==1) && (ingredient3==3 || ingredient3==2))) {
			
			return true;
		}
		
		return false;
	}
	
	public static boolean AnotherTry() {
		
		boolean finish=false;
	
		Scanner AnotherTry = new Scanner(System.in);
	
		System.out.print("Do you want try another try ? (Y/N): ");
	
		String answer = AnotherTry.next();
		
		if (answer.equals("Y") || answer.equals("y")) {
			finish = true;
			
		}else if(answer.equals("N") || answer.equals("n")) {
			System.out.println("Good Bye");
				
		} else if (!answer.equals("Y") || !answer.equals("y") || !answer.equals("N") || !answer.equals("n")) {
			System.out.println("Invalid Input");
			AnotherTry();
		
	
	 /* switch (answer) {
	
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
			*/
	}
		return finish;
	
	}
}
