package Assignment_10;

public class Question_28 {

	public static void main(String[] args) {
		
		cleanBadWords("one two three", "two");
		cleanBadWords("foo bar", "foo");
		cleanBadWords("he said bla bla bla", "bla");
		
		
		

	}

	public static void cleanBadWords(String main, String clear) {
		
		if (main.contains(clear)) {
			
			main = main.replace(clear, "");
			
			main = main.trim();
		}
		System.out.println(main);
		
	}

}
