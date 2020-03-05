package Assignmet_13;

public class Question_77 {

	public static void main(String[] args) {
		
		int [] product = {1, 1, 0, 0};
		
		int limit = 2;
		
		System.out.println(badP(product, limit));

	}

	private static boolean badP(int[] product, int limit) {
		
		int counter = 0;
		
		for (int arr : product) {
			
			if (arr==0) {
				
				counter++;
				
			}
			
		}
		if (counter<limit) {
			 return true;
			
		} else {
		
		return false;
		}
	}

}
