package Assignment_10;

public class Question_23 {

	public static void main(String[] args) {
		
		sandwichInside("breadjambread");
		sandwichInside("xxbreadjambreadyy");
		sandwichInside("xxbreadapple");
		sandwichInside("breadbutterbread");

	}

	public static void sandwichInside(String word) {
		String keyWord = "bread";
		int a = word.indexOf(keyWord);
		int b = word.indexOf(keyWord, a+1);
		
		if (b>0) {
			System.out.println(word.substring((a+keyWord.length()), b));
			
		}else {
			System.out.println("nothing");
		}
		
	}

}
