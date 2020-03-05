package Assignment_10;

public class Question_19 {

	public static void main(String[] args) {
		
		System.out.println(FindTimesOfJava("javaxjava"));
		System.out.println(FindTimesOfJava("javaxjavaapplepearjavaegg"));
		System.out.println(FindTimesOfJava("javaxjavabbbbjava"));

	
	}
	public static int FindTimesOfJava(String word) {
		
		int counter = 0;
		
		for (int i=0; i<word.length(); i++) {
			
			if (word.charAt(i)=='j' && word.charAt(i+1)=='a' && word.charAt(i+2)=='v' && word.charAt(i+3)=='a') {
				counter = counter +1;
			}
		}
	
		return counter;
	}

}
