package Assignment_12;

import java.util.ArrayList;

public class Question_63_New {

	public static void main(String[] args) {
		
		ArrayList<Double> doubles = new ArrayList<>();
		
		doubles.add(4.6);
		doubles.add(5.0);
		doubles.add(6.9);
		doubles.add(4.2);
		
		System.out.print(doubles.toString() + " --------> ");
		
		System.out.println(removeFirstTwo(doubles).toString());
	
	}

	private static  ArrayList<Double> removeFirstTwo(ArrayList<Double> doubles) {
		
		doubles.remove(0);
		doubles.remove(0);
		
		return doubles;
	}

}
