package Assignmet_13;

import java.util.ArrayList;

public class Question_75 {

	public static void main(String[] args) {
		
		
		ArrayList<String> wordList = new ArrayList<String>();
		
			wordList.add("one apple");
			wordList.add("two orange");
			wordList.add("four banana");
		
			String targetWord = "four";	
			
			
		ArrayList<String> wordList2 = new ArrayList<String>();
			wordList2.add("hello");
			wordList2.add("world");
			
			String targetWord2 = "goodbye";
		
		System.out.println(searchTarget(wordList, targetWord));
		System.out.println(searchTarget(wordList2, targetWord2));

	}

	public static String searchTarget(ArrayList<String> wordList, String targetWord) {
		
		String result = "";
		
		
		for (int i=0; i<wordList.size(); i++) {
			
			if (wordList.get(i).contains(targetWord)) {
				
				result = result + wordList.get(i) + " ";
					
			} 
				
		}
		
		if (!(result.equals(""))) {
			return result;
			
		} else {
			return "search failed";
		}
	}

}
