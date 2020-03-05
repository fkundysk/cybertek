package Assignment_11;

import java.util.Arrays;

public class Question_43 {

	public static void main(String[] args) {
		
		int [] numbers = {4, 3, 2, 44, 1, 100, 55};
		
		reverseNumbers(numbers);
		
	}

	public static void reverseNumbers(int[] numbers) {
		
		int swap = 0;
		
		for (int i = 0; i<numbers.length/2; i++){
			
			swap = numbers[i];
			
			numbers[i] = numbers [((numbers.length-1)-i)];
			
			numbers[((numbers.length-1)-i)] =swap;
		
		} System.out.println(Arrays.toString(numbers));
		
	}

}
