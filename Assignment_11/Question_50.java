package Assignment_11;

import java.util.Arrays;

public class Question_50 {

	public static void main(String[] args) {
		
		int [] array = {4, 5, 6};
		int [] array1 = {0};
		int [] array2 = {1, 2, 3, 4};
		
		printLastNumber(array);
		printLastNumber(array1);
		printLastNumber(array2);
		
		

	}

	public static void printLastNumber(int[] array) {
		
		int [] newArray = new int[array.length*2];
		
		newArray[newArray.length-1]=array[array.length-1];
		
		System.out.println(Arrays.toString(newArray));
	} 

}
