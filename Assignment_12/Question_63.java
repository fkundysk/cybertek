package Assignment_12;

import java.util.Arrays;

public class Question_63 {

	public static void main(String[] args) {
		
		
		double [] doubles = {4.5, 5.3, 6.7, 222, 67, 98.08};
		
		System.out.println("First Array List ---> " + Arrays.toString(doubles));
		System.out.println("Final Array List ---> " + Arrays.toString(newDoubles(doubles)));

	}

	private static double[] newDoubles(double[] arr) {
		
		double [] newArr = new double [(arr.length-2)];
		
		for (int i=0; i<newArr.length; i++) {
			
			newArr[i] = arr[i+2]; 
			
		}
		
		return newArr;
	}
	

}
