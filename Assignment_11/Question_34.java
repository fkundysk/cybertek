package Assignment_11;

public class Question_34 {

	public static void main(String[] args) {
		
		reversePrint("Java is fun");
	
	}

	public static void reversePrint(String word) {
		
		String [] array = word.split(" ");
		
		for (int i = array.length-1; i>=0; i--) {
			
			System.out.println(array[i]);
			
		}
		
	}

}
