package Assignment_11;

public class Question_35 {

	public static void main(String[] args) {
		reverseWord("Java is fun");
		
	}

	public static void reverseWord(String word) {
		
		String [] array = word.split(" ");
		
		for (int i = array.length-1; i>=0; i--) {
			
			System.out.print(array[i] + " ");
			
		}
		
	}

}
