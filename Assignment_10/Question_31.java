package Assignment_10;

public class Question_31 {

	public static void main(String[] args) {
		
		System.out.println(isPalindrome("Noon"));
		System.out.println(isPalindrome("I am not polindrome"));
		System.out.println(isPalindrome("wooden"));
		System.out.println(isPalindrome("Nurses Run"));
	
	}

	public static boolean isPalindrome(String word) {
		
		word = word.replace(" ", "");
		
		String reverseWord = "";
		
		for (int i=word.length()-1; i>=0; i--) {
			
			reverseWord = reverseWord + word.charAt(i);
		}
		
		if (word.equalsIgnoreCase(reverseWord)) {
			return true;
			
		}	return false;
	}

}
