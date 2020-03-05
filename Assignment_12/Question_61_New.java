package Assignment_12;

import java.util.ArrayList;

public class Question_61_New {

	public static void main(String[] args) {
		
		ArrayList<String> words = new ArrayList<String>();
		
		words.add("java");
		words.add("javaScript");
		words.add("Phyton");
		words.add("C++");
		words.add("Pascal");
		
		changeList(words);
 		
		
		

	}

	public static void changeList(ArrayList<String> words) {
		
		
		System.out.print(words.toString() + " -----> ");
		
		words.set(0, "git");
		words.set(0, "gud");
		
		System.out.println(words.toString());
		
	}

}
