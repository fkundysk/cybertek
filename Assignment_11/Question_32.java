package Assignment_11;

public class Question_32 {

	public static void main(String[] args) {
		
		
		String [] array = new String[5];
		array [0] = "apple";
		array [1] = "banana";
		array [2] = "orange";
		array [3] = "strawberry";
		array [4] = "lemon";
		
		printArrayThreeLetter(array);

	}

	public static void printArrayThreeLetter(String[] array) {
		
		for (String arr : array) {
			System.out.println(arr.substring(0, 3));
		}
	
	}

}