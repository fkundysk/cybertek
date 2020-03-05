package Assignment_9;

public class Question_9 {

	public static void main(String[] args) {
	
		someChanges("mike_tyson@gmail.com");
		someChanges("barakobama@gmail.com");

	}

	public static void someChanges(String email) {
		
		String name = "";
		String surName = "";
		
		if (email.contains("_")) {
					
			name = email.substring(0, email.indexOf("_"));
			surName = email.substring(email.indexOf("_")+1, email.indexOf("@"));
			email = surName + email.charAt(email.indexOf("_")) + name + email.substring(email.indexOf("@")); 
			System.out.println(email);
				
		} else {
			System.out.println(email);
			
		}
		
		
		
		
	}

}
