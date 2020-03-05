package Assignment_12;

import java.util.Arrays;

public class Question_64 {

	public static void main(String[] args) {
		
		String [] wordList1 = {"I", "learning", "in", "by"};
		String [] wordList2 = {"am", "Java", "Cybertek", "online"};
		
		System.out.println(Arrays.toString(combineAL(wordList1,wordList2)));
		

	}

	public static String[] combineAL(String[] wordList1, String[] wordList2) {
		
		String [] newArray = new String [wordList1.length];
		
		for (int i=0; i<newArray.length; i++) {
			
			for (int j=0; j<newArray.length; j++) {
			
				newArray[i] = wordList1[i]+ " " + wordList2[i];
		
			}
		}
		return newArray;
	}

}
