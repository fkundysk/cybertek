package Assignment_12;

import java.util.Scanner;

public class Question_53 {

	public static void main(String[] args) {
		
		
		System.out.printf("Total : %.2f", enterPoints());
		

	}

	public static float enterPoints() {
		
		float sum = 0;
		float difficulty = 0;
		float diversScore = 0;
		
				
		float judgesPoints[][] = new float [7][1]; 
		float max = 0;
		float min = 0;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the judges scores. Scores between 0 and 10 ");
		
		for (int i=0; i<judgesPoints.length; i++ ) {
			
			do {
				System.out.print("Enter score for judge " + (i+1) + " : ");
			
				judgesPoints[i][0] = sc.nextFloat();
								
			} while (!(judgesPoints[i][0]>0 && judgesPoints[i][0]<10));
			
			
			if (min==0 && max==0) {
			 min = judgesPoints[i][0];
			 min = judgesPoints[i][0];
			}
			
			if (judgesPoints[i][0] < min ) {
				min = judgesPoints[i][0];
				
			} else if (judgesPoints[i][0] > max) {
				max=judgesPoints[i][0];
				
			}
			sum = sum + judgesPoints[i][0];
			
		}
			sum = sum - min - max;
		
		do {
			System.out.print("Enter the difficulty (between 1.2 and 3.8) : ");
			
			difficulty = sc.nextFloat();
						
		} while (!(difficulty>(1.2) && difficulty<(3.8)));
		
		diversScore = (float) (sum * difficulty * 0.6);
		
		return diversScore;	
	
	}
	

}
