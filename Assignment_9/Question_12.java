package Assignment_9;

public class Question_12 {

	public static void main(String[] args) {
		
		
		firstLast("xHiX");
		firstLast("apple");
		firstLast("xUxL");
		firstLast("JavaX");
	

	}
	
	public static void firstLast (String word) {
		
		if (word.charAt(0) == 'X' || word.charAt(0) == 'x') {
			
			word = word.substring(1);
			
		} 
		if (word.charAt(word.length()-1) == 'X' || word.charAt(word.length()-1) == 'x') {
			
			word = word.substring(0, word.length()-1);
			
		}	
		System.out.println(word);
		
	}

}
