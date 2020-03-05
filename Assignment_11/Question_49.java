package Assignment_11;

import java.util.Arrays;

public class Question_49 {

	public static void main(String[] args) {
		
		int [] numbers = {1,2,3};
		int [] numbers1 = {1};
		
		printFirstTwo (numbers);
		printFirstTwo (numbers1);
		

	}

	public static void printFirstTwo(int[] numbers) {
		
		if (numbers.length<2) {
			int [] newArray = new int[1];
			newArray [0] = numbers [0];
			System.out.println(Arrays.toString(newArray));
			
		} else {
		
			int [] newArray = new int [2];
			
				for (int i=0; i<newArray.length; i++) {
					newArray[i] = numbers[i];
				
			} 
			System.out.println(Arrays.toString(newArray));
		}	
		
	}
	
}
