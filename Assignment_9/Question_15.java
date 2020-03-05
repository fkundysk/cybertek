package Assignment_9;

public class Question_15 {

	public static void main(String[] args) {
	
		IsSameNumber("catdog");
		IsSameNumber("catcat");
		IsSameNumber("catcatdogdog");
		IsSameNumber("cat-cheetah-dog-cat");
		IsSameNumber("cat-cheetah-dog-cat-dog");
	
	}

	public static void IsSameNumber(String word) {
		int countCat = 0;
		int countDog = 0;
		
		for(int i=0; i<word.length()-2; i++) {
			
			if ((word.charAt(i)=='c') && (word.charAt(i+1)=='a') && (word.charAt(i+2)=='t')) {
				countCat = countCat + 1;
					
				}
				
			if ((word.charAt(i)=='d') && (word.charAt(i+1)=='o') && (word.charAt(i+2)=='g')) {
				countDog = countDog + 1;
			}
		}
		
		if ((countCat>0 && countDog>0) && (countCat == countDog)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
	}

}
