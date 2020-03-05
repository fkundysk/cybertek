package Assignment_12;

import java.util.Arrays;

public class Question_56 {

	public static void main(String[] args) {
		
		int [] array = {6, 2, 5, 3}; 
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(leftShift(array)));	
	
	}

	private static int [] leftShift (int[] array) {
		
		int dummy = array[0];
		
		for(int i=0; i<array.length-1; i++) {
			
			array[i] = array[i+1];
			
		} array [array.length-1] = dummy;
	
		return array;
		
		
	}

}
