package Assignment_11;

import java.util.Arrays;

public class Question_46 {

	public static void main(String[] args) {
		
		String [] words = {"olive", "fish", "pursuit", "old", "warning", "python", "java", "coffee", "cat", "ray"};

		printAllShortest(words);
	}

	public static void printAllShortest(String[] words) {
		
		String shortest = words[0];
		String shortestWords = "";
		
		for (String arr : words) {
			
			if (arr.length()<=shortest.length()) {
				
				shortest = arr;
				
			}
		} 
		
		for (String arr : words) {
			
			if (arr.length()==shortest.length()) {
				
				shortestWords = shortestWords + arr + " ";
				
			} 
			
		} 
		
		String [] str = shortestWords.split(" ");
		
		System.out.println(Arrays.toString(str));
		
	}

}
