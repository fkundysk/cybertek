package Assignment_12;

import java.util.ArrayList;

public class Question_64_New {

	public static void main(String[] args) {
		
		
		String [] wordList1 = {"I", "learning", "in", "by"};
		String [] wordList2 = {"am", "Java", "Cybertek", "online"};
		
		System.out.println(combine(wordList1, wordList2).toString());

	}

	public static ArrayList<String> combine(String[] wordList1, String[] wordList2) {
		
		ArrayList<String> combineTwoWords = new ArrayList<String>();
		
		for (int i=0; i<wordList1.length; i++) {
			
			combineTwoWords.add(wordList1[i]+ " " + wordList2[i]);
			
		}
		
		return combineTwoWords;
	}
	
	
	

}
