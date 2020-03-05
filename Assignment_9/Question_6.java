package Assignment_9;

public class Question_6 {

	public static void main(String[] args) {
		
		reverseWord("apple");
		reverseWord("cat");
		reverseWord("universe");
		

	}

	public static void reverseWord(String word) {
		
		
		if (word.length()==5) {
			char zero = word.charAt(0);
			char one = word.charAt(1);
			String word1 = "";
			
			for (int i=word.length()-1; i>=3;i--) {
				word1 = word1 + word.charAt(i);
			} 
			
			word1 = word1+word.charAt(2)+one+zero;
			System.out.println(word1);
			
		} else if (word.length()<5) {
			System.out.println("Too short");
					
		} else if (word.length()>5) {
			System.out.println("Too long");
			
		}
		
		
	}
}

