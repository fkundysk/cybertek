package Assignment_12;

import java.util.ArrayList;

public class Question_65_New {

	public static void main(String[] args) {
		
		ArrayList<String> wordList = new ArrayList<String>();
		
		wordList.add("apple imac");
		wordList.add("apple macBook");
		wordList.add("Samsung s3");
		wordList.add("Sony");
		wordList.add("apple iphone");
		wordList.add("Acer");
		
		String targetWord = "apple";
		
		removeAll(wordList, targetWord);

	}

	public static void removeAll(ArrayList<String> wordList, String targetWord) {
		
		int first =0;
		int last = 0;
		
		
		for (int i=0; i<wordList.size(); i++) {
			
			String newWord = "";
			
			if (wordList.get(i).contains(targetWord)) {
				
				first = wordList.get(i).indexOf(targetWord.charAt(0));
				last = wordList.get(i).indexOf(targetWord.charAt(targetWord.length()-1));
				
				wordList.set(i, wordList.get(i).substring(0, first).trim() + wordList.get(i).substring(last+1).trim()) ;
					
				}
				
			}
			System.out.println(wordList.toString());
			
		}
	
}
