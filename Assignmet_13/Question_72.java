package Assignmet_13;

import java.util.ArrayList;

public class Question_72 {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> deliver = new ArrayList<Integer>();
		
		deliver.add(7);
		deliver.add(7);
		deliver.add(7);
		
		int eachFuel = 7;
		
		ArrayList<Integer> deliver1 = new ArrayList<Integer>();
		
		deliver1.add(9);
		deliver1.add(1);
		
		int eachFuel1 = 3;

		ArrayList<Integer> deliver2 = new ArrayList<Integer>();
		
		deliver2.add(100);
		deliver2.add(200);
		deliver2.add(10);
		
		int eachFuel2 = 10;
				
		System.out.println(refuel_times(deliver, eachFuel));
		System.out.println(refuel_times(deliver1, eachFuel1));
		System.out.println(refuel_times(deliver2, eachFuel2));
		

	}

	private static int refuel_times(ArrayList<Integer> deliver, int a) {
		
		double stop = 0;
		
		for (int i = 0; i<deliver.size(); i++) {
			
			double dummy = deliver.get(i);
			
			stop = stop + (Math.ceil(dummy/a));
			
		}
		System.out.print(deliver.toString() + ", " + a + " \t-----> Stop for refuel : ");
	
		return (int) stop;
	}

}
