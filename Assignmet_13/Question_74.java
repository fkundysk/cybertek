package Assignmet_13;

import java.util.ArrayList;

import java.util.Scanner;

public class Question_74 {

	public static void main(String[] args) {
		
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		Scanner sc = new Scanner(System.in);

		//String answer;
		
		do {
		
		System.out.print("Please Enter Your Array List Numbers (Max 6) : ");
		
		array.add(sc.nextInt());
		
		//System.out.print("Do you wanna continue ? (Y/N) : ");
		
		//answer = sc.next();
		
	//	} while (!(answer.contentEquals("n") || answer.contentEquals("N")));
	
		} while (array.size()<6);
		
		System.out.print("Please Enter The Number Remove From Your Array List : ");
		
		int number=sc.nextInt();
		
		System.out.print("Your created array : " + array + " , " + number + " removed from array  -------> ");
		
		System.out.println(removeInt(array,number));
		
		sc.close();
		

	}

	public static ArrayList<Integer> removeInt(ArrayList<Integer> array, int number) {
		
		
		for (int i=0; i<array.size(); i++) {
			
			if (array.get(i) == number) {
				
				array.remove(i);
				
			} 
			
		}
		return array;
	
	}

}
