package Assignment_10;

public class Question_24 {

	public static void main(String[] args) {
		
		isEqual("We study java not phyton");
		isEqual("What's the difference between java, javascript and phyton?");
		

	}
	private static void isEqual(String word) {
		
		int countJava=0;
		int countPhyton=0;
		
		String [] wordArray = word.split(" ");
		
		for (int i=0; i<wordArray.length;i++) {
			
			if (wordArray[i].contains("java")) {
				
				countJava = countJava +1;
				
			} else if (wordArray[i].contains("phyton")) {
				
				countPhyton = countPhyton + 1;
				
			}
			
		}
		
		if (countJava == countPhyton) {
			
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	
	}		
	

}
