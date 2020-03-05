package Assignment_9;

import java.util.Scanner;

public class Question_2 {

	public static void main(String[] args) {
		
		double computerPrice = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Select screen size (13.3inc / 15.0inc / 17.3inc) : ");
		double screenSize = sc.nextDouble();
		
			while(!(screenSize==13.3 || screenSize==15.0 || screenSize==17.3)) {
			System.out.println("Invalid input");
			System.out.print("Select screen size (13.3inc / 15.0inc / 17.3inc) : ");
			screenSize = sc.nextDouble();
			}
		
		
		System.out.print("Select CPU type (i3 / i5 / i7) : ");
		String cpuType = sc.next();
		
			while(!(cpuType.equalsIgnoreCase("i3") || cpuType.equalsIgnoreCase("i5") || cpuType.equalsIgnoreCase("i7"))) {
			System.out.println("Invalid input");
			System.out.print("Select CPU type (i3 / i5 / i7) : ");
			cpuType = sc.next();
			}
		
		
		System.out.print("Select RAM size (4 / 8 / 16 / 32 ...) : ");
		int ramSize = sc.nextInt();
		
			while(!(ramSize%4==0)) {
			System.out.println("Invalid input");
			System.out.print("Select RAM size (4 / 8 / 16 / 32 ...) : ");
			ramSize = sc.nextInt();
			}
		
		
		System.out.print("Select storage type (SSD / HDD) : " );
		String storageType = sc.next();
		
			while(!(storageType.equalsIgnoreCase("SSD") || storageType.equalsIgnoreCase("HDD"))) {
			System.out.println("Invalid input");
			System.out.print("Select storage type (SSD / HDD) : " );
			storageType = sc.next();
			}
		
			
		System.out.print("Enter memory size (500 / 1000 / 1500 ....) : ");
		int memorySize = sc.nextInt();
		
			while(!(memorySize%500==0)) {
			System.out.println("Invalid input");
			System.out.println("Enter memory size (500 / 1000 / 1500 ....) : ");
			memorySize = sc.nextInt();
			}
		
		
		System.out.print("Enter screen resolution (FullHD / 4K) : ");
		String screenResolution = sc.next();
		
			while(!(screenResolution.equalsIgnoreCase("FullHD") || screenResolution.equalsIgnoreCase("4K"))) {
			System.out.println("Invalid input");
			System.out.println("Enter screen resolution (FullHD / 4K) : ");
			screenResolution = sc.next();
			}
		
		if (screenSize==13.3) {
			computerPrice = computerPrice + 200;
					
		} else if (screenSize==15.0) {
			computerPrice = computerPrice + 300;
			
		} else {
			computerPrice = computerPrice + 400;
		}
		
		
		if (cpuType.equalsIgnoreCase("i3")) {
			computerPrice = computerPrice + 150;
			
		} else if (cpuType.equalsIgnoreCase("i5")){
			 computerPrice = computerPrice + 250;
			
		} else {
			computerPrice = computerPrice + 350;
		}
		
		
		for (int i=1; i<=(ramSize/4); i++) {
			 computerPrice = computerPrice + 50;
		}
		
		if (storageType.equalsIgnoreCase("HDD")) {
				
			for (int i=1; i<=(memorySize/500); i++) {
				computerPrice = computerPrice + 50;
			}
		} else if (storageType.equalsIgnoreCase("SSD")) {
			
			for (int i=1; i<=(memorySize/500); i++) {
				computerPrice = computerPrice + 100;
			}
		}
		
		if (screenResolution.equalsIgnoreCase("FullHD")) {
			computerPrice = computerPrice + 100;
			
		} else if (screenResolution.equalsIgnoreCase("4K")) {
			computerPrice = computerPrice + 200;
		}
		
		System.out.println("Laptop price : $" + computerPrice);
		
		
	}

}
