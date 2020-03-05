package Assignment_10;

public class Question_27 {

	public static void main(String[] args) {
		
		coverMe("java methods", "me");
		coverMe("Certified Wooden Spoon", "o");
		coverMe("hello hello", "ello");
		coverMe("apples", "pears");
		
		
	}

	public static void coverMe(String main, String cover) {
		
		if (main.contains(cover)){
			
			main = main.replace(cover, "[" + cover + "]");
		
		} else {
			
			main = "[" + main + "]";
		}
		System.out.println(main);
	}

}
