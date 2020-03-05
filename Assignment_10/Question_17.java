package Assignment_10;

public class Question_17 {

	public static void main(String[] args) {
		
		String alphOrder = "abcdefghijklmnopqrstuvwxyz";
		
		betweenLetters(alphOrder,"a","f");
		betweenLetters(alphOrder,"A","Z");
		betweenLetters(alphOrder,"a","d");
		betweenLetters(alphOrder,"B","O");
	
	}

	public static void betweenLetters(String alphOrder, String first, String last) {
		
		if (alphOrder.contains(first)) {
			
			System.out.println(alphOrder.substring(alphOrder.indexOf(first), alphOrder.indexOf(last)+1));
	
		} else {
			 String alphOrderUpperCase = alphOrder.toUpperCase();
			 System.out.println(alphOrderUpperCase.substring(alphOrderUpperCase.indexOf(first), alphOrderUpperCase.indexOf(last)+1));
		}
		
	}

}
