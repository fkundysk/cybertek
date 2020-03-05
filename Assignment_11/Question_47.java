package Assignment_11;

import java.util.Arrays;

public class Question_47 {

	public static void main(String[] args) {
		
		int [] inhabitants = {3, 6, 0, 4, 3, 2,7, 1};
		
		noHumansLeft(inhabitants);

	}

	public static void noHumansLeft(int[] citiesPopulation) {
				
		int day = 0;
		
		int indexOfBiggest = 0;
		
		for (int i=1; i < citiesPopulation.length; i++ ) {
			
			if (citiesPopulation[i]>citiesPopulation[0]) {
				
				indexOfBiggest=i;
			}
		}
		
		do {
			
		System.out.println("Day " + day +  " " + Arrays.toString(citiesPopulation));
		
		for (int x=0; x<citiesPopulation.length; x++) {
			
			citiesPopulation[x] = citiesPopulation[x]/2; 
			
		}
		
		day++;
				
		} while (citiesPopulation[indexOfBiggest]!=0);
		
		System.out.println("Day " + day +  " " + Arrays.toString(citiesPopulation));
		
		System.out.println("---- EXTINCT -----");
	
	}

}
