package Assignmet_13;

import java.util.Arrays;


public class Question_78 {

	public static void main(String[] args) {
		
		int [][] matrix = {{1,1,1},{1,1,2}};
		int [][] matrix1 = {{2,3,5},{1,1,2}};
		
		System.out.print(Arrays.deepToString(matrix) + " ------> ");
		System.out.println(Arrays.deepToString(scalar(matrix,5)));
		
		System.out.print(Arrays.deepToString(matrix1) + " ------> ");
		System.out.println(Arrays.deepToString(scalar(matrix1,2)));
	}
	
	public static int [][] scalar(int[][] matrix, int num) {
	
		
		for (int i=0; i<matrix.length; i++) {
			
			for(int j=0; j<matrix[i].length; j++) {
			
				matrix[i][j] = matrix[i][j]*num;
				
			}
			
		}
		
		return matrix;
	}

}
