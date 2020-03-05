package Assignment_9;

import java.util.Scanner;

public class Question_14 {

	public static void main(String[] args) {
		
		double insurancePrice=0;
		int drivenDays =0;
		int drivenMiles=0;
		int accNumber=0;
		String referenceNumber = "";
		
		Scanner sc =new Scanner (System.in);
		System.out.println("Welcome to the CountyFarm car insurance!");
		
		System.out.print("Enter your name : ");
		String name = sc.nextLine();
		
		System.out.print("Do you have a US driver licence ? (Yes/No) : ");
		String drvlc = sc.next();
		
			if (!(drvlc.equalsIgnoreCase("yes"))) {
				System.out.println("Invalid data!");
				System.exit(0);
			}
		
		System.out.print("Enter your zip code : ");
		int zipCode = sc.nextInt();
		
		System.out.print("Is this vehicle Owned, Financed, or Leased ? : ");
		String carOwned = sc.next();
		
		System.out.print("How is this vehicle primarilary used (Business / Pleasure / Commute) ? : ");
		String priUse = sc.next();
	
			if (!(priUse.equalsIgnoreCase("pleasure"))) {
			
					System.out.print("Days Driven to Work and/or School ? : ");
					drivenDays = sc.nextInt();
				
					System.out.print("Miles Driven to Work and/or School ? : ");
					drivenMiles = sc.nextInt();
					
			}
		
		System.out.print("How old are you? : ");
		int age = sc.nextInt();
		
			if (age <16) {
				
				System.out.println("Invalid data");
				System.exit(0);
			}
		
		System.out.print("How many years you have been driving ? : ");
		int experience = sc.nextInt();
		
			if (!(experience>0 && (age-experience)>=16)) {
				System.out.println("Ivalid data");
				System.exit(0);
			}
			
		System.out.print("How you had any accidents in the last 5 years ? (Yes/No) : " );
		String accAnswer = sc.next();
		
			if (accAnswer.equalsIgnoreCase("yes")) {
				System.out.print("How many ? ");
				accNumber = sc.nextInt();
				
			}
			
		System.out.print("Have you had continous insurance for the past 12 months ? (Yes/No) : ");
		String insAnswer = sc.next();
		
		System.out.print("What is the highest level of education you completed ? (PhD/Bachelors/Masters/Doctors/Less than High Scholl) : ");
		String educationStatus = sc.next();
		
		
		if (zipCode==20910 || zipCode==20740) {
			insurancePrice = insurancePrice + 60;
			
		} else if (zipCode==22102 || zipCode==22103) {
			insurancePrice = insurancePrice + 30;
			
		} else {
			insurancePrice = insurancePrice + 50;
		}
		
		
		if (carOwned.equalsIgnoreCase("owned")) {
			insurancePrice = insurancePrice + 10;
			
		} else if (carOwned.equalsIgnoreCase("financed") || carOwned.equalsIgnoreCase("leased")){
			insurancePrice = insurancePrice + 20;
		}
		
		
		if (priUse.equalsIgnoreCase("business")) {
			insurancePrice = insurancePrice + 50 + (drivenDays*5) + (drivenMiles*1);
			
		} else if (priUse.equalsIgnoreCase("commute")) {
			insurancePrice = insurancePrice + 20 + (drivenDays*5) + (drivenMiles*1);
			
		} else if (priUse.equalsIgnoreCase("pleasure")) {
			insurancePrice = insurancePrice + 10;
			
		}
			
		if (age>=16 && age<18) {
			insurancePrice = insurancePrice * 20;
			
		} else if (age>=18 && age<=21) {
			insurancePrice = insurancePrice * 6;
			
		} else if (age>21 && age<25) {
			insurancePrice = insurancePrice *2;
			
		}	
		
		if (experience>0) {
			insurancePrice = insurancePrice - (experience * 5);
		}
		
		if (accNumber>0) {
			for (int i=1; i<=accNumber; i++) {
				insurancePrice = insurancePrice + (insurancePrice*0.2);
			}
		}
		
		if (insAnswer.equalsIgnoreCase("no")) {
			insurancePrice = insurancePrice * 2;
			
		}
		
		if (educationStatus.equalsIgnoreCase("PhD") || educationStatus.equalsIgnoreCase("bachelors") || educationStatus.equalsIgnoreCase("masters")) {
			insurancePrice = insurancePrice - (insurancePrice * 0.05);
		
		} else if (educationStatus.equalsIgnoreCase("Doctors")) {
			insurancePrice = insurancePrice - (insurancePrice * 0.1);
			
		}else if (educationStatus.equalsIgnoreCase("Less than High School")) {
			insurancePrice = insurancePrice + (insurancePrice * 0.05);
		
		}
		System.out.println("----------------------------------------");
		System.out.println(name + ", here's your quote!");
		System.out.println("Start your Policy Today For : $" + insurancePrice);
		
		name = name.toUpperCase();
		educationStatus = educationStatus.trim();
		educationStatus = educationStatus.toUpperCase();
		referenceNumber = referenceNumber.concat(name.substring(0, 2)) + age + name.substring(name.length()-2) + zipCode + educationStatus; 
		
		System.out.println("Reference Number : " + referenceNumber );
		
		

	}

}
