package assignment_14;

import java.util.Scanner;

public class Q_9_Telephone {
	
	String calledNumber;
	
	public static int calledQuantity =250;
	
	public static double calledTotal = 15658.92;
	
	

	public String getNumber() {
		
		String manipulatedNumbers = "Call Number: " + calledNumber + " | Called Quantity: " +  calledQuantity + " | Called Total: " + calledTotal;
		
		return manipulatedNumbers;
	}

	
	public void setNumber() {
		
		System.out.println("Current calledNumber : " + calledNumber);
		System.out.print("Do you want to change calledNumber ? (Y/N) : ");
		 
		Scanner sc = new Scanner(System.in);
		
		 if (sc.nextLine().equalsIgnoreCase("y")) {
			 
			System.out.print("Enter new calledNumber : ");	
			calledNumber = sc.nextLine();
			
		 }
		
		 sc = new Scanner(System.in);
		 System.out.println("Current calledQuantity : " + calledQuantity);
		 System.out.print("Do you want to change calledQuantity ? (Y/N) : ");
		 
		 if (sc.next().equalsIgnoreCase("y")) {
			 
			System.out.print("Enter new calledQuantity : ");
			calledQuantity = sc.nextInt();
				
		 }
		
		 sc = new Scanner(System.in);
		 System.out.println("Current calledTotal : " + calledTotal);
		 System.out.print("Do you want to change calledTotal ? (Y/N) : ");
		 
		 if (sc.next().equalsIgnoreCase("y")) {
			 
			System.out.print("Enter new calledTotal : ");
			calledTotal = sc.nextDouble();
				
		 }
		 sc.close();
		 
	}

}


package assignment_14;

public class Q_9_TelephoneTest {

	public static void main(String[] args) {
		
		Q_9_Telephone tel = new Q_9_Telephone();
		
		tel.toString();
		
		tel.setNumber();
		
		System.out.println(tel.getNumber());

	}

}
