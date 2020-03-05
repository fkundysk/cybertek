package Assignment_12;

import java.util.Arrays;

public class Question_58 {

	public static void main(String[] args) {
		
		int [][] array = {{1,2,3},{5,33,9}};
		
		maxValueAll(array);
	}

	public static void maxValueAll(int[][] array) {
		
		int max = 0;
		
		for (int i=0; i<array.length; i++){
			
			for(int j=0; j<array[i].length;j++){
				
				if (array[i][j]>max) {
					max=array[i][j];
				}
			}
		}

		System.out.print("[");
		for (int i=0; i<array.length; i++){
			
			for(int j=0; j<array[i].length;j++){
				
				array[i][j]=max;
			}
			
			if (i==(array.length-1)) {
				System.out.print(Arrays.toString(array[i]) + "]");
				
			}else {
				System.out.print(Arrays.toString(array[i]) + ", ");
			}
		}
	}
	
	

}
