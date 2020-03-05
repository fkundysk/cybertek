package Assignment_10;

public class Question_16 {

	public static void main(String[] args) {
		
		 System.out.println(isJava("javaphyton"));
		 System.out.println(isJava("cjavac++"));
		 System.out.println(isJava("c#javaruby"));
		 System.out.println(isJava("javajava"));
		
	}

	public static boolean isJava(String word) {
				
		if ((word.substring(0, 4)).contentEquals("java") || (word.substring(1, 5)).contentEquals("java")) {
			return true;
		} else {
		
		return false;
		}
	}
		
}


