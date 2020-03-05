package Assignment_11;

public class Question_45 {

	public static void main(String[] args) {
		
		String [] words = {"java", "cable", "red", "vivid", "remedy", "grace"};
		
		shortestWord(words);

	}

	public static void shortestWord(String[] words) {
		
		String shortest = words[0];
		
		for (String arr : words) {
			
			if (arr.length()<words[0].length()) {
				
				shortest=arr;
			}
			
		} System.out.println(shortest);
	
	}

}
