package Assignmet_13;

import java.util.Arrays;

public class Question_71 {

	public static void main(String[] args) {
	
		
		System.out.println(Arrays.toString(populate(new int [3])));
		System.out.println(Arrays.toString(populate(new int [5])));
		
		
	}

	public static int [] populate(int[] array) {
		
		for (int i=0; i<array.length; i++) {
			
			array[i] = i+1;
			
		}
		
		return array;
		
	}

}
