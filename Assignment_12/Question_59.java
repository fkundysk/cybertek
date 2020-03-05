package Assignment_12;

import java.util.Arrays;

public class Question_59 {

	public static void main(String[] args) {
		
		int [][] mergR = {{1, 2, 3}, {4, 5, 6} };
		
		System.out.println(Arrays.toString(splitMergeR(mergR)));

	}

	public static int [] splitMergeR(int[][] mergR) {
		
		int lengthOfNewArray = 0;
		
		for (int i=0; i<mergR.length; i++) {
			
			lengthOfNewArray = lengthOfNewArray + mergR[i].length;
			
		}
		
		int [] newArray = new int[lengthOfNewArray];
		int indexOfNewArray = 0;
		
		for (int i=0; i<mergR.length; i++) {
			
			for (int j=0; j<mergR[i].length;j++) {
				
				newArray[indexOfNewArray] = mergR[i][j];
				indexOfNewArray++;
			}
			System.out.print(Arrays.toString(mergR[i]));
		}
		System.out.print("----> ");
		return newArray;
			
	}

}
