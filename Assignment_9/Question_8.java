package Assignment_9;

public class Question_8 {

	public static void main(String[] args) {
		
		readOrNot("dear alejandro.....alot of text");
		readOrNot("thunder blaz is the best drink in the galaxy...");
		readOrNot("subject: important project, Alejandro we refer to you this ....");
		
		
	}

	public static void readOrNot(String words) {
		
		
		if (words.contains("Alejandro") || words.contains("alejandro")) {
			
			System.out.println("read this mail");
			
		} else {
			
			System.out.println("don't read");
		}
		
	}

}
