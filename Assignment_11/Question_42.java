package Assignment_11;

import java.util.Arrays;

public class Question_42 {

	public static void main(String[] args) {
		
		String [] arr = {"aa", "be", "lol", "lel", "oreo"}; 
		String [] arr1 = {"e", "hey", "bye", "furey", "spoon"};
		
		containEwords(arr);
		containEwords(arr1);
		
		
		
	}

	public static void containEwords(String[] arr) {
				
		int x=0;
		
		String [] fewValues = new String [numberOfContainE(arr)];
		
		for (int i=0; i<arr.length; i++) {
			
			if (arr[i].contains("e")) {
				
				fewValues[x] = arr[i];
				x++;
			}
		} System.out.println(Arrays.toString(fewValues));
	}
	
	
	public static int numberOfContainE(String[] arr) {
		
		int x = 0;

		for (int i=0; i<arr.length; i++) {
			
			if (arr[i].contains("e")) {
				
				x++;
			}
		} return x;
	}

}

	