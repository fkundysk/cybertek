package Assignment_8;

import java.util.Scanner;

public class Question_13 {

	public static void main(String[] args) {

		do {
			Scanner water = new Scanner(System.in);
			
			System.out.print("Please enter your water usage : ");
			
			double WaterUsage = water.nextDouble();
			
			WaterTax(WaterUsage);
			
			System.out.println("WaterTax (" + WaterUsage + ")");
			System.out.println("Return : $" + WaterTax(WaterUsage));
	
		}while (AnotherCalculation());
		
	}
	
	public static double WaterTax (double WaterUsage) {
			
		double WaterBill=0;
		
		if (WaterUsage>0 && WaterUsage<=50) {
			
			WaterBill = WaterUsage*0.60;
			
		} else if(WaterUsage>50 && WaterUsage<=100) {
			
			WaterBill = WaterUsage*0.9;
			
		}	else if(WaterUsage>100 && WaterUsage<=150) {
			
			WaterBill = (WaterUsage*0.9) + 50;
			
		}	else if (WaterUsage>150) {
			
			WaterBill = (WaterUsage*0.9) + 100;
			
		} return WaterBill;
		
	}
		
	public static boolean AnotherCalculation() {
		
		boolean finish=false;
	
		Scanner AnotherTry = new Scanner(System.in);
	
		System.out.print("Do you want another calculation ? (Y/N): ");
	
		String answer = AnotherTry.next();
	
		label11:switch (answer) {
	
		case "N": case "n":
			finish=false;
			System.out.println("Good Bye");
			break;
		
		case "Y": case "y":
			finish=true;
			break;
			
		default:
			
			System.out.println("Invalid Input");
			System.out.print("Please enter (Y/N): ");
			String answer2 = AnotherTry.next();
			answer=answer2;
			break label11;
			
			
			
			
			
	}
		return finish;
	
	}

}
