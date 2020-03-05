package Assignment_11;

public class Question_33 {

	public static void main(String[] args) {
		
		String [] array = {"hello", "why", "by", "apple", "note"};

		printFirstLast(array);
	}

	public static void printFirstLast(String[] array) {
		
		for (String arr : array) {
			
			System.out.print(arr.charAt(0));
			System.out.println(arr.charAt(arr.length()-1));
		}
	}
}


