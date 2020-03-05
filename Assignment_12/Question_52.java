package Assignment_12;

public class Question_52 {

	public static void main(String[] args) {
		
		int [][] arr = {{2,2,1,3,4,5}, {5,2,3,3,4,5}, {3,2,3,1,4,5}};
		
		System.out.println("Matches : " + findMatches(arr));
		
	}

	public static int findMatches(int[][] arr) {
		
		int number = 0;
		
		for (int i=0; i<arr.length; i++) {
			
			for (int j=0; j<arr [i].length; j++) {
				
				if (i == arr[i][j]) {
					
					number = i;
					
				}
			} 
			
		}
		return number;
	}
	
}
