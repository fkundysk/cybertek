package Assignment_9;

public class Question_7 {

	public static void main(String[] args) {
		
		halfOfWord("java");
		halfOfWord("sakisuk");
		
	}

	public static void halfOfWord(String word) {
		
		if (word.length()%2==0) {
			
			int mid = word.length()/2;
			
			String twiceOfWord = word.substring(0, mid) + word.substring(0, mid); 
			
			System.out.println(twiceOfWord);
		} else {
			
			System.out.println("Try another word");
		}
	
	}

}
