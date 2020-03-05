package Assignment_10;

public class Question_29 {

	public static void main(String[] args) {
		
		System.out.println(writeStr("abcd",2));
		System.out.println(writeStr("bla bla bla",3));
	
	}

	private static String writeStr(String word, int i) {
		
		word = word.substring(0, i);
		
		return word;
	}

}
