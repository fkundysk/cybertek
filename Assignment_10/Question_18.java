package Assignment_10;

public class Question_18 {

	public static void main(String[] args) {
		 
		System.out.println(writeBySeperator("Word","X", 3 ));
		System.out.println(writeBySeperator("This","And", 2 ));
		System.out.println(writeBySeperator("This","And", 1 ));
		
	}

	public static String writeBySeperator(String main, String seperator, int z) {
		String bigString = "";
		
		for (int i=1; i<=z; i++) {
			
			bigString = bigString + main;
			
			if (z>1 && i<z) {
				
				bigString = bigString + seperator;
				
			}
		
		}
		return bigString;
	}

}
