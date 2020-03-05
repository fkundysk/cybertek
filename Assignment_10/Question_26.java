package Assignment_10;

public class Question_26 {

	public static void main(String[] args) {
		
		
		uniqueChars("java");
		uniqueChars("mama");
		uniqueChars("spoon");
	}

	public static void uniqueChars(String word) {
		
		String uniqueWord="";
		String [] str = new String [word.length()];
		
		for (int i=0; i<word.length();i++) {
			
			str [i] = "" + word.charAt(i);
		
		}
		
		for (int i=0; i<str.length;i++) {
			
			for (int j=str.length-1; j>i; j--) {
				
				if (str[j].equals(str[i]) ) {
					
					str [j]="";
					
				}
			
			} uniqueWord = uniqueWord + str[i];
			
		} System.out.println(uniqueWord);
		
		
	}	
	
}


