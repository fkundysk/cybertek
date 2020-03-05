package Assignment_12;

import java.util.ArrayList;

public class Question_60_New {

	public static void main(String[] args) {
		
		String [] str1 = {"f", "o", "o"};
		String [] str2 = {"b", "a", "r"};
		
		mergR (str1, str2);
		

	}

	public static void mergR(String[] str1, String[] str2) {
		
		ArrayList<String> mergeStr = new ArrayList<String>();
		
		String mergeR= "";
		
			for (int i=0; i<str1.length; i++) {
			mergeStr.add(str1[i]);
				
			} 
			
			for (int i=0; i<str2.length; i++) {
				mergeStr.add(str2[i]);
					
			} 
			
			for (String arr: mergeStr) {
				
				mergeR = mergeR+arr;
			}
			
			System.out.println(mergeR);
			
		}
	
}
