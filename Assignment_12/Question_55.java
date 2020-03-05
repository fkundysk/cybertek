package Assignment_12;

import java.util.Arrays;

public class Question_55 {

	public static void main(String[] args) {
		
		String [][] chessBoard = new String [8][8];

		drawChess(chessBoard);
	}

	public static void drawChess(String[][] chessBoard) {
		
		String [] letters = {"a", "b", "c", "d", "e", "f", "g", "h"};
		
		System.out.print("[");
		
		for (int i=0 ; i<chessBoard.length; i++) {
			
			for (int j =0; j<chessBoard[i].length; j++) {
				
				chessBoard[i][j] = (i+1)+letters[j];
			}
			
			if (i!=chessBoard.length-1) {
				
				System.out.print(Arrays.toString(chessBoard[i]) + ", ");
			}else {
				System.out.print(Arrays.toString(chessBoard[i]) + "]");
			}
			
		}
		
	}

}
