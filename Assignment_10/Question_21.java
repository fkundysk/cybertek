package Assignment_10;

public class Question_21 {

	public static void main(String[] args) {
		
		countPrefix("abXYabc",1);
		countPrefix("abXYabc",2);
		countPrefix("abXYabc",3);
		countPrefix("abXYabcaaabX",3);
				
	}

	public static void countPrefix(String word, int n) {
		
		String keyWord = "";
				
		for (int i=0; i<n; i++) {
			keyWord=keyWord + word.charAt(i);
		}
		
		word = word.substring(keyWord.length());
		
		if (word.contains(keyWord)) {
			System.out.println("true");
			
		} else {
			System.out.println("false");
			
		}
		
			
	}
		
}


