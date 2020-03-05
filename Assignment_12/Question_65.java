package Assignment_12;

import java.util.Arrays;

public class Question_65 {

	public static void main(String[] args) {
		
		String [] wordList = {"one", "two", "three", "one", "one", "five"};
		String targetWord = "one";
		
		removeAll (wordList, targetWord);
		
	}
	

	public static void removeAll(String[] wordList, String targetWord) {
		
		int counter=0;
		
		for (String arr : wordList){
			if (arr.equals(targetWord)) {
				counter++;
				
			}
		}
		
		String [] newArray = new String [wordList.length-counter]; 
		
			
		for (int i=0, k=0; i<wordList.length;i++,k++){
			
			if (!(wordList[i].equals(targetWord))){
				
				newArray[k]=wordList[i];
				
			}else {
				
				k--;
				
			}
		}
		System.out.println(Arrays.toString(newArray));
	
	}
	
}
