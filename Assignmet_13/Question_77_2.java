package Assignmet_13;

public class Question_77_2 {

	public static void main(String[] args) {
		
		String word = "apple";
		String word1 = "Ab,c,de,!$";
		String word2 = "hello world";
		
		
		System.out.println(reverseVowels(word));
		System.out.println(reverseVowels(word1));
		System.out.println(reverseVowels(word2));

	}

	public static String reverseVowels(String str) {
		
		System.out.print(str + " -----> ");
		
		String reverse = "";
		
		String vowels = "aeiou";
		
		String str2 = "";
		
		String [] array = str.split("");
		
		
		
		for(int i=0; i<array.length;i++) {
			
			if (vowels.contains(array[i].toLowerCase())) {
				
				reverse = reverse + array[i];
				
			}
			
		}
		int reverseIndex = (reverse.length()-1);
		
		for(int i=0; i<array.length;i++) {
			
			if (vowels.contains(array[i].toLowerCase())) {
		
				str2 = str2 + reverse.charAt(reverseIndex);
				
				reverseIndex--;
				
			} else {
				
				str2 = str2 + array[i];
			}
			
		}
		
		return str2;	
			
		}
		
	}


