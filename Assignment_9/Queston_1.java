package Assignment_9;

import java.util.Scanner;

public class Queston_1 {

	public static void main(String[] args) {
		
		boolean isSplit = isSplit();		
		int numberPeople =numberPeople();
		double checkAmount = checkAmount();
		String serviceQuality = serviceQuality();
		
		
		tipCalculator(isSplit,numberPeople,checkAmount,serviceQuality);
		
	}

	public static void tipCalculator(boolean isSplit, int numberPeople, double checkAmount, String serviceQuality) {
		
		double totalPay=0;
		double totalTip=0;
		double totalPerPerson=0;
		double tipPerPerson=0;
		
		System.out.println("Number of people entered : " + numberPeople);
		
		
		
		switch (serviceQuality) {
		
			case "poor": case "Poor": case "POOR":
				totalTip = checkAmount*0.05;
				totalPay = totalTip + checkAmount;
				break;
			
			case "fair": case "Fair": case "FAIR":
				totalTip = checkAmount*0.1;
				totalPay = totalTip + checkAmount;
				break;
				
			case "good": case "Good": case "GOOD":
				totalTip = checkAmount*0.15;
				totalPay = totalTip + checkAmount;
				break;
 
			case "great": case "Great": case "GREAT":
				totalTip = checkAmount*0.20;
				totalPay = totalTip + checkAmount;
				break;
			
			case "excellent": case "Excellent": case "EXCELLENT":
				totalTip = checkAmount*0.25;
				totalPay = totalTip + checkAmount;
				break;
		
			default:
				break;
		}
		
		
		if (isSplit) {
			System.out.println("Total to pay : " + totalPay);
			System.out.println("Total tip : " + totalTip);
			System.out.println("Total per person : " + totalPay/numberPeople);
			System.out.println("Tip per person : " + totalTip/numberPeople);
			
			
		} else {
			System.out.println("Total to pay : " + totalPay);
			System.out.println("Total tip : " + totalTip);
		}
		
	}

	public static String serviceQuality() {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Please Select Your Service Quality");
		System.out.println("Poor\nFair\nGood\nGreat\nExcellent");
		System.out.print("Service Quality : ");
		String choose = sc.next();
		while(!(choose.equalsIgnoreCase("Poor") ||choose.equalsIgnoreCase("Fair") || choose.equalsIgnoreCase("Good") 
				|| choose.equalsIgnoreCase("Great") || choose.equalsIgnoreCase("Excellent"))) {
			
			System.out.println("Invalid Selection");
			System.out.println("Please Select Your Service Quality");
			choose = sc.next();
		}
		
		return choose;
	}

	public static double checkAmount() {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Check Amount : ");
		double amount = sc.nextDouble();
		return amount;
	}

	public static boolean isSplit() {
		
		boolean isSplit=false;
		Scanner sc = new Scanner (System.in);
		System.out.print("Split (Y/N) : ");
		String choose = sc.next();
		
		while(!(choose.equalsIgnoreCase("Y") || choose.equalsIgnoreCase("N"))) {
			
			System.out.print("Invalid input please enter your choose Y/N : ");
			choose = sc.next();
		}
		
		if (choose.equalsIgnoreCase("Y")) {
			isSplit = true;
		} else if (choose.equalsIgnoreCase("N")) {
			isSplit = false;
		}
		return isSplit;
		
	}

	public static int numberPeople() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Number of people entered : ");
		
		int number = sc.nextInt(); 
		
		return number;
	}

}
