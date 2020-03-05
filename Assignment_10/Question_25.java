package Assignment_10;

public class Question_25 {

	public static void main(String[] args) {
		
		mergeString("12345","abcde");
		mergeString("wooden","spoon");
		mergeString("java","selenium");
	

	}

	public static void mergeString(String first, String second) {
		
		String mergeString = "";
			
		if (first.length() >= second.length()) {
			
			for (int i=0; i< second.length(); i++) {
				
				mergeString = mergeString + first.charAt(i) + second.charAt(i);
				
			}
			mergeString = mergeString + first.substring(second.length());
			
		} else {
			
			for (int i=0; i< first.length(); i++) {
				
				mergeString = mergeString + first.charAt(i) + second.charAt(i);
				
			}
			mergeString = mergeString + second.substring(first.length());
		}
		
		System.out.println(mergeString);
	}

}
