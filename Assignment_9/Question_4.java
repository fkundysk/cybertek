package Assignment_9;

public class Question_4 {

	public static void main(String[] args) {
		
		printMiddleThree("fifteen");
		printMiddleThree("apple");
		printMiddleThree("hey");
		printMiddleThree("java");
		printMiddleThree("Whatsup");
		printMiddleThree("$");
		
		
	}

	public static void printMiddleThree(String word) {
		
		int length = word.length();
		
		if (length%2==1 && length>=5){
			
			int midWord = (length-1)/2;
			System.out.println(word.substring(midWord-1, midWord+2));
		
		} else {
			
			System.out.println("invalid");
		}
	}

}
