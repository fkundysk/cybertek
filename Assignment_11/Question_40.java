package Assignment_11;

public class Question_40 {

	public static void main(String[] args) {
		
		String [] words = {"aaa", "bbbbb", "whasstupppp", "longg", "jaaaaavvaaaaaaaaaa"};
		String [] words1 = {"aaa", "bbbbbbbbbbbbbbbbbbbbbbbb", "whasstupppp", "longg", "jaaaaavvaaaaaaaaaa"};
		String [] words2 = {"aaaaaaaaaaaaaaaaaaaaa", "bbbbb", "whasstupppp", "longg", "jaaaaavvaaaaaaaaaa"};

		findLargest(words);
		findLargest(words1);
		findLargest(words2);
	}

	public static void findLargest(String[] words) {
		
		int pointer = 0;
		
		int largestWord = words[0].length(); 
		
		for (int i=1; i<words.length; i++) {
			
			if (words[i].length()>largestWord) {
				
				largestWord = words[i].length();
				pointer = i;
			}
		}
		System.out.println(words[pointer]);
	}

}
