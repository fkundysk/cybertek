package Assignment_11;

public class Question_41 {

	public static void main(String[] args) {
		
		int [] growthByYear = {1,1,1,2,2,2,2,2,2,2};
		
		int growth=0;
		 
		for (int i=0; i<growthByYear.length; i++) {
			
			growth = growth + growthByYear[i];
			
			System.out.println("year " + (i+1) + " - growth " + growthByYear[i] + " cm" );
			System.out.println("tree size : " + growth + " cm");
		}
		
	}
}
