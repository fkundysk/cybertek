package Assignment_12;

import java.util.Arrays;

public class Question_57 {

	public static void main(String[] args) {
		
		int [][] square = {{1, 2, 3}, {4, 5, 6}, {9, 8 ,9}};
		
		checkSquareMatrix(square);
	}

	public static void checkSquareMatrix(int[][] square) {
		
		int sumLrDiagonal = 0;
		int sumRlDiagonal = 0;
		
		for (int i=0; i<square.length; i++) {

			sumLrDiagonal = sumLrDiagonal + square[i][i];
			
			sumRlDiagonal = sumRlDiagonal + square[i][(square.length-1)-i];
			
			System.out.println(Arrays.toString(square[i]));
			
		}
		
		
		if ((Math.abs(sumRlDiagonal-sumLrDiagonal))==2){
			System.out.println("This is Square Matrix");
			
		}else {
			System.out.println("This is not Square Matrix");
		}
			
	}
		
}

