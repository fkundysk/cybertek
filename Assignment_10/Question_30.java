package Assignment_10;

public class Question_30 {

	public static void main(String[] args) {
		
		System.out.println(at3("longword", "foo"));
		System.out.println(at3("blabla", "a"));
	
	}

	public static String at3(String main, String adding) {
		
		String manipulated = ""; 
		
		manipulated = main.substring(0, 3) + adding + main.substring(3);
		
		return manipulated;
	}

}
