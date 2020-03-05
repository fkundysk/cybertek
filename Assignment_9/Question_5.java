package Assignment_9;

public class Question_5 {

	public static void main(String[] args) {
		
		mergeWords("aok","lol");
		mergeWords("ear","pie");
		mergeWords("java","wow");
	
	}

	public static void mergeWords(String word1, String word2) {
		
		String mergeWord = "";
		
		if (word1.length()==3 && word2.length()==3) {
			
			for (int i=0; i<3; i++){
				
				mergeWord = mergeWord+word1.charAt(i)+word2.charAt(i);
					
			}
			System.out.println(mergeWord);
			
		} else {
			System.out.println("cannot merge");
		}
		
	}

}
