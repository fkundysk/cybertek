package Assignment_11;

import java.util.Arrays;

public class Question_37 {

	public static void main(String[] args) {
		
		String [] words = {"hello", "why", "by", "apple", "note"};
		
		printFirstLast(words);
	
	}

	public static void printFirstLast(String[] words) {
		
		System.out.print(Arrays.toString(words) + "--->");
		
		for (int i=0; i<words.length; i++) {
			
			String dummy = "";
			
			dummy = dummy + words[i].charAt(0) + words[i].charAt(words[i].length()-1);
			
			words[i] = dummy;
		
		} System.out.println(Arrays.toString(words));
		
	}

}
